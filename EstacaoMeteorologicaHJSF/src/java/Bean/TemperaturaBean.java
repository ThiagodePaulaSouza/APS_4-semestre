package Bean;

import Controle.Controle;
import Modelo.Estaticos;
import Modelo.Serial;
import Modelo.Temperatura;
import java.util.List;
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
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public int getValor() {
        Serial serial = new Serial();
        serial.iniciaSerial();

        Controle controle = new Controle();
        //FAZER TIMER!!! PARA CADA 1 OU 2 SEGUNDOS
        List<Temperatura> listaTemperatura = controle.pesquisarTemperatura();

        if (listaTemperatura.size() == 0) {
            System.out.println("Não existe registros de temperatura");
            valor = 0;
        }
        if (listaTemperatura.size() == 1) {
            valor = listaTemperatura.get(0).getValorTemperatura();
        }
        if (listaTemperatura.size() > 1) {
            Estaticos.listaTemperatura = listaTemperatura;
            valor = Estaticos.temperatura.getValorTemperatura();
        }

        serial.close();
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public TemperaturaBean() {
    }

}
