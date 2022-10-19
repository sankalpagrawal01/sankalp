package com.sankalp.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
@OpenAPIDefinition(servers = { @Server(url = "/", description = "Mongo database app") })
@SpringBootApplication
public class DocterPrecriptionMongoApplication
{
    public static void main( String[] args )
    {
    	SpringApplication.run(DocterPrecriptionMongoApplication.class, args);
    }
}
