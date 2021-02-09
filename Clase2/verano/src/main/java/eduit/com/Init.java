/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.com;

import com.bolivarsoft.sensorclima.SensorClima;
import com.bolivarsoft.sensorvelocidad.SensorVelocidad;
import eduit.com.services.EvaluadorMultas;
import eduit.com.services.GrabadorMultaJson;
import eduit.com.services.SensorInEternum;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

/**
 *
 * @author rafaeli
 */
@Service
public class Init implements CommandLineRunner{
    
     private static SensorInEternum factory(){
        return new SensorInEternum(
                new SensorClima(),
                new SensorVelocidad(),
                new EvaluadorMultas(
                        new GrabadorMultaJson()
                )
        );
    }

    @Override
    public void run(String... args) throws Exception {
        factory().sensar();
    }
    
}
