package edu.ilp.sisgailp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class pruebaController {

    @GetMapping("/saludo")
    public String saludo(){

        return "hola mundo";
    }
   @GetMapping("/bienvenido")
    public  String identificacion(@RequestParam String datos){
        return "bienvenido a la pontificia:" + datos;
    }
}
