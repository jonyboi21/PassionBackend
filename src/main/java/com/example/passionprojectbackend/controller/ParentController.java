package com.example.passionprojectbackend.controller;

import com.example.passionprojectbackend.models.Parent;
import com.example.passionprojectbackend.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.rmi.NoSuchObjectException;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/api/v1")
public class ParentController {

    @Autowired
    ParentService parentService;

    @PostMapping(path = "/parents/{playerId}")
    public void addParent(@RequestBody Parent parent,@PathVariable Long playerId) throws NoSuchObjectException {
        parentService.addParent(parent,playerId);
    }


    @GetMapping(path = "/parents")
    public List<Parent> getAllParents(){
        return parentService.getAllParents();
    }
}
