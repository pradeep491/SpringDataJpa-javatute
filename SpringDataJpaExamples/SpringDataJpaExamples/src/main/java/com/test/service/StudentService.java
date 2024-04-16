package com.test.service;

import com.test.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentService {
    public List<Student> saveAllStudents(List<Student> student);
    public List<Student> findbynameisnull();
    public List<Student> findbynameornameisnull(String name);
    public List<Student> findbynameanduniversityornameisnull(String name,String university);
}
