package com.Database.Migration.service;

import com.Database.Migration.entity.Person;
import com.Database.Migration.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person createPerson(Person person){
        return personRepository.save(person);
    }
    public List<Person> getAllPersons(){
        return personRepository.findAll();
    }
}
