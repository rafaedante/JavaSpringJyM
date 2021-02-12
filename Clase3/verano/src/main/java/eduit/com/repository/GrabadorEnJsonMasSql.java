/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.com.repository;

import eduit.com.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rafaeli
 */
@Repository
@Primary
public class GrabadorEnJsonMasSql implements GrabadorMulta{
    
    @Autowired
    private GrabadorMultaJson grabadorMultaJson;
    
    @Autowired
    private GrabadorMultaSql grabadorMultaSql;   

    @Override
    public void grabar(Ticket t) {
        
        try{
            grabadorMultaJson.grabar(t);
        }catch(Exception ex) {
            System.out.println("No pudo grabar en formato JSON");
        }
        
        try{
            grabadorMultaSql.grabar(t);
        }catch(Exception ex) {
            System.out.println("No pudo grabar en SQL");
        }
        
    }
    
}
