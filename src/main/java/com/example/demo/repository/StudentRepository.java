package com.example.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    public int getMarks() {
        return 90; // dummy DB value
    }
}