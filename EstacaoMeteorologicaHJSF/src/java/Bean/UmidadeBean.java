package Bean;

import Controle.Controle;
import Modelo.Umidade;
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
public class UmidadeBean
{

    private Integer cod;
    private int valor;

    public Integer getCod()
    {
        return cod;
    }

    public void setCod(Integer cod)
    {
        this.cod = cod;
    }

    public int getValor()
    {
        
        return valor;
    }

    public void setValor(int valor)
    {
        
        this.valor = valor;
    }

    public UmidadeBean()
    {
    }

}
