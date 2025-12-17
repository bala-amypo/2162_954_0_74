package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/add")
    public StudentEntity add(@RequestBody StudentEntity student) {
        return service.addStudent(student);
    }

    @GetMapping("/all")
    public List<StudentEntity> getAll() {
        return service.getAllStudents();
    }

    @GetMapping("/{id}")
    public Optional<StudentEntity> getOne(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    @PutMapping("/update/{id}")
    public StudentEntity update(@PathVariable Long id, @RequestBody StudentEntity student) {
        return service.updateStudent(id, student);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteStudent(id);
        return "Student deleted successfully";
    }
}
