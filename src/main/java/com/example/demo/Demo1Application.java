package com.example.demo;

import com.example.demo.domain.Person;
import com.example.demo.domain.Pet;
import com.example.demo.repository.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Demo1Application.class, args);
        PersonRepository personRepository = context.getBean(PersonRepository.class);
        Person person = new Person("amir", "9-falahati alley", "tehran");
        Pet pet = new Pet("dog", person);
        Pet pett = new Pet("cat", person);
        List<Pet> petList = Arrays.asList(pet, pett);
        person.setPets(petList);
        personRepository.save(person);

        person = new Person("ali", "9-falahati alley", "tehran");
        pet = new Pet("bird", person);
        pett = new Pet("cat", person);
        petList = Arrays.asList(pet, pett);
        person.setPets(petList);
        personRepository.save(person);

    }

}
