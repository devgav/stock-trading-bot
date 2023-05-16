package com.todo.todo.person;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    public List<Person> getPersons() {
        Person testPerson = new Person("PersonFirst", "PersonLast", "email@gmail.com", "password1", 122L);
        return List.of(testPerson);
    }
}
