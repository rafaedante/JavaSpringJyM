/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.com.services;

import eduit.com.model.Ticket;
import eduit.com.repository.GrabadorMulta;

/**
 *
 * @author rafaeli
 */
public class GrabadorMultaJson implements GrabadorMulta{

    @Override
    public void grabar(Ticket t) {
        System.out.println("Grabando ticket en formato JSON");
    }
    
}
