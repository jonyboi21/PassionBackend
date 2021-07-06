package com.example.passionprojectbackend.repository;

import com.example.passionprojectbackend.models.Clients;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientsRepository extends CrudRepository<Clients,Long> {
}
