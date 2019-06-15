package com.quize.quizapp.repository;

import com.quize.quizapp.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

    @Query(value = "SELECT td from Todo td where td.todoName =?1")
    List<Todo> getTodos(String todoName);

    @Transactional
    @Modifying
    @Query(value = "DELETE from Todo where id=?1")
    void deleteTodo(Long todoId);

    @Transactional
    @Modifying
    @Query(value = "delete from Todo where id in ?1")
    void deleteMultipleTodos(List<Long> todoList);
}
