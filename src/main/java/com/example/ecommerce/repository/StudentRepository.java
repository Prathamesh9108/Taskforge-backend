package com.example.ecommerce.repository;

import com.example.ecommerce.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}