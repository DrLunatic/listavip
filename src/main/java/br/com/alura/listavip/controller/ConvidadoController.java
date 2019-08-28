package br.com.alura.listavip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
public class ConvidadoController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/listaconvidados")
    public String listaConvidados(){
        return "listaconvidados";
    }
}
