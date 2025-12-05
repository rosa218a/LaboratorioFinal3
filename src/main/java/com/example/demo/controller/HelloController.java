package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HelloController {
    @Value("${app.version:1.0.0}")
    private String version;

    @GetMapping("/hello")
    public Map<String,String> hello(){
        return Map.of("mensaje","Hola desde la versión " + version);
    }
}
