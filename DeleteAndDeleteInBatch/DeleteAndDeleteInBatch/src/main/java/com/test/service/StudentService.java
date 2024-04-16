package com.test.service;

import com.test.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentService {
    public void delete(Student s);
    public void deleteallinbatch();

    public List<Student> saveAllStudents(List<Student> list);
}
