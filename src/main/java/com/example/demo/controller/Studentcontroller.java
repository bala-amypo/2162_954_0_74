package com.example.demo.Contoller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotion.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.StudEntity;
import com.example.demo.Service.StudService;

@RestController
public class Studctl{
    @Autowired
    StudService ser;
    @PostMapping("/Postadd")
    public StudEntity post(@RequestBody StudEntity st){
        return ser.saveData(st);
    }
    @GetMapping("/Getadd/{id}")
    public StudEntity get(@PathVariable int id){
        return ser.getAllStudent(id);
    }
}