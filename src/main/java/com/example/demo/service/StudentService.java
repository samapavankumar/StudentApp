package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public String getStudentResult(String name) {
        int marks = repo.getMarks();

        if (marks >= 35) {
            return name + " passed with " + marks + " marks";
        } else {
            return name + " failed with " + marks + " marks"+ " Pora Bayataki";
        }
    }
} 
