package com.test.entretien.controller;


import com.test.entretien.entity.Todo;
import com.test.entretien.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> findAll(){
        return todoService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Todo findById(@PathVariable Long id){
        return todoService.findById(id).get();
    }

    @PutMapping(value = "/{id}")
    public Todo findById(@PathVariable Long id, @RequestBody Todo todo){
        return todoService.UpdateTodo(id,todo);
    }

    @PostMapping
    public Todo save(@RequestBody Todo todo){
        return todoService.saveTodo(todo);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id){
         todoService.deleteTodo(id);
    }



}
