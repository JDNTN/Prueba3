package com.prueba.exp.exp.Routes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {

   
    @GetMapping("/Hola")
    public String inicio(){
        String a = "hola";
        return a;
    }

}
