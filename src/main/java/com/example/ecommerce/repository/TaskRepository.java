package com.example.ecommerce.repository;

import com.example.ecommerce.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}