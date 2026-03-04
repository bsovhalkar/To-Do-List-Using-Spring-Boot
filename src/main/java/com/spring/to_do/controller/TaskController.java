package com.spring.to_do.controller;

import com.spring.to_do.models.Task;
import com.spring.to_do.service.TaskService;
import lombok.NoArgsConstructor;
import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller

public class TaskController {

    private final TaskService taskService;
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public String getTasks(Model model) {
        List<Task> tasks = taskService.getAllTasks(); // FIX HERE
        model.addAttribute("tasks", tasks);
        return "tasks";
    }

    @PostMapping
    public String postTasks(@RequestParam String title, Model model) {
        taskService.createTask(title);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String deleteTasks(@PathVariable Long id, Model model) {
        taskService.deleteTaskById(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/toggle")
    public String toggleTasks(@PathVariable Long id, Model model) {
        taskService.toggleStatus(id);
        return "redirect:/";
    }

}