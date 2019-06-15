package com.quize.quizapp.service;

import com.quize.quizapp.model.Todo;

import java.util.List;

public interface TodoService {
    Todo addTodo(final Todo todo);
    List<Todo> getTodos(final String todoName);
    List<Todo> getAllTodos();
    void deleteTodo(final Long id);
    void deleteMultipleTodos(final List<Long> todoIds);
    Todo updateTodo(final Todo todo);
}
