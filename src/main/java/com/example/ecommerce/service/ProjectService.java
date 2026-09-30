package com.example.ecommerce.service;

import com.example.ecommerce.entity.Project;
import com.example.ecommerce.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository repository;

    public ProjectService(ProjectRepository repository) {
        this.repository = repository;
    }

    // CREATE
    public Project createProject(Project project) {
        return repository.save(project);
    }

    // READ ALL
    public List<Project> getAllProjects() {
        return repository.findAll();
    }

    // READ BY ID
    public Project getProjectById(Long id) {
        return repository.findById(id).orElse(null);
    }

    // UPDATE
    public Project updateProject(Long id, Project project) {

        Project existingProject = repository.findById(id).orElse(null);

        if (existingProject != null) {

            existingProject.setName(project.getName());
            existingProject.setDescription(project.getDescription());
            existingProject.setStatus(project.getStatus());
            existingProject.setProgress(project.getProgress());

            return repository.save(existingProject);
        }

        return null;
    }

    // DELETE
    public void deleteProject(Long id) {
        repository.deleteById(id);
    }
}