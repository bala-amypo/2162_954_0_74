package com.example.demo.controller;

import java.util.Map;

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
        return service.save(student);
    }

    @GetMapping("/{id}")
    public StudentEntity get(@PathVariable int id) {
        return service.getById(id);
    }

    @GetMapping("/all")
    public Map<Integer, StudentEntity> getAll() {
        return service.getAll();
    }

    @PutMapping("/update/{id}")
    public StudentEntity update(@PathVariable int id, @RequestBody StudentEntity student) {
        return service.update(id, student);
    }
}
