package com.eduit.controllers;

import com.eduit.model.Venta;
import com.eduit.service.BusquedaClienteFrecuenteMs;
import com.eduit.service.CalculoDescuentos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/venta")
public class VentaController {

    @Autowired
    BusquedaClienteFrecuenteMs busquedaClienteFrecuenteMs;

    @RequestMapping(path="/vender/{id}", method = RequestMethod.GET)
    public Object vender(@PathVariable String id) {
        // id de venta
        // precio (siempre 1000)
        // descuento
        // total a pagar

        Double desc = CalculoDescuentos
                .build()
                .setearidCliente(id)
                .setearImporte(1000d)
                .setearBusquedaClienteFrecuente(z -> busquedaClienteFrecuenteMs.descuento(id))
                .calcular();

        return new Venta(
                UUID.randomUUID().toString(),
                1000d,
                desc
        );
    }

    @RequestMapping(path = "/verificar/{id}", method = RequestMethod.GET)
    public Object verificar(@PathVariable String id) {
        return busquedaClienteFrecuenteMs.descuento(id);
    }
}
