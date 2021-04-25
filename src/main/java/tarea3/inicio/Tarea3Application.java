package tarea3.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@ComponentScan({"tarea3.dao","tarea3.controller","tarea3.service"})
@EntityScan (basePackages= {"tarea3.modelo"})
@EnableJpaRepositories (basePackages={"tarea3.dao"})
@SpringBootApplication
public class Tarea3Application {
	public static void main(String[] args) {
		SpringApplication.run(Tarea3Application.class, args);
	}
}
