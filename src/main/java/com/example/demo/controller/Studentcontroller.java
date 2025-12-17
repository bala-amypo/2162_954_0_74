package com.example.demo.contoller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

package com.example.demo.controller;
package com.example.demo.entity;
package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Studententity;
import com.example.demo.service.Studentservice;



@RestController
public class Studentcontroller{
    @Autowired
    StudService ser;
    @PostMapping("/Postadd")
    public StudEntity post(@RequestBody StudEntity st){
        return ser.saveData(st);
    }
    @GetMapping("/Getadd/{id}")
    public StudEntity get(@PathVariable int id){
        return ser.getStudent(id);
    }
    @GetMapping("/getall")
    public Map<Integer, Studententity> getAllStudents() {
        return ser.getAllStudents();
    }

    @GetMapping("/getAll")
    public Map<Integer,StudEntity>getAllStudents(){
        return ser.getAllStudents();
    }
    @PutMapping("/update/{id}")
    public StudEntity update(@PathVariable int id,@RequestBody StudEntity st){
        return ser.updateStudent(id,st);
    }
}