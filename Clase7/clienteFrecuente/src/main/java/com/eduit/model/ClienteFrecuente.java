/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author rafaeli
 */
@Entity
@Table(name="ClientesFrecuentes")
public class ClienteFrecuente {
    
    @Id
    @Column(name="idCliente")
    public String idCliente;
    @Column(name="nombre")
    public String nombre;
    @Column(name="apellido")
    public String apellido;
    @Column(name="tipoDescuento")
    public Integer tipoDescuento;

    public ClienteFrecuente() {
    }

    public ClienteFrecuente(String idCliente, String nombre, String apellido, Integer tipoDescuento) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDescuento = tipoDescuento;
    }
    
    
    
}
