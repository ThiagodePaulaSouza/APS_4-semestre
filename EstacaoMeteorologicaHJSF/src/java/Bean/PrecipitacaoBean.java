package Bean;

import Controle.Controle;
import Modelo.Estaticos;
import Modelo.Serial;
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
//        Serial serial = new Serial();
//        serial.iniciaSerial();
        Controle controle = new Controle();
//        controle.cadastrarPrecipitacao();
        Precipitacao precipitacao = controle.pesquisarPrecipitacaoPorId(1);//Estaticos.precipitacao.getCodPrecipitacao()
//        serial.close();
        valor = precipitacao.getValorPrecipitacao();
        List<Number> intervals = new ArrayList<Number>()
        {
            {
                add(500);
                add(1000);
                add(1500);
                add(2000);
            }
        };
        model = new MeterGaugeChartModel(valor, intervals);
        model.setTitle("Precipitação");
        model.setSeriesColors("66cc66,93b75f,E7E658,cc6666");
        model.setShowTickLabels(true);
        model.setLabelHeightAdjust(100);
        model.setIntervalOuterRadius(130);
    }

    public MeterGaugeChartModel getModel()
    {
        return model;
    }
}
