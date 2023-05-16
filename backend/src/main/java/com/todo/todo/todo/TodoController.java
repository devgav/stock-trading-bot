package com.todo.todo.todo;

import com.todo.todo.person.Person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/todo")
public class TodoController {
    @GetMapping("/")
    public List<Todo> getTodos() {
        Person testPerson = new Person();
        Todo todo = new Todo(123L, "Todo 1", "Get groceries", LocalDate.now(), testPerson);
        return List.of(todo);
    }
}
