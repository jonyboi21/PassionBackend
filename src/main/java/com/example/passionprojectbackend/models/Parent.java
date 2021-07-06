package com.example.passionprojectbackend.models;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String parentName;
    private String parentEmail;
    private Long phoneNumber;
    private String streetName;
    private String city;
    private String state;
    private String zip;
    private Long playerId;




}
