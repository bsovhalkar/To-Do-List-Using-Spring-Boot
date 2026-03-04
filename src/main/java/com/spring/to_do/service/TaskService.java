package com.spring.to_do.service;


import com.spring.to_do.models.Task;
import com.spring.to_do.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TaskService {
    private final TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public void createTask(String title) {
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskRepository.save(task);
    }

    public void deleteTaskById(Long id) {
        taskRepository.deleteById(id);
    }

    public void toggleStatus(Long id) {
        Task task = taskRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Invalis task id"));

        task.setCompleted(!task.isCompleted());
        taskRepository.save(task);
    }
}
