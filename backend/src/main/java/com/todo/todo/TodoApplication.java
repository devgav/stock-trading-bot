package com.todo.todo;

import com.todo.todo.person.Person;
import com.todo.todo.todo.Todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class TodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@GetMapping("/")
	public List<Todo> GetTodo() {
		Person testPerson = new Person();
		Todo todo = new Todo(123L, "Todo 1", "Get groceries", LocalDate.now(), testPerson);
		return List.of(todo);
	}
	
	@GetMapping("/person")
	public List<Person> GetPerson() {
		Person testPerson = new Person("PersonFirst", "PersonLast", "email@gmail.com", "password1", 122L);
		return List.of(testPerson);
	}
}
