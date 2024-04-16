package com.test.service;

import com.test.entity.Student;
import com.test.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repo;


    @Transactional(readOnly = true)
    @Override
    public Student findstudentbyid(int id) {
        Optional<Student> student = repo.findById(id);
        Student s = student.get();
        return s;
    }
    @Transactional(readOnly = true)
    @Override
    public Student getOneStudent(int id) {
        Student student = repo.getOne(id);
        String name = student.getName();
        return student;
    }
}
