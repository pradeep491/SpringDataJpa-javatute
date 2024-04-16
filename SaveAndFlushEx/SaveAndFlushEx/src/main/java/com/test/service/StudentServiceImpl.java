package com.test.service;

import com.test.entity.Student;
import com.test.repo.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository repo;

    @Transactional
    @Override
    public Student saveandflush(Student student) {
        Student s = repo.saveAndFlush(student);
        return s;
    }

    @Transactional(readOnly = true)
    @Override
    public Student findstudentbyid(int id) {
        Optional<Student> s = repo.findById(id);
        if (s.isPresent()) {
            return s.get();
        } else {
            throw new RuntimeException("student not found for the id:" + id);
        }
    }
}
