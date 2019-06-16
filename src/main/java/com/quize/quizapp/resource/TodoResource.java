package com.quize.quizapp.resource;

import com.quize.quizapp.model.Todo;
import com.quize.quizapp.service.TodoService;
import com.quize.quizapp.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(Constants.BASE)
@CrossOrigin
public class TodoResource {

    @Autowired
    private TodoService todoService;

    @PostMapping("/addTodo")
    public Todo addTodo(@RequestBody Todo todo){
        return todoService.addTodo(todo);
    }

    @GetMapping("/getTodos/{todoName}")
    public List<Todo> getTodos(@PathVariable final String todoName){
        List<Todo> todos = todoService.getTodos(todoName);
        return todos;
    }

    @GetMapping("/getAllTodos")
    public List<Todo> getAllTodos(){
        return todoService.getAllTodos();
    }

    @DeleteMapping("/deleteTodo/{todoId}")
    public void deleteTodo(@PathVariable final Long todoId){
         todoService.deleteTodo(todoId);
    }

    @DeleteMapping("/deleteMultipleTodos/{todoList}")
    public void deleteMultipleTodos(@PathVariable final List<Long> todoList){
         todoService.deleteMultipleTodos(todoList);
    }

    @PutMapping("/updateTodo")
    public Todo updateTodo(@RequestBody final Todo todo){
        return todoService.updateTodo(todo);
    }
}
