/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.com.aspects;

import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 * @author rafaeli
 */
@Component
@Aspect
public class AspectoLogging {
    
    @Before("@annotation(eduit.com.annotations.Loggeable)")
    public void antesDeEjecutar(JoinPoint joinPoint) throws IOException {
        System.out.println("**************************");
        System.out.println("Justo antes de invocar al metodo: ");
        System.out.println(joinPoint.getSignature().getName());
        //String strParams = "";
        StringBuilder strParams = new StringBuilder();
        for(Object o : joinPoint.getArgs()) {
            String strJson = new Gson().toJson(o);
            System.out.println(strJson);
            //strParams += strJson.concat(strJson);  
            strParams
                    .append(strJson)
                    .append(System.lineSeparator());
        }
        FileUtils.writeStringToFile(
                    new File("/tickets/unico.txt"), 
                    strParams.toString(), 
                    "UTF-8", 
                    true
            );
        System.out.println("**************************");
    }
    
}
