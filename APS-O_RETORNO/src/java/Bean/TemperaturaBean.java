package Bean;

import Controle.Controle;
import Modelo.Temperatura;
import java.util.ArrayList;
import java.util.List;
import org.primefaces.model.chart.MeterGaugeChartModel;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.view.ViewScoped;

@ManagedBean
@RequestScoped
@ViewScoped
public class TemperaturaBean
{
    private int valor;
    private final MeterGaugeChartModel model;

    public TemperaturaBean()
    {
        Controle controle = new Controle();
        Temperatura temperatura = controle.pesquisarTemperatura();
        valor = temperatura.getValorTemperatura();
        List<Number> intervals = new ArrayList<Number>()
        {
            {
                add(15);
                add(30);
                add(45);
                add(60);
            }
        };
        model = new MeterGaugeChartModel(valor, intervals);
        model.setTitle("Temperatura");
        model.setSeriesColors("66cc66,93b75f,E7E658,cc6666");
        model.setShowTickLabels(true);
        model.setLabelHeightAdjust(120);
        model.setIntervalOuterRadius(115);
    }
    
    public MeterGaugeChartModel getModel()
    {
        return model;
    }
}