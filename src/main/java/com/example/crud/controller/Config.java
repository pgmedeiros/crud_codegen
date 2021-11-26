package com.example.crud.controller;

import com.example.poc_swagger_gen_with_springboot.rest.model.Usuario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {
    @Bean
    public Usuario usuario(){
        return new Usuario();
    }
}
