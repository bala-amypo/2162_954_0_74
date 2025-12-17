package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.entity.Studententity;

import java.util.HashMap;
import java.util.Map;

@Service
public class Studentservice {

    private Map<Integer, Studententity> db = new HashMap<>();

    public Studententity saveData(Studententity st) {
        db.put(st.getId(), st);
        return st;
    }

    public Studententity getStudent(int id) {
        return db.get(id);
    }

    public Map<Integer, Studententity> getAllStudents() {
        return db;
    }

    public Studententity updateStudent(int id, Studententity st) {
        db.put(id, st);
        return st;
    }
}
