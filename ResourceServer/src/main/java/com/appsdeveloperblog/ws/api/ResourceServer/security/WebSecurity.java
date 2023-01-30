package com.appsdeveloperblog.ws.api.ResourceServer.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter { // IMPORTANTE: essa classe deve ser criada, no package "security" que deve ficar abaixo do pacote principal

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // metodo para validar o token das requisicoes que chegarem
        http
            .authorizeRequests()
            .anyRequest()
                .authenticated()
                .and()
            .oauth2ResourceServer()
            .jwt();
    }
}
