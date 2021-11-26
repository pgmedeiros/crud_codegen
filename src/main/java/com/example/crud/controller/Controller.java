package com.example.crud.controller;

import com.example.poc_swagger_gen_with_springboot.rest.api.UsuarioApi;
import com.example.poc_swagger_gen_with_springboot.rest.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{

    @Autowired
    Usuario usuario;


    @GetMapping("/")
    public String usuarioGet() {
        usuario.setNome("José Almeida");
        return usuario.getNome();
    }


}
