package Controle;

import Validacao.Validacao;
import Modelo.Temperatura;
//import Bean.PrecipitacaoBean;
import DAL.TemperaturaDAO;
//import DAL.PrecipitacaoDAO;
import DAL.UmidadeDAO;
import Modelo.Protocolo;
import Modelo.Umidade;
import java.util.ArrayList;
import java.util.List;

public class Controle {

    private Controle controle;

    private String mensagem;

    public void cadastrarTemperatura() {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarValorTemperatura(Protocolo.temperatura);
        if (validacao.getMensagem().equals("")) {
            TemperaturaDAO temperaturaDAO = new TemperaturaDAO();
            Temperatura temperatura = new Temperatura();
            temperatura.setValorTemperatura(validacao.getValorTemperatura());
            temperaturaDAO.cadastrarTemperatura(temperatura);
            this.mensagem = temperaturaDAO.getMensagem();
        } else {
            this.mensagem = validacao.getMensagem();
        }
    }

    public List<Temperatura> pesquisarTemperatura(Integer valor) {
        this.mensagem = "";
        Temperatura temperatura = new Temperatura();
        List<Temperatura> listaTemperatura = new ArrayList<>();

        temperatura.setValorTemperatura(valor);

        TemperaturaDAO temperaturaDAO = new TemperaturaDAO();
        listaTemperatura = temperaturaDAO.pesquisarTemperaturaPorValor(temperatura);
        this.mensagem = temperaturaDAO.getMensagem();
        return listaTemperatura;
    }

//    public PrecipitacaoBean pesquisarPrecipitacaoPorId(String precipitacaoId)
//    {
//        this.mensagem = "";
//        Validacao validacao = new Validacao();
//        validacao.validarIdPrecipitacao(precipitacaoId);
//        PrecipitacaoBean precipitacao = new PrecipitacaoBean();
//        if (validacao.getMensagem().equals(""))
//        {
//            precipitacao.setCodPrecipitacao(validacao.getId());
//            PrecipitacaoDAO precipitacaoDAO = new PrecipitacaoDAO();
//            precipitacao = precipitacaoDAO.pesquisarPrecipitacaoPorId(precipitacao);
//            this.mensagem = precipitacaoDAO.getMensagem();
//        }
//        else
//        {
//            this.mensagem = validacao.getMensagem();
//        }
//        return precipitacao;
//    }
    public Umidade pesquisarUmidadePorId(String umidadeId) {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarIdUmidade(umidadeId);
        Umidade umidade = new Umidade();
        if (validacao.getMensagem().equals("")) {
            umidade.setCodUmidade(validacao.getId());
            UmidadeDAO umidadeDAO = new UmidadeDAO();
            umidade = umidadeDAO.pesquisarUmidadePorId(umidade);
            this.mensagem = umidadeDAO.getMensagem();
        } else {
            this.mensagem = validacao.getMensagem();
        }
        return umidade;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Controle getControle() {
        return controle;
    }

    public void setControle(Controle controle) {
        this.controle = controle;
    }

}
