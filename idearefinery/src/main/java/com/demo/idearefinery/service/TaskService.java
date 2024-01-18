package com.demo.idearefinery.service;

import com.demo.idearefinery.exceptions.UserNotFoundException;
import com.demo.idearefinery.model.Task;
import com.demo.idearefinery.repo.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TaskService {
    @Autowired
    private TaskRepo taskRepo;


    public TaskService(TaskRepo taskRepo){
        this.taskRepo = taskRepo;
    }
    public List<Task> findAllTask(){
        return taskRepo.findAll();
    }


    public Task findTaskById(Long id){
        return taskRepo.findCustomerById(id)
                .orElseThrow(() -> new UserNotFoundException("user by id " +id+ " was not found."));

    }

    public Task addTask(Task task){
        return taskRepo.save(task);
    }

    public Task updateTask(Task task){
        return taskRepo.save(task);
    }
}
