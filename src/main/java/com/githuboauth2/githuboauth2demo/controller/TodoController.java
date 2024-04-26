package com.githuboauth2.githuboauth2demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;


@RestController

public class TodoController {

    @GetMapping("/")
    public String Hello(){
        return "Hello welcome to oauth2 app";
    }

    @GetMapping("/secured")
    public String SayHi(Principal principal){
        return "Hi " + principal.getName();
    }
}
