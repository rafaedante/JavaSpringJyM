package eduit.com;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class VeranoApplication {
    
    public static void main(String[] args) {                         
                
		SpringApplication.run(VeranoApplication.class, args);
	}

}
