package Controle;

import Modelo.Temperatura;
import DAL.TemperaturaDAO;
import DAL.PrecipitacaoDAO;
import DAL.UmidadeDAO;
import Modelo.Precipitacao;
import Modelo.Umidade;

public class Controle
{

    private Controle controle;
    private String mensagem;

    public Temperatura pesquisarTemperatura()
    {
        this.mensagem = "";
        Temperatura temperatura = new Temperatura();
        TemperaturaDAO temperaturaDAO = new TemperaturaDAO();
        temperatura = temperaturaDAO.pesquisarTemperatura();
        this.mensagem = temperaturaDAO.getMensagem();

        return temperatura;
    }

    public Precipitacao pesquisarPrecipitacao()
    {
        this.mensagem = "";
        Precipitacao precipitacao = new Precipitacao();
        PrecipitacaoDAO precipitacaoDAO = new PrecipitacaoDAO();
        precipitacao = precipitacaoDAO.pesquisarPrecipitacaoPorId();
        this.mensagem = precipitacaoDAO.getMensagem();
        return precipitacao;
    }

    public Umidade pesquisarUmidade()
    {
        this.mensagem = "";
        Umidade umidade = new Umidade();
        UmidadeDAO umidadeDAO = new UmidadeDAO();
        umidade = umidadeDAO.pesquisarUmidadePorId();
        this.mensagem = umidadeDAO.getMensagem();
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

}
