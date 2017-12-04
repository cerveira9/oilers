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
import model.Diretor;

/**
 *
 * @author fernandocerveira
 */
@Stateless
public class DiretorDao {
    @PersistenceContext
    EntityManager em;
    

    public List<Diretor> getList() {
        Query q = em.createQuery("select d from Diretor d");
        return q.getResultList();
    }

    public void gravar(Diretor object, boolean edit) {
        if (edit == false) {
            em.persist(object);
        } else {
            em.merge(object);
        }
    }

    public void excluir(Diretor object) {
        em.remove(em.merge(object));
    }
}
