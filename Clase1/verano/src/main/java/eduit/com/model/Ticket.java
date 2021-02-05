/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.com.model;

import com.bolivarsoft.sensorvelocidad.DatosVehiculo;

/**
 *
 * @author rafaeli
 */
public class Ticket {
    
    public String idTicket;
    public Long fechaYhora;
    public DatosVehiculo datosVehiculo;
    public String situacionClimatologica;
    public Integer limiteVelocidadPermitido;
    public Integer limiteMedido;

    public Ticket() {
    }

    public Ticket(String idTicket, Long fechaYhora, DatosVehiculo datosVehiculo, String situacionClimatologica, Integer limiteVelocidadPermitido, Integer limiteMedido) {
        this.idTicket = idTicket;
        this.fechaYhora = fechaYhora;
        this.datosVehiculo = datosVehiculo;
        this.situacionClimatologica = situacionClimatologica;
        this.limiteVelocidadPermitido = limiteVelocidadPermitido;
        this.limiteMedido = limiteMedido;
    }
    
    
    
}

