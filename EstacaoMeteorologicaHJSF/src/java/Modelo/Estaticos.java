package Modelo;

/**
 *
 * @author Usuario
 */

import Bean.PrecipitacaoBean;
import Bean.TemperaturaBean;
import Bean.UmidadeBean;
import java.util.ArrayList;
import java.util.List;

public class Estaticos
{
    public static List<PrecipitacaoBean> listaPrecipitacao = new ArrayList<>();
    public static PrecipitacaoBean precipitacao = new PrecipitacaoBean();
    
    public static List<TemperaturaBean> listaTemperatura = new ArrayList<>();
    public static TemperaturaBean temperatura = new TemperaturaBean();
    
    public static List<UmidadeBean> listaUmidade = new ArrayList<>();
    public static UmidadeBean umidade = new UmidadeBean();
}
