package com.dehmani.userbasicinfo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public Map<String, Object> sayHello() {
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("App Name", "User Basic Info");
        response.put("Packages", "Spring Boot, Mysql, JPA and Hibernate.");
        response.put("Description", "Welcome to the User Basic Info Application. You can create a new User Basic Info by making a POST request to /api/basicuserinfo endpoint.");
        response.put("Options", "GET, POST, PUT, DELETE");

        return response;
    }
}
