package com.example.demo.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "person")
@Data
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String city;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "person", orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Pet> pets;

    public Person(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }
}
