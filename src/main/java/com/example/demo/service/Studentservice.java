package com.example.demo.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.StudEntity;

@Service
public class Studentservice{
    Map<Integer,StudEntity>details=new HashMap<>();

    public StudEntity saveData(StudEntity st){
        details.put(st.getId(),st);
        return st;
    }
    public StudEntity getStudent(int id){
        return details.get(id);
    }
    public Map<Integer,StudEntity>getAllStudents(){
        return details;
    }
    public StudEntity updateStudent(int id,StudEntity st){
        if(details.containsKey(id)){
            details.put(id,st);
            return st;
        }
        return null;
    }
    
    }