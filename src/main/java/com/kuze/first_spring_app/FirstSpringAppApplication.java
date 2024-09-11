package com.kuze.first_spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@Configuration -> métodos que definem beans
//@EnableAutoConfiguration -> ativa auto configuração do spring (facilidade do springboot)
//@Component -> permite que o spring escaneie os componentes, classes, ...
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
	}

}
