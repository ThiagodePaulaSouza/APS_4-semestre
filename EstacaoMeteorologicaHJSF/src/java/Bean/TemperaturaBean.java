package Bean;

import Controle.Controle;
import Modelo.Estaticos;
import Modelo.Serial;
import Modelo.Temperatura;
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
public class TemperaturaBean
{
    private int valor;
    private final MeterGaugeChartModel model;

    public TemperaturaBean()
    {
//        Serial serial = new Serial();
//        serial.iniciaSerial();
        Controle controle = new Controle();
<<<<<<< HEAD
//        controle.cadastrarTemperatura();
        Temperatura temperatura = controle.pesquisarTemperaturaPorId(1);//Estaticos.temperatura.getCodTemperatura()
//        serial.close();
=======
        
        controle.cadastrarTemperatura();
        Temperatura temperatura = controle.pesquisarTemperaturaPorId(Estaticos.temperatura.getCodTemperatura());
>>>>>>> c68b959754739abf2a6b9c8174396fcf577b16bc
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
        model.setLabelHeightAdjust(100);
        model.setIntervalOuterRadius(130);
    }
    
    public MeterGaugeChartModel getModel()
    {
        return model;
    }
}
