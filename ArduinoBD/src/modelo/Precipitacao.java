package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "precipitacao")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Precipitacao.findAll", query = "SELECT p FROM Precipitacao p")
    , @NamedQuery(name = "Precipitacao.findByCodPrecipitacao", query = "SELECT p FROM Precipitacao p WHERE p.codPrecipitacao = :codPrecipitacao")
    , @NamedQuery(name = "Precipitacao.findByValorPrecipitacao", query = "SELECT p FROM Precipitacao p WHERE p.valorPrecipitacao = :valorPrecipitacao")
})
public class Precipitacao implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_precipitacao")
    private Integer codPrecipitacao;
    @Basic(optional = false)
    @Column(name = "valor_precipitacao")
    private int valorPrecipitacao;

    public Precipitacao()
    {
    }

    public Precipitacao(Integer codPrecipitacao)
    {
        this.codPrecipitacao = codPrecipitacao;
    }

    public Precipitacao(Integer codPrecipitacao, int valorPrecipitacao)
    {
        this.codPrecipitacao = codPrecipitacao;
        this.valorPrecipitacao = valorPrecipitacao;
    }

    public Integer getCodPrecipitacao()
    {
        return codPrecipitacao;
    }

    public void setCodPrecipitacao(Integer codPrecipitacao)
    {
        this.codPrecipitacao = codPrecipitacao;
    }

    public int getValorPrecipitacao()
    {
        return valorPrecipitacao;
    }

    public void setValorPrecipitacao(int valorPrecipitacao)
    {
        this.valorPrecipitacao = valorPrecipitacao;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (codPrecipitacao != null ? codPrecipitacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Precipitacao))
        {
            return false;
        }
        Precipitacao other = (Precipitacao) object;
        if ((this.codPrecipitacao == null && other.codPrecipitacao != null) || (this.codPrecipitacao != null && !this.codPrecipitacao.equals(other.codPrecipitacao)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "modelo.Precipitacao[ codPrecipitacao=" + codPrecipitacao + " ]";
    }
    
}
