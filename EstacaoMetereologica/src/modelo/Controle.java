package Modelo;

import DAL.TemperaturaDAO;
import DAL.UmidadeDAO;
import DAL.PrecipitacaoAtmosfericaDAO;
import java.util.List;


public class Controle
{
    public String mensagem;
    
    public void cadastrarTemperatura(List<String> dadosTemperatura)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarDadosPessoa(dadosTemperatura);
        if (validacao.getMensagem().equals(""))
        {
            Temperatura temperatura = new Temperatura();
            Temperatura.setId(validacao.getId());
            temperatura.setRegiao(dadosTemperatura.get(1));
            temperatura.setCelsius(dadosTemperatura.get(2));
            temperatura.setFahreint(dadosTemperatura.get(3));
            Temperatura temperaturaDAO = new TemperaturaDAO();
            temperaturaDAO.cadastrarTemperatura(temperatura);
            this.mensagem = temperaturaDAO.getMensagem();
        }
        else
        {
            this.mensagem = validacao.getMensagem();
        }
    }
    
    public void editarTemperatura(List<String> dadosTemperatura)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarDadosTemperatura(dadosTemperatura);
        if (validacao.getMensagem().equals(""))
        {
            Temperatura temperatura = new Temperatura();
            temperatura.setId(validacao.getId());
            temperatura.setRegiao(dadosTemperatura.get(1));
            temperatura.setCelsius(dadosTemperatura.get(2));
            temperatura.setFahreint(dadosTemperatura.get(3));
            TemperaturaDAO  temperaturaDAO = new  TemperaturaDAO();
            temperaturaDAO.editarPessoa(temperatura);
            this.mensagem = temperaturaDAO.getMensagem();
        }
        else
        {
            this.mensagem = validacao.getMensagem();
        }
    
        
    }
     
    public void excluirTemperaturaCelsius(List<String> dadosPessoa)
    {
        
    }
       public void excluirTemperaturaFahreint(List<String> dadosPessoa)
    {
        
    }
            
    public Temperatura pesquisarTemperaturaPorId(String numeroId)
    {
        this.mensagem ="";
        Validacao validacao = new Validacao();
        validacao.validarIdTemperatura(numeroId);
        Temperatura temperatura = new Temperatura();
        if (validacao.getMensagem().equals(""))
        {
            temperatura.setId(validacao.getId());
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
            
    public List<Temperatura> pesquisarTemperaturaPorCelsius(String nome)
    {
        return null;
    }

        public List<Temperatura> pesquisarTemperaturaPorFahreint(String nome)
    {
        return null;
    }

        public void cadastrarUmidade(List<String> dadosUmidade)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarDadosUmidade(dadosUmidade);
        if (validacao.getMensagem().equals(""))
        {
            Umidade umidade = new Umidade();
            umidade.setId(validacao.getId());
            umidade.setHigrometria(dadosUmidade.get(1));
            UmidadeDAO umidadeDAO = new UmidadeDAO();
            umidadeDAO.cadastrarUmidade(umidade);
            this.mensagem = umidadeDAO.getMensagem();
        }
        else
        {
            this.mensagem = validacao.getMensagem();
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

    
}
