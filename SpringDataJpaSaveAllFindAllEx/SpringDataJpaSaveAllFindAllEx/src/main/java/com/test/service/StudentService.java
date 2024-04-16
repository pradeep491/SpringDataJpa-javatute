package com.test.service;

import com.test.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentService {
    public List<Student> saveallstudents(List<Student> student);
    public List<Student> findallstudents();
}
