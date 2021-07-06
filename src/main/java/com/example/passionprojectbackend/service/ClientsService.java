package com.example.passionprojectbackend.service;

import com.example.passionprojectbackend.models.Clients;
import com.example.passionprojectbackend.repository.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientsService {
    @Autowired
    ClientsRepository clientsRepository;

    public List<Clients> getAllClients(){
        List<Clients> listOfClients = new ArrayList<Clients>();
        clientsRepository.findAll()
                .forEach(listOfClients::add);
        return listOfClients;
    }
    public Clients getClientById(Long id){
       return clientsRepository.findById(id).get();
    }

    public void addClient(Clients clients){
        clientsRepository.save(clients);
    }

    public void deleteClient(Long id) {
        clientsRepository.deleteById(id);
    }
}
