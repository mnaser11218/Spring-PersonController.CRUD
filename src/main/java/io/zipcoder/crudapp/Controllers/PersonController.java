package io.zipcoder.crudapp.Controllers;

import io.zipcoder.crudapp.model.Person;
//import org.springframework.stereotype.Controller;
import io.zipcoder.crudapp.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    private final PersonRepository personRepository;
    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    @PostMapping(value="/people")
    Person createPerson(@RequestBody Person p){
        return personRepository.save(p);
    }
    @GetMapping(value="/people/{id}")
    ResponseEntity<Person> getPerson(@PathVariable("id") int id){
        return new ResponseEntity<>( personRepository.findOne(id), HttpStatus.OK);
    }
    @GetMapping(value="/people")
    List<Person> getPersonList(){
        return (List<Person>) personRepository.findAll();
    }
    @PutMapping(value="/people/{id}")
    Person updatePerson(@PathVariable("id") @RequestBody Person p){
        return personRepository.save(p);
    }
    @DeleteMapping(value="/people/{id}")
    void deletePerson(@PathVariable("id") int id){
    personRepository.delete(id);
    };

}
