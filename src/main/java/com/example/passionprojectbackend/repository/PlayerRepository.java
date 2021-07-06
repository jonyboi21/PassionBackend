package com.example.passionprojectbackend.repository;

import com.example.passionprojectbackend.models.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {

    Optional<Player> findByEmail(String email);
}
