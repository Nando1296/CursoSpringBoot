package com.infsis.ProyectoCursoSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})

public class ProyectoCursoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoCursoSpringBootApplication.class, args);
	}

}
