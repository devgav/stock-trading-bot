package com.todo.todo.todo;

import com.todo.todo.person.Person;

import java.time.LocalDate;

public class Todo {
    private Long id;
    private String title;
    private String task;
    private LocalDate completionTime;
    private Person person;

    public Todo() {
    }

    public Todo(Long id, String title, String task, LocalDate completionTime, Person person) {
        this.id = id;
        this.title = title;
        this.task = task;
        this.completionTime = completionTime;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public LocalDate getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(LocalDate completionTime) {
        this.completionTime = completionTime;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override public String toString() {
        return "Todo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", task='" + task + '\'' +
                ", completionTime=" + completionTime +
                ", person=" + person +
                '}';
    }
}
