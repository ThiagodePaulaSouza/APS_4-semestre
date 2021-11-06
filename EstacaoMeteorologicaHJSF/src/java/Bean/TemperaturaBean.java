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

        controle.cadastrarTemperatura();
        Temperatura valor = controle.pesquisarTemperatura(Estaticos.temperatura.getCodTemperatura());
        
        serial.close();
        return valor.getValorTemperatura();
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public TemperaturaBean() {
    }

}
