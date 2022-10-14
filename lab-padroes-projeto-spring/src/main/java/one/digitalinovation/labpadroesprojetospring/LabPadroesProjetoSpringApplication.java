package one.digitalinovation.labpadroesprojetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * -Spring Data JPA
 * -Spring Web
 * -H2 DataBase
 * -OpenFeign
 * 
 * @author lucas
 *
 */


@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		
		System.setProperty("server.port", "8081");
        // ou, use
        // System.getProperties().put("server.port", 8081);
		
		SpringApplication.run(LabPadroesProjetoSpringApplication.class, args);
	}

}
