package com.example.RestAPI.service;

@org.springframework.stereotype.Service
public class Service {
    public String exampleView(){
        return "Acesse <a href'http://localhost:8080/'>localhost:8080</> para visualizar";
    }
}
