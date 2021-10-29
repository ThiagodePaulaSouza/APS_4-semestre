package Validacao;

/**
 *
 * @author MatheusVinícius
 */
import java.util.List;

public class Validacao
{

    private String mensagem;
    private Integer id;
    private Integer valorTemperatura;

    public void validarDadosTemperatura(List<String> dadosTemperatura)
    {
        this.mensagem = "";                                                         //Codigo da Temperatura
//        this.validarValorTemperatura(dadosTemperatura.get(1));                             //Validar Valor da Temperatura
    }

    public void validarDadosUmidade(List<String> dadosUmidade)
    {
        this.mensagem = "";
        this.validarCodUmidade(dadosUmidade.get(0));
        this.validarValorUmidade((dadosUmidade.get(1)));

    }

    public void validarDadosPrecipitacao(List<String> dadosPrecipitacao)
    {
        this.mensagem = "";
        this.validarCodPrecipitacao(dadosPrecipitacao.get(0));
        this.validarValorPrecipitacao(dadosPrecipitacao.get(1));
    }

    public void validarCodTemperatura(String numeroId){
        this.mensagem = "";
        try
        {
            this.id = Integer.parseInt(numeroId);
        }
        catch (Exception e)
        {
            this.mensagem += "ID inválido \n";
        }
    }
    
    public void validarValorTemperatura(Integer valorTemperatura)
    {
        this.mensagem = "";
        try
        {
            this.valorTemperatura = valorTemperatura;
        }
        catch (Exception e)
        {
        }
    }

    public void validarIdUmidade(String umidadeId)
    {
        this.mensagem = "";
        try
        {
            this.id = Integer.parseInt(umidadeId); //ID
        }
        catch (Exception e)
        {
            this.mensagem += "ID inválido \n";
        }
    }

    public void validarCodUmidade(String codigoUmidadeId)
    {
        this.mensagem = "";
        try
        {
            this.id = Integer.parseInt(codigoUmidadeId); //Código Umidade
        }
        catch (Exception e)
        {
            this.mensagem += "Codigo inválido \n";
        }
    }

    public void validarValorUmidade(String valorUmidade)
    {
        if (valorUmidade.length() < 3 || valorUmidade.length() > 16)
        {
            this.mensagem += "O Valor da Umidade deve ter de 3 a 16 digitos \n";
        }
        else
        {
            this.mensagem = "";
        }
    }

    public void validarIdPrecipitacao(String precipitacaoId)
    {
        this.mensagem = "";
        try
        {
            this.id = Integer.parseInt(precipitacaoId); //ID
        }
        catch (Exception e)
        {
            this.mensagem += "ID inválido \n";
        }
    }

    public void validarCodPrecipitacao(String codigoPrecipitacaoId)
    {
        this.mensagem = "";
        try
        {
            this.id = Integer.parseInt(codigoPrecipitacaoId); //Código Umidade
        }
        catch (Exception e)
        {
            this.mensagem += "Codigo inválido \n";
        }
    }

    public void validarValorPrecipitacao(String valorPrecipitacao)
    {
        if (valorPrecipitacao.length() < 3 || valorPrecipitacao.length() > 11)
        {
            this.mensagem += "O Valor da Precipitacao deve ter de 3 a 11 digitos \n";
        }
        else
        {
            this.mensagem = "";
        }
    }

    public String getMensagem()
    {
        return mensagem;
    }

    public Integer getId()
    {
        return id;
    }

    public Integer getValorTemperatura()
    {
        return valorTemperatura;
    }

    public void setValorTemperatura(Integer valorTemperatura)
    {
        this.valorTemperatura = valorTemperatura;
    }
}
