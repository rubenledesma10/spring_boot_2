package com.example.Ejercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/nota")
    public String promedioNotas (@RequestParam int nota1, @RequestParam int nota2, @RequestParam int nota3){
        int promedio = (nota1 + nota2 + nota3)/3;
        return "Tu promedio es de " +promedio;
    }
    
}
