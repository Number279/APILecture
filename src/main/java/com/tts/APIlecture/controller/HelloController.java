package com.tts.APIlecture.controller;

import com.tts.APIlecture.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String personalGreeting(@RequestParam( defaultValue = "World") String name){
        return "Hello " + name;
    }

    public ResponseEntity<List<User>> getAllUsers(){
        return null;
    }
}
