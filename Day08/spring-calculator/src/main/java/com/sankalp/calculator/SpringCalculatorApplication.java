package com.sankalp.calculator;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Student api URL") })
@SpringBootApplication
public class SpringCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCalculatorApplication.class, args);
	}

}
