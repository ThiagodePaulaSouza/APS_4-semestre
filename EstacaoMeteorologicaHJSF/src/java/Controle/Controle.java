package Controle;

import Validacao.Validacao;
import Bean.TemperaturaBean;
//import Bean.PrecipitacaoBean;
import DAL.TemperaturaDAO;
//import DAL.PrecipitacaoDAO;
import DAL.UmidadeDAO;
import Bean.UmidadeBean;
import java.util.List;

public class Controle 
{
    private Controle controle;

    private String mensagem;
    private int temperatura;

    public int pesquisarTemperaturaPorId()
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        TemperaturaDAO temperaturaDao = new TemperaturaDAO();
        TemperaturaBean temperaturaBean = new TemperaturaBean();
        System.out.println("ENTROU DENTRO DE PESQUISAR T P I");
        //----------------------------COM ERRO ---------------------------------
        validacao.validarValorTemperatura(temperaturaDao.pesquisarTemperatura());
        
        if (validacao.getMensagem().equals(""))
        {
            temperaturaBean.setValorTemperatura(validacao.getValorTemperatura());
            this.mensagem = temperaturaDao.getMensagem();
            return 42;
        }
        else
        {
            this.mensagem = validacao.getMensagem();
            return 100;
        }
        //----------------------------COM ERRO ---------------------------------
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
