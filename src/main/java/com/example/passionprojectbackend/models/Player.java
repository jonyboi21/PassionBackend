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
public class Player {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    Long id;
    String name;
    String email;
    Integer age;
    Integer heightFeet;
    Integer heightInches;
    Integer weight;
    @OneToOne(cascade = CascadeType.ALL)
    private Parent parent;

}
