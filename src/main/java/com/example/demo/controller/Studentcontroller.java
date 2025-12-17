package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Studententity;
import com.example.demo.service.Studentservice;

import java.util.Map;

@RestController
@RequestMapping("/student")
public class Studentcontroller {

    @Autowired
    private Studentservice service;

    @PostMapping("/add")
    public Studententity add(@RequestBody Studententity st) {
        return service.saveData(st);
    }

    @GetMapping("/{id}")
    public Studententity get(@PathVariable int id) {
        return service.getStudent(id);
    }

    @GetMapping("/all")
    public Map<Integer, Studententity> getAll() {
        return service.getAllStudents();
    }

    @PutMapping("/{id}")
    public Studententity update(@PathVariable int id, @RequestBody Studententity st) {
        return service.updateStudent(id, st);
    }
}
