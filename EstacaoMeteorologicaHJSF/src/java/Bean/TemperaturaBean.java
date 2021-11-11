package Bean;

import Controle.Controle;
import Modelo.Temperatura;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.view.ViewScoped;

@ManagedBean
@RequestScoped
@ViewScoped
public class TemperaturaBean
{
    private int valor;

    public int getValor()
    {
        Controle controle = new Controle();
        
        Temperatura temperatura = controle.pesquisarTemperatura();
        valor = temperatura.getValorTemperatura();

        return valor;

    }

    public TemperaturaBean()
    {
    }

}
