package com.test.service;

import com.test.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentService {
    public void deleteAll();
    public void deleteallinbatch();
    public void deleteinbatch(List<Student> student);
    public List<Student> saveAllStudents(List<Student> list);
}
