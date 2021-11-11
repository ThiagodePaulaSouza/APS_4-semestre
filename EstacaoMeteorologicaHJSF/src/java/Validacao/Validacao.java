package Validacao;

public class Validacao
{

    private String mensagem;
    private Integer codTemperatura;
    private Integer codUmidade;
    private Integer codPrecipitacao;

    public void validarCodTemperatura(Integer codTemperatura)
    {
        this.mensagem = "";
        try
        {
            this.codTemperatura = codTemperatura;
        }
        catch (Exception e)
        {
            this.mensagem += "Codigo inválido \n";
        }
    }

    public void validarCodUmidade(Integer codUmidade)
    {
        this.mensagem = "";
        try
        {
            this.codUmidade = codUmidade;
        }
        catch (Exception e)
        {
            this.mensagem += "Codigo inválido \n";
        }
    }

    public void validarCodPrecipitacao(Integer codPrecipitacao)
    {
        this.mensagem = "";
        try
        {
            this.codPrecipitacao = codPrecipitacao;
        }
        catch (Exception e)
        {
            this.mensagem += "Codigo inválido \n";
        }
    }

    public String getMensagem()
    {
        return mensagem;
    }

    public Integer getCodTemperatura()
    {
        return codTemperatura;
    }

    public void setCodTemperatura(Integer codTemperatura)
    {
        this.codTemperatura = codTemperatura;
    }

    public Integer getCodUmidade()
    {
        return codUmidade;
    }

    public void setCodUmidade(Integer codUmidade)
    {
        this.codUmidade = codUmidade;
    }

    public Integer getCodPrecipitacao()
    {
        return codPrecipitacao;
    }

    public void setCodPrecipitacao(Integer codPrecipitacao)
    {
        this.codPrecipitacao = codPrecipitacao;
    }
}
