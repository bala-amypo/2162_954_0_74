package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;

@Service
public class StudentService {

    private final Map<Integer, StudentEntity> store = new HashMap<>();

    public StudentEntity save(StudentEntity student) {
        store.put(student.getId(), student);
        return student;
    }

    public StudentEntity getById(int id) {
        return store.get(id);
    }

    public Map<Integer, StudentEntity> getAll() {
        return store;
    }

    public StudentEntity update(int id, StudentEntity student) {
        store.put(id, student);
        return student;
    }
}
