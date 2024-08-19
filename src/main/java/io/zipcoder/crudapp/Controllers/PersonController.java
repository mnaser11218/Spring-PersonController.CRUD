package io.zipcoder.crudapp.Controllers;

import io.zipcoder.crudapp.model.Person;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    Person createPerson(Person p){
        return null;
    }
    @GetMapping(value="/people/{id}")
    Person getPerson(@PathVariable("id") int id){
        return null;
    }
    @GetMapping(value="/people")
    List<Person> getPersonList(){
        return null;
    }
    @PutMapping(value="/people/{id}")
    Person updatePerson(@PathVariable("id") @RequestBody Person p){
        return null;
    }
    @DeleteMapping(value="/people/{id}")
    void DeletePerson(@PathVariable("id") int id){

    };

}
