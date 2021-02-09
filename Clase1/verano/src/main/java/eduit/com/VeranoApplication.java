package eduit.com;

import com.bolivarsoft.sensorclima.SensorClima;
import com.bolivarsoft.sensorclima.TipoClima;
import com.bolivarsoft.sensorvelocidad.DatosVehiculo;
import com.bolivarsoft.sensorvelocidad.SensorVelocidad;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VeranoApplication {

    private static void pruebaSensor(){
        
        SensorClima sensorClima = new SensorClima();
        SensorVelocidad sensorVelocidad = new SensorVelocidad();
        
        TipoClima tipoClima = sensorClima.sensar();
        System.out.println(tipoClima);
        
        for(;;) {
            DatosVehiculo datosVehiculo = sensorVelocidad.sensarVehiculo();
            System.out.println(datosVehiculo);
        }
    }
    
 

    
    public static void main(String[] args) {
                
                //pruebaSensor();  
                
		SpringApplication.run(VeranoApplication.class, args);
	}

}
