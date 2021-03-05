package com.eduit.model;

public class Venta {
    public String id;
    public Double montoNominal;
    public Double montoTotal;

    public Venta() {
    }

    public Venta(String id, Double montoNominal, Double montoTotal) {
        this.id = id;
        this.montoNominal = montoNominal;
        this.montoTotal = montoTotal;
    }
}
