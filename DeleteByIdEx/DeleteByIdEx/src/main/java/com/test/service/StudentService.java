package com.test.service;

import com.test.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentService {
    public List<Student> saveallsttudents(List<Student> student);
    public void deletebyid(int id);
}
