package Bean;

import Controle.Controle;
import Modelo.Estaticos;
import Modelo.Precipitacao;
import Modelo.Serial;
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
public class PrecipitacaoBean {

    private Integer cod;
    private int valor;

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public int getValor() {
        Serial serial = new Serial();
        serial.iniciaSerial();

        Controle controle = new Controle();
        controle.cadastrarPrecipitacao();
        Precipitacao precipitacao = controle.pesquisarPrecipitacaoPorId(Estaticos.precipitacao.getCodPrecipitacao());
        valor = precipitacao.getValorPrecipitacao();

        serial.close();
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public PrecipitacaoBean() {
    }

}
