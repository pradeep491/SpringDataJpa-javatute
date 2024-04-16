package com.test.service;

import com.test.entity.Student;
import com.test.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repo;

    @Override
    public List<Student> findStudentsByRnoGreaterThan(String rno) {
        List<Student> list = (List<Student>) repo.findByRollNumberGreaterThan(rno);
        return list;
    }

    @Override
    public List<Student> findStudentsByRnoGreaterThanEqual(String rno) {
        List<Student> list = (List<Student>) repo.findByRollNumberGreaterThanEqual(rno);
        return list;
    }

    @Override
    public List<Student> findStudentsByRnoLessThan(String rno) {
        List<Student> list = (List<Student>) repo.findByRollNumberLessThan(rno);
        return list;
    }

    @Override
    public List<Student> findStudentsByRnoLessThanEqual(String rno) {
        List<Student> list = (List<Student>) repo.findByRollNumberLessThanEqual(rno);
        return list;
    }

}
