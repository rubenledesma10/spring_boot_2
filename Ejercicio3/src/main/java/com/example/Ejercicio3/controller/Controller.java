package com.example.Ejercicio3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping("/area/{base}/{altura}")
    @ResponseBody
    public String areaTriangulo(@PathVariable double base, @PathVariable double altura){
        double areaTriangulo = (base * altura)/2;
        return "El area del triangulo es de " +areaTriangulo;
    }
    
}
