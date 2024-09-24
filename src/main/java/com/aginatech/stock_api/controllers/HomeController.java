package com.aginatech.stock_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping(path = "/api")
    public  String getAll(){
        return  "salut b";
    }
}
