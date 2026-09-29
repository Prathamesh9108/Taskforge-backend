package com.example.ecommerce.controller;

import com.example.ecommerce.entity.Project;
import com.example.ecommerce.service.ProjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/projects")
public class ProjectController {

    private final ProjectService service;

    public ProjectController(ProjectService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    public Project createProject(@RequestBody Project project) {
        return service.createProject(project);
    }

    // READ ALL
    @GetMapping
    public List<Project> getAllProjects() {
        return service.getAllProjects();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Project getProjectById(@PathVariable Long id) {
        return service.getProjectById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Project updateProject(
            @PathVariable Long id,
            @RequestBody Project project) {

        return service.updateProject(id, project);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteProject(@PathVariable Long id) {

        service.deleteProject(id);

        return "Project deleted successfully";
    }
}