package com.terminator.springbootprometheus.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pojos")
public class PojoController {
    

    @GetMapping
    public ResponseEntity<?> findAll(){
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello world!");

        return ResponseEntity.ok().body(response);
    }
}
