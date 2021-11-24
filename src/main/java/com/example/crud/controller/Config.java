package com.example.crud.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.crud.teste.src.main.java.com.baeldung.petstore.client.model.Usuario;

@Configuration
public class Config {

    @Bean
    public Usuario usuario(){
        return new Usuario();
    }

}
