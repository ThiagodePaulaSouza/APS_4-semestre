package Controle;

import Validacao.Validacao;
import Modelo.entidade.Temperatura;
import Modelo.entidade.Precipitacao;
import DAL.TemperaturaDAO;
import DAL.PrecipitacaoDAO;
import DAL.UmidadeDAO;
import Modelo.entidade.Umidade;
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
//            Temperatura temperatura = new Temperatura();
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
//            Temperatura temperatura = new Temperatura();
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
    public Temperatura pesquisarTemperaturaPorId(String temperaturaId)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarIdTemperatura(temperaturaId);
        Temperatura temperatura = new Temperatura();
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
//            Precipitacao precipitacao = new Precipitacao();
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
//            Precipitacao precipitacao = new Precipitacao();
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
    public Precipitacao pesquisarPrecipitacaoPorId(String precipitacaoId)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarIdPrecipitacao(precipitacaoId);
        Precipitacao precipitacao = new Precipitacao();
        if (validacao.getMensagem().equals(""))
        {
            precipitacao.setCodPrecipitacao(validacao.getId());
            PrecipitacaoDAO precipitacaoDAO = new PrecipitacaoDAO();
            precipitacao = precipitacaoDAO.pesquisarPrecipitacaoPorId(precipitacao);
            this.mensagem = precipitacaoDAO.getMensagem();
        }
        else
        {
            this.mensagem = validacao.getMensagem();
        }
        return precipitacao;
    }

//    public void cadastrarPrecipitacao(List<String> dadosPrecipitacao) // AQUI É UMIDADE EU ERREI ...
//    {
//        this.mensagem = "";
//        Validacao validacao = new Validacao();
//        validacao.validarDadosPrecipitacao(dadosPrecipitacao);
//        if (validacao.getMensagem().equals(""))
//        {
//            Precipitacao precipitacao = new Precipitacao();
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
//            Precipitacao precipitacao = new Precipitacao();
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

}
