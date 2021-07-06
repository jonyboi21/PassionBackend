package com.example.passionprojectbackend.controller;

import com.example.passionprojectbackend.models.Clients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.passionprojectbackend.service.ClientsService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/api/v1")
public class ClientsController {

    @Autowired
    ClientsService clientsService;

    @PostMapping("/clients")
    public void addClients(@RequestBody Clients client){
        clientsService.addClient(client);
    }

    @GetMapping("/clients")
    public List<Clients> getAllClients(){
        return clientsService.getAllClients();
    }

    @DeleteMapping("/clients/{id}")
    public void deleteClient(@PathVariable Long id){
        clientsService.deleteClient(id);
    }

}
