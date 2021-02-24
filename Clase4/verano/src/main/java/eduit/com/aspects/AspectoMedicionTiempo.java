/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.com.aspects;

import java.util.function.Supplier;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 *
 * @author rafaeli
 */
@Component
@Aspect
public class AspectoMedicionTiempo {
    
    @Around("@annotation(eduit.com.annotations.Medible)")
    public void encerrar(ProceedingJoinPoint joinPoint) throws Throwable {
        
        Supplier<Long> ts = () -> System.currentTimeMillis();
        
        try {
            
            long ms1 = ts.get();
            joinPoint.proceed();
            long ms2 = ts.get();
            long diff = ms2 - ms1;
            System.out.println("El tiempo de invocacion del metodo: ");
            System.out.println(joinPoint.getSignature().getName());
            System.out.println(diff + " milisegundos");
        
        }catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    
    }
}
