package com.eduit.model;

public class ClienteFrecuente {

    public String idCliente;
    public String nombre;
    public String apellido;
    public Integer tipoDescuento;

    public ClienteFrecuente(String idCliente, String nombre, String apellido, Integer tipoDescuento) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDescuento = tipoDescuento;
    }
}
