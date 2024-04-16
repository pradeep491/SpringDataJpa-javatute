package com.test.service;

import com.test.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentService {
    public Student findstudentbyid(int id);
    public Student getOneStudent(int id);
}
