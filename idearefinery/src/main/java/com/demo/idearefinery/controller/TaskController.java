package com.demo.idearefinery.controller;

import com.demo.idearefinery.model.Task;
import com.demo.idearefinery.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/task")
public class TaskController {
@Autowired
    private TaskService taskService;
    public TaskController(TaskService taskService){
        this.taskService = taskService;

    }

    @GetMapping("/hello")
    public String Hello(){
        return "Hello World";
    }

    @GetMapping("/getAll")
    public List<Task> getAllTask(){
        return taskService.findAllTask();

    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable("id") Long id){
        Task task = taskService.findTaskById(id);
        return new ResponseEntity<>(task, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Task> addTask(@RequestBody Task task){
        Task newTask = taskService.addTask(task);
        return new ResponseEntity<>(newTask, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable("id") Long id, @RequestBody Task task){
        Task updateTask = taskService.findTaskById(id);
        updateTask.setTitle(task.getTitle());
        updateTask.setCompleted(task.getCompleted());
        updateTask.setDescription(task.getDescription());
        updateTask.setCreatedDate(task.getCreatedDate());
        updateTask.setCompletedDate(task.getCompletedDate());
        updateTask = taskService.updateTask(updateTask);
        return new ResponseEntity<>(updateTask, HttpStatus.OK);
    }




}
