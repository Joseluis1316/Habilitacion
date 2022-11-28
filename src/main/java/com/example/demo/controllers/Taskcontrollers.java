package com.example.demo.controllers;


import com.example.demo.entities.Task;
import com.example.demo.services.Taskservicies;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Taskcontrollers{
    Taskservicies service;

    public Taskcontrollers(Taskservicies service){
        this.service = service;

    }

    @GetMapping("/tasks")
    public List<Task> Tasklist(){
        return this.service.getTasklist();

    }
    @PostMapping("/tasks")
    public Task createTask(@RequestBody  Task task){
        return this.service.createTask(task);
    }
}
