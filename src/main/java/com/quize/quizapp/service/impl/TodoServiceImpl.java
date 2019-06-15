package com.quize.quizapp.service.impl;

import com.quize.quizapp.model.Todo;
import com.quize.quizapp.repository.TodoRepository;
import com.quize.quizapp.service.TodoService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TodoServiceImpl.class);

    @Autowired
    private TodoRepository todoRepository;

    /**
     * This method is used to add aTodo object in db
     *
     * @param todo
     * @return
     */
    @Override
    public Todo addTodo(Todo todo) {
        if (todo != null) {
            return todoRepository.save(todo);
        } else {
            LOGGER.error("Exception in add todo", TodoServiceImpl.class);
            throw new RuntimeException("Exception in saving object of todo");
        }
    }

    /**
     * This method is used to get aTodo object according to given name
     *
     * @param todoName
     * @return
     */
    @Override
    public List<Todo> getTodos(String todoName) {
        if (StringUtils.isNotEmpty(todoName)) {
            return todoRepository.getTodos(todoName);
        } else {
            LOGGER.error("Exception in get todos by name", TodoServiceImpl.class);
            throw new RuntimeException("Exception in get todos by name");
        }
    }

    /**
     * This method is used to get all todos objects
     *
     * @return
     */
    @Override
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    /**
     * This method is used to delete atodo object according to todoId
     *
     * @param id
     * @return
     */
    @Override
    public void deleteTodo(Long id) {
        if (id != null) {
            todoRepository.deleteTodo(id);
        } else {
            LOGGER.error("Exception in delete a todo item",TodoServiceImpl.class);
            throw new RuntimeException("Exception in delete a todo item");
        }
    }

    /**
     * This method is used to delete multiple todos
     * @param todoIds
     * @return
     */
    @Override
    public void deleteMultipleTodos(List<Long> todoIds) {
        if(todoIds !=null){
             todoRepository.deleteMultipleTodos(todoIds);
        }else{
            LOGGER.error("Exception in delete multiple todos", TodoServiceImpl.class);
            throw new RuntimeException("Exception in delete multiple todos");
        }
    }

    /**
     * This method is used to update aTodo
     * @param todo
     * @return
     */
    @Override
    public Todo updateTodo(Todo todo) {
        if(todo != null){
            return todoRepository.save(todo);
        }else{
            LOGGER.error("Exception in update a todo",TodoServiceImpl.class);
            throw new RuntimeException("Exception in update a todo");
        }
    }
}
