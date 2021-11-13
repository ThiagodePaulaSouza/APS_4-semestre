package Bean;

import Controle.Controle;
import Modelo.Umidade;
import java.util.ArrayList;
import java.util.List;
import org.primefaces.model.chart.MeterGaugeChartModel;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.view.ViewScoped;

@ManagedBean
@RequestScoped
@ViewScoped
public class UmidadeBean
{
    private double valor;
    private String mensagem;

    private final MeterGaugeChartModel model;

    public UmidadeBean()
    {
        Controle controle = new Controle();
        Umidade umidade = controle.pesquisarUmidade();
        this.mensagem = controle.getMensagem();
        this.valor = umidade.getValorUmidade();
        List<Number> intervals = new ArrayList<Number>()
        {
            {
                add(20);
                add(50);
                add(70);
                add(100);
            }
        };
        model = new MeterGaugeChartModel(this.valor, intervals);
        model.setTitle("Umidade");
        model.setSeriesColors("66cc66,93b75f,E7E658,cc6666");
        model.setShowTickLabels(true);
        model.setLabelHeightAdjust(120);
        model.setIntervalOuterRadius(115);
    }

    public MeterGaugeChartModel getModel()
    {
        return model;
    }
    
    public double getValor()
    {
        return valor;
    }

    public String getMensagem()
    {
        return mensagem;
    }
}