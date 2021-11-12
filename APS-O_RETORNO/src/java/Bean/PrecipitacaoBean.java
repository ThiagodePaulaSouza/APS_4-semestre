package Bean;

import Controle.Controle;
import Modelo.Precipitacao;
import java.util.ArrayList;
import java.util.List;
import org.primefaces.model.chart.MeterGaugeChartModel;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.view.ViewScoped;

@ManagedBean
@RequestScoped
@ViewScoped
public class PrecipitacaoBean
{
    private int valor;
    private final MeterGaugeChartModel model;

    public PrecipitacaoBean()
    {
        Controle controle = new Controle();
        Precipitacao precipitacao = controle.pesquisarPrecipitacao();
        valor = precipitacao.getValorPrecipitacao();
        List<Number> intervals = new ArrayList<Number>()
        {
            {
                add(250);
                add(750);
                add(1000);
                add(1500);
            }
        };
        model = new MeterGaugeChartModel(valor, intervals);
        model.setTitle("Precipitação");
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