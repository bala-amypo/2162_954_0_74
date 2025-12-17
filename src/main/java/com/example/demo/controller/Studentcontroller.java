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
    private Studentservice ser;

    @PostMapping("/postadd")
    public Studententity post(@RequestBody Studententity st) {
        return ser.saveData(st);
    }

    @GetMapping("/getadd/{id}")
    public Studententity get(@PathVariable int id) {
        return ser.getStudent(id);
    }

    @GetMapping("/getall")
    public Map<Integer, Studententity> getAllStudents() {
        return ser.getAllStudents();
    }

    @PutMapping("/update/{id}")
    public Studententity update(@PathVariable int id, @RequestBody Studententity st) {
        return ser.updateStudent(id, st);
    }
}
