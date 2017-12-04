/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.DiretorDao;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import model.Cargos;
import model.Diretor;

/**
 *
 * @author fernandocerveira
 */
@Named(value = "guiDiretor")
@SessionScoped
public class GuiDiretor implements Serializable{
    
    @EJB
    DiretorDao daoDiretor;
    private Diretor diretor;
    private List<Diretor> listaDiretor;
    private List<Cargos> listaCargo = new ArrayList<>(EnumSet.allOf(Cargos.class));
    private Boolean alterando;

    public GuiDiretor() {
    }
    
    public String iniciarLista() {
        listaDiretor = daoDiretor.getList();
        return "ListaDiretor";
    }
    
    public String iniciarNovo() {
        diretor = new Diretor();
        alterando = false;
        return "CadastrarDiretor";
    }
    
    public String gravar() {
        daoDiretor.gravar(diretor, alterando);
        listaDiretor = daoDiretor.getList();
        return "ListaDiretor";
    }
    
    public String alterar(Diretor diretor) {
        this.diretor = diretor;
        alterando = true;
        return "CadastrarDiretor";
    }
    
    public String excluir(Diretor diretor) {
        daoDiretor.excluir(diretor);
        listaDiretor = daoDiretor.getList();
        return null;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public List<Diretor> getListaDiretor() {
        return listaDiretor;
    }

    public void setListaDiretor(List<Diretor> listaDiretor) {
        this.listaDiretor = listaDiretor;
    }

    public Boolean getAlterando() {
        return alterando;
    }

    public void setAlterando(Boolean alterando) {
        this.alterando = alterando;
    }

    public List<Cargos> getListaCargo() {
        return listaCargo;
    }

    public void setListaCargo(List<Cargos> listaCargo) {
        this.listaCargo = listaCargo;
    }
    
}

