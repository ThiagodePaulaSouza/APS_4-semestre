package Controle;

import Validacao.Validacao;
import Modelo.Temperatura;
//import Bean.PrecipitacaoBean;
import DAL.TemperaturaDAO;
//import DAL.PrecipitacaoDAO;
import DAL.UmidadeDAO;
import Modelo.Estaticos;
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
            Estaticos.temperatura.setValorTemperatura(validacao.getValorTemperatura());
            temperaturaDAO.cadastrarTemperatura(Estaticos.temperatura);
            this.mensagem = temperaturaDAO.getMensagem();
        } else {
            this.mensagem = validacao.getMensagem();
        }
    }

    public Temperatura pesquisarTemperatura(Integer numeroId) {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarCodTemperatura(numeroId);
        Temperatura temperatura = new Temperatura();
        if (validacao.getMensagem().equals("")) {
            
        }
        temperatura.setCodTemperatura(validacao.getCodTemperatura());

        TemperaturaDAO temperaturaDAO = new TemperaturaDAO();
        temperatura = temperaturaDAO.pesquisarTemperaturaPorId(temperatura);
        this.mensagem = temperaturaDAO.getMensagem();
        return temperatura;
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
            //umidade.setCodUmidade(validacao.getId());
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
