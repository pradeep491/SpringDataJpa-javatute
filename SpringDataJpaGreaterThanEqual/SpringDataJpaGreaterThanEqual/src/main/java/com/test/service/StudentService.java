package com.test.service;

import com.test.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentService {
    public List<Student> findStudentsByRnoGreaterThan(String rno);
    public List<Student> findStudentsByRnoGreaterThanEqual(String rno);
    public List<Student> findStudentsByRnoLessThan(String rno);
    public List<Student> findStudentsByRnoLessThanEqual(String rno);
}
