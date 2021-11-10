package Bean;

import Controle.Controle;
import Modelo.Estaticos;
import Modelo.Serial;
import Modelo.Umidade;
import java.util.ArrayList;
import java.util.List;
import org.primefaces.model.chart.MeterGaugeChartModel;
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

    private double valor;
    private final MeterGaugeChartModel model;

    public UmidadeBean()
    {
//        Serial serial = new Serial();
//        serial.iniciaSerial();
        Controle controle = new Controle();
//        controle.cadastrarUmidade();
        Umidade umidade = controle.pesquisarUmidadePorId(1);//Estaticos.umidade.getCodUmidade()
//        serial.close();
        valor = umidade.getValorUmidade();
        
        List<Number> intervals = new ArrayList<Number>()
        {
            {
                add(37);
                add(75);
                add(112);
                add(150);
            }
        };
        model = new MeterGaugeChartModel(valor, intervals);
        model.setTitle("Umidade");
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
