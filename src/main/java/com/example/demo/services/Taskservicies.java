package com.example.demo.services;

import com.example.demo.entities.Task;
import com.example.demo.repositories.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Taskservicies{
    private final TaskRepository repository;


    public Taskservicies(TaskRepository repository){
        this.repository = repository;

    }

    public List<Task> getTasklist(){
        return this.repository.findAll();
    }

    public Task createTask(Task newTask){
        return this.repository.save(newTask);

    }
}
