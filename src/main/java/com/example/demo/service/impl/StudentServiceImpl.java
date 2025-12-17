package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo repo;

    @Override
    public StudentEntity addStudent(StudentEntity student) {
        return repo.save(student);
    }

    @Override
    public List<StudentEntity> getAllStudents() {
        return repo.findAll();
    }

    @Override
    public Optional<StudentEntity> getStudentById(Long id) {
        return repo.findById(id);
    }

    @Override
    public StudentEntity updateStudent(Long id, StudentEntity student) {
        return repo.findById(id)
                .map(existing -> {
                    existing.setName(student.getName());
                    existing.setEmail(student.getEmail());
                    return repo.save(existing);
                })
                .orElse(null);
    }

    @Override
    public void deleteStudent(Long id) {
        repo.deleteById(id);
    }
}
