package Bean;

import Controle.Controle;
import Modelo.Serial;
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
public class TemperaturaBean
{

    private Integer cod;
    private int valor;

    public Integer getCod()
    {
        Serial serial = new Serial();
        if (serial.iniciaSerial())
        {
            Timer timer = new Timer();
            TimerTask task = new TimerTask()
            {
                @Override
                public void run()
                {
                    Controle controle = new Controle();
                    Temperatura temperatura = controle.pesquisarTemperatura();
                    cod = temperatura.getCodTemperatura();
                }
            };
            timer.schedule(task, 0, 1000);
        }
        serial.close();

        return cod;
    }

    public void setCod(Integer cod)
    {
        this.cod = cod;
    }

    public int getValor()
    {

        Serial serial = new Serial();
        if (serial.iniciaSerial())
        {
            Timer timer = new Timer();
            TimerTask task = new TimerTask()
            {
                @Override
                public void run()
                {
                    Controle controle = new Controle();
                    Temperatura temperatura = controle.pesquisarTemperatura();
                    valor = temperatura.getValorTemperatura();
                }
            };
            timer.schedule(task, 0, 1000);
        }
        serial.close();

        return valor;
    }

    public void setValor(int valor)
    {
        this.valor = valor;
    }

    public TemperaturaBean()
    {
    }

}
