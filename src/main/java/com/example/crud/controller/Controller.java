package com.example.crud.controller;

import com.example.crud.teste.src.main.java.com.baeldung.petstore.client.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    Usuario usuario;

    @GetMapping("/")
    public String get(){
        usuario.setNome("Pedro Medeiro");
        return usuario.getNome();
    }

}
