package com.example.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "pet")
@Data
@NoArgsConstructor
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String pet;
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public Pet(String pet ,Person person) {
        this.pet = pet;
        this.person=person;

    }

}
