/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author fernandocerveira
 */
@Entity
public class Diretor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomeDoDiretor;
    private String cpfDoDiretor;
    private String endereçoDoDiretor;
    private String telefoneDoDiretor;
    private String dataNascimentoDoDiretor;
    @Enumerated(EnumType.STRING)
    private Cargos cargo;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDoDiretor() {
        return nomeDoDiretor;
    }

    public void setNomeDoDiretor(String nomeDoDiretor) {
        this.nomeDoDiretor = nomeDoDiretor;
    }

    public String getCpfDoDiretor() {
        return cpfDoDiretor;
    }

    public void setCpfDoDiretor(String cpfDoDiretor) {
        this.cpfDoDiretor = cpfDoDiretor;
    }

    public String getEndereçoDoDiretor() {
        return endereçoDoDiretor;
    }

    public void setEndereçoDoDiretor(String endereçoDoDiretor) {
        this.endereçoDoDiretor = endereçoDoDiretor;
    }

    public String getTelefoneDoDiretor() {
        return telefoneDoDiretor;
    }

    public void setTelefoneDoDiretor(String telefoneDoDiretor) {
        this.telefoneDoDiretor = telefoneDoDiretor;
    }

    public String getDataNascimentoDoDiretor() {
        return dataNascimentoDoDiretor;
    }

    public void setDataNascimentoDoDiretor(String dataNascimentoDoDiretor) {
        this.dataNascimentoDoDiretor = dataNascimentoDoDiretor;
    }
    
    public Cargos getCargo() {
        return cargo;
    }

    public void setCargo(Cargos cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diretor)) {
            return false;
        }
        Diretor other = (Diretor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Diretor[ id=" + id + " ]";
    }
    
}
