package com.appsdeveloperblog.ws.api.ResourceServer.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/token")
public class TokenController {

    // forma de captar o token Jwt que vem na requisição
    @GetMapping
    public Jwt getToken(@AuthenticationPrincipal Jwt jwt) {
        // return Collections.singletonMap("principal", jwt); forma de trazer menos informações, mapeando só o necessario
        return jwt;
    }
}
