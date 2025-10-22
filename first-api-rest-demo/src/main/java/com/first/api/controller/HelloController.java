package com.first.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    //comentario bryan
    //comentario 2
    //Probando el pipeline en accion
    @GetMapping("/hello")
    public String saludar(){
        return "Hola Mundo con REST en Spring Boot 3";
    }

    //Este es otro comentario
    //Agregamos algo 1
    @GetMapping("/hello2")
    public String saludar2(){
        return "Hola Mundo con REST en Spring Boot";
    }


    @GetMapping("/hello3")
    public String saludar3(){
        return "Hola Mundo con REST en Spring Boot";
    }


    @GetMapping("/hello4")
    public String saludar4(){
        return "Hola Mundo con REST en Spring Boot";
    }


    //Otro comentario
    @GetMapping("/hello6")
    public String saludar6(){
        return "Hola Mundo con REST en Spring Boot";
    }

    @GetMapping("/hello7")
    public String saludar7(){
        return "7 - Hola Mundo con REST en Spring Boot";
    }

    @GetMapping("/hello8")
    public String saludar8(){
        return "8 - Hola Mundo con REST en Spring Boot";
    }

    @GetMapping("/hello9")
    public String saludar9(){
        return "9 - Hola Mundo con REST en Spring Boot";
    }
}

