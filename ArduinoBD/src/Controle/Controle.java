package Controle;

import Validacao.Validacao;
import modelo.Temperatura;
import DAL.TemperaturaDAO;
import DAL.PrecipitacaoDAO;
import DAL.UmidadeDAO;
import modelo.Estaticos;
import modelo.Precipitacao;
import modelo.Protocolo;
import modelo.Umidade;

public class Controle
{

    private Controle controle;
    private String mensagem;

    public void cadastrarPrecipitacao()
    {
        mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarValorPrecipitacao(Protocolo.precipitacao);
        if (validacao.getMensagem().equals(""))
        {
            PrecipitacaoDAO precipitacaoDAO = new PrecipitacaoDAO();
            Estaticos.precipitacao.setValorPrecipitacao(validacao.getValorPrecipitacao());
            precipitacaoDAO.cadastrarPrecipitacao(Estaticos.precipitacao);
            mensagem = precipitacaoDAO.getMensagem();
        }
        else
        {
            mensagem = validacao.getMensagem();
        }
    }

    public void cadastrarTemperatura()
    {
        mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarValorTemperatura(Protocolo.temperatura);
        if (validacao.getMensagem().equals(""))
        {
            TemperaturaDAO temperaturaDAO = new TemperaturaDAO();
            Estaticos.temperatura.setValorTemperatura(validacao.getValorTemperatura());
            temperaturaDAO.cadastrarTemperatura(Estaticos.temperatura);
            mensagem = temperaturaDAO.getMensagem();
        }
        else
        {
            mensagem = validacao.getMensagem();
        }
    }

    public void cadastrarUmidade()
    {
        mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarValorUmidade(Protocolo.umidade);
        if (validacao.getMensagem().equals(""))
        {
            UmidadeDAO umidadeDAO = new UmidadeDAO();
            Estaticos.umidade.setValorUmidade(validacao.getValorUmidade());
            umidadeDAO.cadastrarUmidade(Estaticos.umidade);
            mensagem = umidadeDAO.getMensagem();
        }
        else
        {
            mensagem = validacao.getMensagem();
        }
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

}
