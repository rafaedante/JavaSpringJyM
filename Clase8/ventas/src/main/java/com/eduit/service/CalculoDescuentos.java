package com.eduit.service;

public class CalculoDescuentos {
    private String idCliente;
    private  Double importe;
    private BusquedaClienteFrecuente busquedaClienteFrecuente;

    public static CalculoDescuentos build() {
        return new CalculoDescuentos();
    }

    public CalculoDescuentos setearidCliente(String idCliente) {
        this.idCliente = idCliente;
        return this;
    }

    public CalculoDescuentos setearImporte(Double importe) {
        this.importe = importe;
        return this;
    }

    public CalculoDescuentos setearBusquedaClienteFrecuente(BusquedaClienteFrecuente busquedaClienteFrecuente) {
        this.busquedaClienteFrecuente = busquedaClienteFrecuente;
        return this;
    }

    public double calcular() {
        Integer tipoDesc = busquedaClienteFrecuente.descuento(idCliente);
        if (tipoDesc == 0) {
            return importe;
        }
        if (tipoDesc == 1) {
            return importe * 0.9d;
        }
        if (tipoDesc == 2) {
            return importe * 0.8d;
        }
        throw new RuntimeException("NUNCA DEBERIA LLEGAR ACA");
    }

}
