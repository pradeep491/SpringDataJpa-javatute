package com.test.SpringDataJpaEx1.service;

import com.test.SpringDataJpaEx1.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentService {
    public List<Student> saveAllStudents(List<Student> students);
    public List<Student> findStudents(String name);
    public List<Student> findStudentsUsingNativeQuery(String name);
    public List<Student> findStudentsUsingRno(String rollno);
    public List<Student> findStudentsUsingNativeQueryRno(String rollno);
}
