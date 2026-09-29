package com.example.ecommerce.service;

import com.example.ecommerce.entity.Student;
import com.example.ecommerce.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    // CREATE
    public Student createStudent(Student student) {
        return repository.save(student);
    }

    // READ ALL
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    // READ BY ID
    public Student getStudentById(Long id) {
        return repository.findById(id).orElse(null);
    }

    // UPDATE
    public Student updateStudent(Long id, Student student) {

        Student existingStudent = repository.findById(id).orElse(null);

        if (existingStudent != null) {

            existingStudent.setName(student.getName());
            existingStudent.setEmail(student.getEmail());
            existingStudent.setAge(student.getAge());

            return repository.save(existingStudent);
        }

        return null;
    }

    // DELETE
    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}