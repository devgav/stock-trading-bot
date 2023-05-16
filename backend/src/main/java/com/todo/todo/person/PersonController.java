package com.todo.todo.person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api/v1/person")
public class PersonController {
    @GetMapping
    public List<Person> GetPerson() {
        Person testPerson = new Person("PersonFirst", "PersonLast", "email@gmail.com", "password1", 122L);
        return List.of(testPerson);
    }
}
