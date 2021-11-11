package Bean;

import Controle.Controle;
import Modelo.Estaticos;
import Modelo.Umidade;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.view.ViewScoped;

@ManagedBean
@RequestScoped
@ViewScoped
public class UmidadeBean
{
    private double valor;

    public double getValor()
    {
        Controle controle = new Controle();
        
        Umidade umidade = controle.pesquisarUmidade();
        valor = umidade.getValorUmidade();
        
        return valor;
    }

    public void setValor(double valor)
    {
        this.valor = valor;
    }
    

    public UmidadeBean()
    {
    }

}
