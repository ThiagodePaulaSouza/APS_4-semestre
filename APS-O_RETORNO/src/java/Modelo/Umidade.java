/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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

/**
 *
 * @author mateu
 */
@Entity
@Table(name = "umidade")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Umidade.findAll", query = "SELECT u FROM Umidade u")
    , @NamedQuery(name = "Umidade.findByCodUmidade", query = "SELECT u FROM Umidade u WHERE u.codUmidade = :codUmidade")
    , @NamedQuery(name = "Umidade.findByValorUmidade", query = "SELECT u FROM Umidade u WHERE u.valorUmidade = :valorUmidade")})
public class Umidade implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_umidade")
    private Integer codUmidade;
    @Basic(optional = false)
    @Column(name = "valor_umidade")
    private double valorUmidade;

    public Umidade() {
    }

    public Umidade(Integer codUmidade) {
        this.codUmidade = codUmidade;
    }

    public Umidade(Integer codUmidade, double valorUmidade) {
        this.codUmidade = codUmidade;
        this.valorUmidade = valorUmidade;
    }

    public Integer getCodUmidade() {
        return codUmidade;
    }

    public void setCodUmidade(Integer codUmidade) {
        this.codUmidade = codUmidade;
    }

    public double getValorUmidade() {
        return valorUmidade;
    }

    public void setValorUmidade(double valorUmidade) {
        this.valorUmidade = valorUmidade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codUmidade != null ? codUmidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Umidade)) {
            return false;
        }
        Umidade other = (Umidade) object;
        if ((this.codUmidade == null && other.codUmidade != null) || (this.codUmidade != null && !this.codUmidade.equals(other.codUmidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Umidade[ codUmidade=" + codUmidade + " ]";
    }
    
}
