package com.task.task.Service;

import java.util.List;

import com.task.task.Entity.Task;



public interface TaskService {
   
    Task saveTask(Task task);

    List<Task> getAllTasks();

    Task updateTask(Task task, Long id);

    void deleteTask(Long id);

}  
