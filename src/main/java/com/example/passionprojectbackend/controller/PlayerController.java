package com.example.passionprojectbackend.controller;


import com.example.passionprojectbackend.models.Player;
import com.example.passionprojectbackend.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.GeneratedValue;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/api/v1")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @PostMapping(path = "/players")
    public void addPlayer(@RequestBody Player player){
        playerService.addPlayer(player);
    }
    @GetMapping(path = "/players/{id}")
    public Player getPlayerById(@PathVariable Long id){
        return playerService.getPlayerById(id);
    }
    @GetMapping(path = "/players")
    public List<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }
    @DeleteMapping(path = "/players/{id}")
    public void deletePlayer(@PathVariable Long id){
        playerService.deletePlayer(id);
    }
    @DeleteMapping(path = "/players")
    public void deleteAllPlayers(){
        playerService.deleteAllPlayers();
    }
}
