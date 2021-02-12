/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.com.repository;

import eduit.com.components.ContenedorJPA;
import eduit.com.model.Ticket;
import eduit.com.repository.GrabadorMulta;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rafaeli
 */

@Repository("GRABADOR_SQL")
public class GrabadorMultaSql implements GrabadorMulta{
    
    @Autowired
    ContenedorJPA contenedorJPA;

    @Override
    public void grabar(Ticket t) {
        System.out.println("Grabando multa en sql");
        EntityManager entityManager = contenedorJPA.getEntityManager();
        EntityTransaction tx = null;
        
        try {
            
            tx = entityManager.getTransaction();
            tx.begin();
            entityManager.persist(t);
            tx.commit();          
        
        } catch(Exception ex) {
            tx.rollback();
            ex.printStackTrace();
        }
    }
    
}
