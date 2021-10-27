package Controle;

import Validacao.Validacao;
import Bean.TemperaturaBean;
import Bean.PrecipitacaoBean;
import DAL.TemperaturaDAO;
import DAL.PrecipitacaoDAO;
import DAL.UmidadeDAO;
import Bean.UmidadeBean;
import java.util.List;

public class Controle
{

    private String mensagem;

//    public void cadastrarTemperatura(List<String> dadosTemperatura)
//    {
//        this.mensagem = "";
//        Validacao validacao = new Validacao();
//        validacao.validarDadosTemperatura(dadosTemperatura);
//        if (validacao.getMensagem().equals(""))
//        {
//            TemperaturaBean temperatura = new TemperaturaBean();
//            temperatura.setCodTemperatura(validacao.getId());
//            temperatura.setValorTemperatura(Integer.parseInt(dadosTemperatura.get(1)));
//            TemperaturaDAO temperaturaDAO = new TemperaturaDAO();
//            temperaturaDAO.cadastrarTemperatura(temperatura);
//            this.mensagem = temperaturaDAO.getMensagem();
//        }
//        else
//        {
//            this.mensagem = validacao.getMensagem();
//        }
//    }
//    
//    public void editarTemperatura(List<String> dadosTemperatura)
//    {
//        this.mensagem = "";
//        Validacao validacao = new Validacao();
//        validacao.validarDadosTemperatura(dadosTemperatura);
//        if (validacao.getMensagem().equals(""))
//        {
//            TemperaturaBean temperatura = new TemperaturaBean();
//            temperatura.setCodTemperatura(validacao.getId());
//            temperatura.setValorTemperatura(Integer.parseInt(dadosTemperatura.get(1)));
//            TemperaturaDAO temperaturaDAO = new TemperaturaDAO();
//            temperaturaDAO.editarTemperatura(temperatura);
//            this.mensagem = temperaturaDAO.getMensagem();
//        }
//        else
//        {
//            this.mensagem = validacao.getMensagem();
//        }
    public TemperaturaBean pesquisarTemperaturaPorId(String temperaturaId)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarIdTemperatura(temperaturaId);
        TemperaturaBean temperatura = new TemperaturaBean();
        if (validacao.getMensagem().equals(""))
        {
            temperatura.setCodTemperatura(validacao.getId());
            TemperaturaDAO temperaturaDAO = new TemperaturaDAO();
            temperatura = temperaturaDAO.pesquisarTemperaturaPorId(temperatura);
            this.mensagem = temperaturaDAO.getMensagem();
        }
        else
        {
            this.mensagem = validacao.getMensagem();
        }
        return temperatura;
    }

//        public void cadastrarPrecipitacao(List<String> dadosPrecipitacao)
//    {
//        this.mensagem = "";
//        Validacao validacao = new Validacao();
//        validacao.validarDadosPrecipitacao(dadosPrecipitacao);
//        if (validacao.getMensagem().equals(""))
//        {
//            PrecipitacaoBean precipitacao = new PrecipitacaoBean();
//            precipitacao.setCodPrecipitacao(validacao.getId());
//            precipitacao.setValorPrecipitacao(Double.parseDouble(dadosPrecipitacao.get(1)));
//            PrecipitacaoDAO precipitacaoDAO = new PrecipitacaoDAO();
//            precipitacaoDAO.cadastrarPrecipitacao(precipitacao);
//            this.mensagem = precipitacaoDAO.getMensagem();
//        }
//        else
//        {
//            this.mensagem = validacao.getMensagem();
//        }
//    }
//        
//    public void editarPrecipitacao(List<String> dadosPrecipitacao)
//    {
//        this.mensagem = "";
//        Validacao validacao = new Validacao();
//        validacao.validarDadosPrecipitacao(dadosPrecipitacao);
//        if (validacao.getMensagem().equals(""))
//        {
//            PrecipitacaoBean precipitacao = new PrecipitacaoBean();
//            precipitacao.setCodPrecipitacao(validacao.getId());
//            precipitacao.setValorPrecipitacao(Double.parseDouble(dadosPrecipitacao.get(1)));
//            PrecipitacaoDAO  precipitacaoDAO = new  PrecipitacaoDAO();
//            precipitacaoDAO.editarPrecipitacao(precipitacao);
//            this.mensagem = precipitacaoDAO.getMensagem();
//        }
//        else
//        {
//            this.mensagem = validacao.getMensagem();
//        }
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

//    public void cadastrarPrecipitacao(List<String> dadosPrecipitacao) // AQUI É UMIDADE EU ERREI ...
//    {
//        this.mensagem = "";
//        Validacao validacao = new Validacao();
//        validacao.validarDadosPrecipitacao(dadosPrecipitacao);
//        if (validacao.getMensagem().equals(""))
//        {
//            PrecipitacaoBean precipitacao = new PrecipitacaoBean();
//            precipitacao.setCodPrecipitacao(validacao.getId());
//            precipitacao.setValorPrecipitacao(Integer.parseInt(dadosPrecipitacao.get(1)));
//            PrecipitacaoDAO precipitacaoDAO = new PrecipitacaoDAO();
//            PrecipitacaoDAO.cadastrarPrecipitacao(precipitacao);
//            this.mensagem = precipitacaoDAO.getMensagem();
//        }
//        else
//        {
//            this.mensagem = validacao.getMensagem();
//        }
//    }
//
//    public void editarPrecipitacao(List<String> dadosPrecipitacao) // AQUI É UMIDADE EU ERREI ...
//    {
//        this.mensagem = "";
//        Validacao validacao = new Validacao();
//        validacao.validarDadosPrecipitacao(dadosPrecipitacao);
//        if (validacao.getMensagem().equals(""))
//        {
//            PrecipitacaoBean precipitacao = new PrecipitacaoBean();
//            precipitacao.setCodPrecipitacao(validacao.getId());
//            precipitacao.setValorPrecipitacao(Integer.parseInt(dadosPrecipitacao.get(1)));
//            PrecipitacaoDAO precipitacaoDAO = new PrecipitacaoDAO();
//            PrecipitacaoDAO.editarPrecipitacao(precipitacao);
//            this.mensagem = precipitacaoDAO.getMensagem();
//        }
//        else
//        {
//            this.mensagem = validacao.getMensagem();
//        }
    public UmidadeBean pesquisarUmidadePorId(String umidadeId)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarIdUmidade(umidadeId);
        UmidadeBean umidade = new UmidadeBean();
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

}
