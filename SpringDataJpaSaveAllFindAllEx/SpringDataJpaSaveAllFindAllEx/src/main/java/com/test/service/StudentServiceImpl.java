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

    @Transactional
    @Override
    public List<Student> saveallstudents(List<Student> student) {
        List<Student> list = (List<Student>)repo.saveAll(student);
        return list;
    }
    @Transactional(readOnly = true)
    @Override
    public List<Student> findallstudents() {
        List<Student> list = (List<Student>)repo.findAll();
        return list;
    }
}
