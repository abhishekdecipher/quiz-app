package com.quize.quizapp.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Todo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "todo_name")
    private String todoName;

    @Column(name = "description")
    private String description;

    @Column(name = "time")
    private Long time;

    public Todo(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTodoName() {
        return todoName;
    }

    public void setTodoName(String todoName) {
        this.todoName = todoName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "todoName='" + todoName + '\'' +
                ", description='" + description + '\'' +
                ", time=" + time +
                '}';
    }
}
