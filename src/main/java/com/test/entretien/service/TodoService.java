package com.test.entretien.service;

import com.test.entretien.entity.Todo;
import com.test.entretien.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> findAll(){
        return todoRepository.findAll();
    }

    public Optional<Todo> findById(Long id){
        return todoRepository.findById(id);
    }

    public Todo UpdateTodo(Long id, Todo todo){
        Todo todoToUpdate = todoRepository.findById(id).get();
        todoToUpdate.setName(todo.getName());
        return todoRepository.save(todoToUpdate);
    }

    public void deleteTodo(Long id){
         todoRepository.deleteById(id);
    }

    public Todo saveTodo(Todo todo){
        return todoRepository.save(todo);
    }
}
