


package com.example.demo;

import java.util.Objects;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value="/messages")
public class MessageResource {

    @GetMapping("/simpleMessageWelcome")
    public String simpleMessageWelcome() {
     
      return "BEM VINDO A AULA DE MICROSSERVIÇO USANDO SPRING BOOT !!!";

    }

    @GetMapping("/login")
    public String login(@RequestParam(required = false) String username, @RequestParam(required = false) String password) {

        if (Objects.isNull(username) || username.trim().isEmpty()||Objects.isNull(password) || password.trim().isEmpty()) {
            return "USUÁRIO E SENHA NÃO INFORMADOS";
        }else if(username.length() > 15 || password.length() > 15) {
            return "USUÁRIO E SENHA INVÁLIDOS";
        }
        return "LOGIN EFETUADO COM SUCESSO !!!";

    }
}