package com.todo.todo.todo;

import com.todo.todo.person.Person;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TodoService {
    
    public List<Todo> getTodos() {
        Person testPerson = new Person();
        Todo todo = new Todo(123L, "Todo 1", "Get groceries", LocalDate.now(), testPerson);
        return List.of(todo);
    }
}
