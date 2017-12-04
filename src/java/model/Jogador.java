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
public class Jogador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int numeroDoJogador;
    private String nomeDoJogador;
    private String cpfDoJogador;
    private String endereçoDoJogador;
    private String telefoneDoJogador;
    private String dataNascimentoDoJogador;
    @Enumerated(EnumType.STRING)
    private Posicoes posicao;
    private boolean inscritoLIFFA;
    private boolean inscritoLNFA;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumeroDoJogador() {
        return numeroDoJogador;
    }

    public void setNumeroDoJogador(int numeroDoJogador) {
        this.numeroDoJogador = numeroDoJogador;
    }
    
    public String getNomeDoJogador() {
        return nomeDoJogador;
    }

    public void setNomeDoJogador(String nomeDoJogador) {
        this.nomeDoJogador = nomeDoJogador;
    }

    public String getCpfDoJogador() {
        return cpfDoJogador;
    }

    public void setCpfDoJogador(String cpfDoJogador) {
        this.cpfDoJogador = cpfDoJogador;
    }

    public String getEndereçoDoJogador() {
        return endereçoDoJogador;
    }

    public void setEndereçoDoJogador(String endereçoDoJogador) {
        this.endereçoDoJogador = endereçoDoJogador;
    }

    public String getTelefoneDoJogador() {
        return telefoneDoJogador;
    }

    public void setTelefoneDoJogador(String telefoneDoJogador) {
        this.telefoneDoJogador = telefoneDoJogador;
    }
    
    public String getDataNascimentoDoJogador() {
        return dataNascimentoDoJogador;
    }

    public void setDataNascimentoDoJogador(String dataNascimentoDoJogador) {
        this.dataNascimentoDoJogador = dataNascimentoDoJogador;
    }

    public Posicoes getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicoes posicao) {
        this.posicao = posicao;
    }

    public boolean isInscritoLIFFA() {
        return inscritoLIFFA;
    }

    public void setInscritoLIFFA(boolean inscritoLIFFA) {
        this.inscritoLIFFA = inscritoLIFFA;
    }

    public boolean isInscritoLNFA() {
        return inscritoLNFA;
    }

    public void setInscritoLNFA(boolean inscritoLNFA) {
        this.inscritoLNFA = inscritoLNFA;
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
        if (!(object instanceof Jogador)) {
            return false;
        }
        Jogador other = (Jogador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Jogador[ id=" + id + " ]";
    }
    
}
