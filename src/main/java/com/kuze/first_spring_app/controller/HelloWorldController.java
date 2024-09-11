package com.kuze.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   // É um controller rest, ou seja, combina anotações de @Controller e @ResponseBody 
@RequestMapping("/hello-world") // Adicionando configuração de mapeamento e qual request quer mapear
public class HelloWorldController {
    // pode responder com: post, get, put, delete, patch, options, head 

    // mapear endpoints, esse método responde a requisições GET
    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }
}