package com.example.todoapplication.controllers;


import com.example.todoapplication.model.Task;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/tasks")
@RestController
public class  TodoTaskController {

    ArrayList<Task> taskList = new ArrayList<>();
    @GetMapping("/")
    List<Task> getAllTasks(){
        return taskList;
    }

    @PostMapping("/")
    Task addNewTask(@RequestBody Task task){
        Task taskToAdd = new Task(task.getName());
        taskList.add(taskToAdd);
        return taskToAdd;
    }
}
