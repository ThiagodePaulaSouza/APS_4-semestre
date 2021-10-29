package Bean;

import Controle.Controle;
import Modelo.Temperatura;
import java.util.Timer;
import java.util.TimerTask;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.view.ViewScoped;

/**
 *
 * @author 55159
 */
@ManagedBean
@RequestScoped
@ViewScoped
public class TemperaturaBean {

    private Integer cod;
    private int valor;

    public Integer getCod() {
//        Serial serial = new Serial();
//        if (serial.iniciaSerial())
//        {
//            
//        }
//        serial.close();
        /*Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {

            }
        };timer.schedule(task, 0, 1000);*/

        Controle controle = new Controle();
        Temperatura temperatura = controle.pesquisarTemperatura();
        cod = temperatura.getCodTemperatura();

        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public int getValor() {

//        Serial serial = new Serial();
//        if (serial.iniciaSerial())
//        {
//            
//        }
//        serial.close();
        /*Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {

            }
        };
        timer.schedule(task, 0, 1000);*/

        Controle controle = new Controle();
        Temperatura temperatura = controle.pesquisarTemperatura();
        valor = temperatura.getValorTemperatura();

        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public TemperaturaBean() {
    }

}
