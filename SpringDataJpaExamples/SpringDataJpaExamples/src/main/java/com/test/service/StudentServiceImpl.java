package com.test.service;

import com.test.entity.Student;
import com.test.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repo;

    @Override
    public List<Student> saveAllStudents(List<Student> student) {
        List<Student> list = (List<Student>) repo.saveAll(student);
        return list;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Student> findbynameisnull() {
        List<Student> list = (List<Student>) repo.findByNameIsNull();
        return list;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Student> findbynameornameisnull(String name) {
        List<Student> list = (List<Student>) repo.findByNameOrNameIsNull(name);
        return list;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Student> findbynameanduniversityornameisnull(String name, String university) {
        List<Student> list = (List<Student>) repo.findByNameAndUniversityOrNameIsNull(name, university);
        return list;
    }
}
