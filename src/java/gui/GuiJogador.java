/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.JogadorDao;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import model.Jogador;
import model.Posicoes;

/**
 *
 * @author fernandocerveira
 */
@Named(value = "guiJogador")
@SessionScoped
public class GuiJogador implements Serializable{
    
    @EJB
    JogadorDao daoJogador;
    private Jogador jogador;
    private List<Jogador> listaJogador;
    private List<Posicoes> listaPosicoes = new ArrayList<>(EnumSet.allOf(Posicoes.class));
    private Boolean alterando;

    public GuiJogador() {
    }
    
    public String iniciarLista() {
        listaJogador = daoJogador.getList();
        return "ListaJogador";
    }
    
    public String iniciarNovo() {
        jogador = new Jogador();
        alterando = false;
        return "CadastrarJogador";
    }
    
    public String gravar() {
        daoJogador.gravar(jogador, alterando);
        listaJogador = daoJogador.getList();
        return "ListaJogador";
    }
    
    public String alterar(Jogador jogador) {
        this.jogador = jogador;
        alterando = true;
        return "CadastrarJogador";
    }
    
    public String excluir(Jogador jogador) {
        daoJogador.excluir(jogador);
        listaJogador = daoJogador.getList();
        return null;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public List<Jogador> getListaJogador() {
        return listaJogador;
    }

    public void setListaJogador(List<Jogador> listaJogador) {
        this.listaJogador = listaJogador;
    }

    public Boolean getAlterando() {
        return alterando;
    }

    public void setAlterando(Boolean alterando) {
        this.alterando = alterando;
    }

    public List<Posicoes> getListaPosicoes() {
        return listaPosicoes;
    }

    public void setListaPosicoes(List<Posicoes> listaPosicoes) {
        this.listaPosicoes = listaPosicoes;
    }
    
}

