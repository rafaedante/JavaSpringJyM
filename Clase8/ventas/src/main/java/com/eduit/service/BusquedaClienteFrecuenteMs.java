package com.eduit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;

@Service
public class BusquedaClienteFrecuenteMs implements BusquedaClienteFrecuente{

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    RestTemplate restTemplate;

    @Override
    public int descuento(String idCliente) {
        // dado un id de cliente, obtener el tipo de descuento
        String url = "http://localhost:8080/clifrec/" + idCliente;
        //Object resp = restTemplate.getForObject(url, Object.class);
        List<HashMap<String, Object>> resp
                = (List<HashMap<String, Object>>) restTemplate.getForObject(url, Object.class);

        //Verificacion si es cliente frecuente
        if(resp.size() == 0) {
            System.out.println("No es cliente frecuente");
            return 0;
        }

        System.out.println("Este deberia ser el tipo de descuento");
        System.out.println(resp.get(0).get("tipoDescuento"));
        System.out.println("---------------------------------------");

        return Integer.parseInt(resp.get(0).get("tipoDescuento").toString());
    }
}
