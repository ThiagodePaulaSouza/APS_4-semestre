package Validacao;

public class Validacao
{

    private String mensagem;
    private Integer codTemperatura;
    private Integer codUmidade;
    private Integer codPrecipitacao;
    private Integer valorTemperatura;
    private Double valorUmidade;
    private Integer valorPrecipitacao;

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

    public void validarValorUmidade(String valorUmidade)
    {
        this.mensagem = "";
        try
        {
            this.valorUmidade = Double.parseDouble(valorUmidade);

        }
        catch (Exception e)
        {
            this.mensagem = "Valor de Umidade Inválido";
        }
    }

    public void validarValorTemperatura(String valorTemperatura)
    {
        this.mensagem = "";
        try
        {
            this.valorTemperatura = Integer.parseInt(valorTemperatura);
        }
        catch (Exception e)
        {
            this.mensagem = "Valor de Temperatura Inválido";
        }
    }

    public void validarValorPrecipitacao(String valorPrecipitacao)
    {
        this.mensagem = "";
        try
        {
            this.valorPrecipitacao = Integer.parseInt(valorPrecipitacao);
        }
        catch (Exception e)
        {
            this.mensagem = "Valor de Precipitacao Inválido";
        }
    }

    public String getMensagem()
    {
        return mensagem;
    }

    public Integer getValorTemperatura()
    {
        return valorTemperatura;
    }

    public void setValorTemperatura(Integer valorTemperatura)
    {
        this.valorTemperatura = valorTemperatura;
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

    public Double getValorUmidade()
    {
        return valorUmidade;
    }

    public void setValorUmidade(Double valorUmidade)
    {
        this.valorUmidade = valorUmidade;
    }

    public Integer getValorPrecipitacao()
    {
        return valorPrecipitacao;
    }

    public void setValorPrecipitacao(Integer valorPrecipitacao)
    {
        this.valorPrecipitacao = valorPrecipitacao;
    }
}
