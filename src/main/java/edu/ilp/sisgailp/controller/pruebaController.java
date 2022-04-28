package edu.ilp.sisgailp.controller;

import edu.ilp.sisgailp.entity.Escuela;
import edu.ilp.sisgailp.service.IEscuelaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("login")
public class pruebaController {


    @Autowired
    private IEscuelaService escuelaService;

    @GetMapping("/listaEscuelas")
    public List<Escuela> listaEscuelas(){
     return this.escuelaService.listarEscuelas();
    }

    @GetMapping("/saludo")
    public String saludo(){
        return "hola mundo";
    }


   @GetMapping("/bienvenido")
    public  String identificacion(@RequestParam String datos){
        return "bienvenido a la pontificia:" + datos;
    }

    @GetMapping("/buscarEscuelaByCodigo")
    public Escuela  buscarEscuelaByCodigo(@RequestParam String codigo){

        return this.escuelaService.obtenerEscuelaPorCodigo(codigo);
    }
}
