package com.kuze.first_spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kuze.first_spring_app.domain.User;
import com.kuze.first_spring_app.service.HelloWorldService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController   // É um controller rest, ou seja, combina anotações de @Controller e @ResponseBody 
@RequestMapping("/hello-world") // Adicionando configuração de mapeamento e qual request quer mapear
public class HelloWorldController {

    // Para poder acessar a classe de Service, é necessário injetar a dependência
    // opção 1) criar um construtor e passar a dependência como parâmetro
    // opção 2) usar a anotação @Autowired

    @Autowired 
    private HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService HelloWorldService) {
        this.helloWorldService = HelloWorldService;
    }

    // pode responder com: post, get, put, delete, patch, options, head 
    // mapear endpoints, esse método responde a requisições GET
    @GetMapping
    public String helloWorld() {
        return this.helloWorldService.helloWorld("Kuze");
    }

    // Normalmente, no endpoint de post 
    // valores são passados pelo Body 
    // Para isso, é necessário usar a anotação @RequestBody
    //@PostMapping()
    //public String helloWorldPost(@RequestBody User body) { 
    //    return "Hello World Post " + body.getName();
    //}
    
    // Receber um parâmetro passado na própria url
    // Exemplo: "http://localhost:8080/hello-world/pathtest", "pathtest" seria esse id
    //@PostMapping("/{id}")
    //public String helloWorldPost(@PathVariable("id") String id, @RequestBody User body) { 
    //    return "Hello World Post with Url Param" + body.getName() + id;
    //}


    // Utilizando o RequestParam
    // http://localhost:8080/hello-world/PATHVARIABLEIDfilter=lulu, passando um id e um filtro
    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id,  @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body) { 
        return "Hello World Post with Filter " + filter + " " + id;
    }
 
    //@PathVariable: Extrair valores. 
    //@RequestParam: Parâmetros de Consulta. Filtros. 
}