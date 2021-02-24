/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduit.contoller;

import com.eduit.model.ClienteFrecuente;
import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rafaeli
 */
@RestController
@RequestMapping("/clifrec")
public class ClienteFrecuenteController {
    
    private int[] crearArray(int n) {
        int[] arrEnteros = new int[n];
        
        for(int x=0; x < n; x++) {
            arrEnteros[x] = x;
        }
        
        return arrEnteros;
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<ClienteFrecuente> getTodos() {
        
        ArrayList<ClienteFrecuente> retValue = new ArrayList<>();
        
        for(int z : crearArray(10)) {
            retValue.add(new ClienteFrecuente(
                    UUID.randomUUID().toString(),
                    Faker.instance().address().firstName(),
                    Faker.instance().address().lastName(),
                    (z%2) + 1
            ));
        }
        
        return retValue;
    
    }
    
}
