package com.example.passionprojectbackend.service;

import com.example.passionprojectbackend.models.Parent;
import com.example.passionprojectbackend.repository.ParentRepository;
import com.example.passionprojectbackend.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.rmi.NoSuchObjectException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ParentService {

    @Autowired
    ParentRepository parentRepository;

    PlayerRepository playerRepository;

    public List<Parent> getAllParents(){
        List<Parent> listOfParents = new ArrayList<>();
        parentRepository.findAll()
                .forEach(listOfParents::add);
        return listOfParents;
    }
    public Parent getParentById(Long id){
        return parentRepository.findById(id).get();
    }

    public void addParent(Parent parent, Long playerId) {
            playerRepository.findById(playerId).get().setParent(parent);
            parentRepository.save(parent);
        }

    }

