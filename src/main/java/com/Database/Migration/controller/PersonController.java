package com.Database.Migration.controller;

import com.Database.Migration.entity.Person;
import com.Database.Migration.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/create")
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        return new ResponseEntity<>(HttpStatus.CREATED).ok().body(personService.createPerson(person));
    }

    @GetMapping("/")
    public ResponseEntity<List<Person>> getAllPersons(){
       List<Person> personList= personService.getAllPersons();
       return ResponseEntity.ok(personList);
    }
}
