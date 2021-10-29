package Controle;

import Validacao.Validacao;
import Modelo.Temperatura;
//import Bean.PrecipitacaoBean;
import DAL.TemperaturaDAO;
//import DAL.PrecipitacaoDAO;
import DAL.UmidadeDAO;
import Modelo.Umidade;
import java.util.List;

public class Controle 
{
    private Controle controle;

    private String mensagem;
    private int temperatura;

    public Temperatura pesquisarTemperatura()
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        TemperaturaDAO temperaturaDao = new TemperaturaDAO();
        Temperatura temperatura = new Temperatura();
        validacao.validarCodTemperatura(temperatura.getCodTemperatura().toString());
        
        if (validacao.getMensagem().equals(""))
        {
            temperatura.setCodTemperatura(validacao.getId());
            temperatura.setValorTemperatura(validacao.getValorTemperatura());
            temperatura = temperaturaDao.pesquisarTemperaturaPorId(temperatura);
            this.mensagem = temperaturaDao.getMensagem();
        }
        else
        {
            this.mensagem = validacao.getMensagem();
        }
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

    public Umidade pesquisarUmidadePorId(String umidadeId)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarIdUmidade(umidadeId);
        Umidade umidade = new Umidade();
        if (validacao.getMensagem().equals(""))
        {
            umidade.setCodUmidade(validacao.getId());
            UmidadeDAO umidadeDAO = new UmidadeDAO();
            umidade = umidadeDAO.pesquisarUmidadePorId(umidade);
            this.mensagem = umidadeDAO.getMensagem();
        }
        else
        {
            this.mensagem = validacao.getMensagem();
        }
        return umidade;
    }

    public String getMensagem()
    {
        return mensagem;
    }

    public void setMensagem(String mensagem)
    {
        this.mensagem = mensagem;
    }

    public Controle getControle()
    {
        return controle;
    }

    public void setControle(Controle controle)
    {
        this.controle = controle;
    }

    public int getTemperatura()
    {
        return temperatura;
    }

    public void setTemperatura(int temperatura)
    {
        this.temperatura = temperatura;
    }

}
