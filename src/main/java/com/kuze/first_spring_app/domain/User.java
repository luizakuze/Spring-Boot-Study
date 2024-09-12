package com.kuze.first_spring_app.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// anotações do lombok para gerar automaticamente os métodos getters e setters
@Getter
@Setter
@AllArgsConstructor
public class User {
    private String name;
    private String email;
}
