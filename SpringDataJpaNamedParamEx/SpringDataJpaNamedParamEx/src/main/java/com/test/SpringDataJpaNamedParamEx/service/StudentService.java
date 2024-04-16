package com.test.SpringDataJpaNamedParamEx.service;

import com.test.SpringDataJpaNamedParamEx.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentService {
    public List<Student> saveStudents(List<Student> student);
    public List<Student> findStudents(String name);
    public List<Student> findStudentsbyNameAndRno(String name,String rno);
    public List<Student> findStudentsbyNameOrRno(String name,String rno);
}
