package Bean;

import Controle.Controle;
import Modelo.Precipitacao;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.view.ViewScoped;

@ManagedBean
@RequestScoped
@ViewScoped
public class PrecipitacaoBean
{
    private int valor;

    public int getValor()
    {
        Controle controle = new Controle();
        
        Precipitacao precipitacao = controle.pesquisarPrecipitacao();
        valor = precipitacao.getValorPrecipitacao();
        
        return valor;
    }

    public PrecipitacaoBean()
    {
    }

}
