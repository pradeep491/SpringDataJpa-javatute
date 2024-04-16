package com.test.SpringDataJpaEx1.service;

import com.test.SpringDataJpaEx1.model.Student;
import com.test.SpringDataJpaEx1.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repo;

    @Transactional
    @Override
    public List<Student> saveAllStudents(List<Student> students) {
        List<Student> student = (List<Student>) repo.saveAll(students);
        if (student == null) {
            throw new RuntimeException("No Students saved");
        }
        return student;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Student> findStudents(String name) {
        List<Student> student = (List<Student>)repo.findStudents(name);
        if (student == null) {
            throw new RuntimeException("No Students found for the name-" + name);
        }
        return student;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Student> findStudentsUsingNativeQuery(String name) {
        List<Student> student = (List<Student>)repo.findStudentsUsingNativeQuery(name);
        if (student == null) {
            throw new RuntimeException("No Students found for the name-" + name);
        }
        return student;
    }

    @Override
    public List<Student> findStudentsUsingRno(String rollno) {
        List<Student> list = (List<Student>)repo.findStudentsUsingRno(rollno);
        return list;
    }

    @Override
    public List<Student> findStudentsUsingNativeQueryRno(String rollno) {
        List<Student> list = (List<Student>)repo.findStudentsUsingNativeQueryRno(rollno);
        return list;
    }

}
