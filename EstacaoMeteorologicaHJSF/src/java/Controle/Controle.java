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

public class Controle
{

    private Controle controle;

    private String mensagem;

    
    public void cadastrarTemperatura()
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarValorTemperatura(Integer.parseInt(Protocolo.temperatura));
        if (validacao.getMensagem().equals(""))
        {
            TemperaturaDAO temperaturaDAO = new TemperaturaDAO();
            Temperatura temperatura = new Temperatura();
            temperatura.setValorTemperatura(validacao.getValorTemperatura());
            temperaturaDAO.cadastrarTemperatura(temperatura);
            this.mensagem = temperaturaDAO.getMensagem();
        }
        else
        {
            this.mensagem = validacao.getMensagem();
        }
    }

    public List<Temperatura> pesquisarTemperatura()
    {
        cadastrarTemperatura();
        this.mensagem = "";
        Validacao validacao = new Validacao();
        Temperatura temperatura = new Temperatura();
        validacao.validarValorTemperatura(temperatura.getValorTemperatura());
        List<Temperatura> listaTemperatura = new ArrayList<>();

        if (validacao.getMensagem().equals(""))
        {
            TemperaturaDAO temperaturaDAO = new TemperaturaDAO();
            //temperatura.setCodTemperatura(validacao.getId());
            temperatura.setValorTemperatura(validacao.getValorTemperatura());
            listaTemperatura = temperaturaDAO.pesquisarTemperaturaPorId(temperatura);
            this.mensagem = temperaturaDAO.getMensagem();
        }
        else
        {
            this.mensagem = validacao.getMensagem();
        }
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

}
