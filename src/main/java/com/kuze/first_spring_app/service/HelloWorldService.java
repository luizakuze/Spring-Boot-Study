package com.kuze.first_spring_app.service;
// contém a regra de negócio 
// o controller recebe as requisições, mas passa para as classes de service para fazer a lógica

import org.springframework.stereotype.Service;

@Service // indica que é uma classe Service
public class HelloWorldService {
    
    public String helloWorld(String name) {
        return "Hello World, " + name;
    }

}
