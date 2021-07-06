package com.example.passionprojectbackend.service;


import com.example.passionprojectbackend.models.Player;
import com.example.passionprojectbackend.repository.ParentRepository;
import com.example.passionprojectbackend.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    @Autowired
    ParentRepository parentRepository;

    @Autowired
    PlayerRepository playerRepository;

    public void addPlayer(Player p){
        playerRepository.save(p);
        p.getParent().setPlayerId(p.getId());
        parentRepository.save(p.getParent());
    }

    public List<Player> getAllPlayers(){
        List<Player> listOfPlayers = new ArrayList<>();
        playerRepository.findAll()
                .forEach(listOfPlayers::add);
        return listOfPlayers;
    }

    public Player getPlayerById(Long id){
       return playerRepository.findById(id).get();
    }

    public void deletePlayer(Long playerId){
        playerRepository.deleteById(playerId);

    }


    public void deleteAllPlayers() {
        playerRepository.deleteAll();
    }
}
