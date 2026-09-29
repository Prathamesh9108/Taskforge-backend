package com.example.ecommerce.service;

import com.example.ecommerce.entity.Task;
import com.example.ecommerce.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    // Get all tasks
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Get task by ID
    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    // Add task
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    // Update task
    public Task updateTask(Long id, Task task) {
        task.setId(id);
        return taskRepository.save(task);
    }

    // Delete task
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}