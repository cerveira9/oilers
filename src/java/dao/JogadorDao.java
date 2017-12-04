/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.Jogador;

/**
 *
 * @author fernandocerveira
 */
@Stateless
public class JogadorDao {
    @PersistenceContext
    EntityManager em;
    

    public List<Jogador> getList() {
        Query q = em.createQuery("select j from Jogador j");
        return q.getResultList();
    }

    public void gravar(Jogador object, boolean edit) {
        if (edit == false) {
            em.persist(object);
        } else {
            em.merge(object);
        }
    }

    public void excluir(Jogador object) {
        em.remove(em.merge(object));
    }
}
