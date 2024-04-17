package com.test.SpringDataJpaEx1.service;

import com.test.SpringDataJpaEx1.model.Student;
import com.test.SpringDataJpaEx1.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repo;

    public StudentServiceImpl(StudentRepository repo) {
        this.repo = repo;
    }

    @Transactional
    @Override
    public List<Student> saveAllStudents(List<Student> students) {
        List<Student> student = repo.saveAll(students);
        if (student == null) {
            throw new RuntimeException("No Students saved");
        }
        return student;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Student> findStudents(String name) {
        List<Student> student = repo.findStudents(name);
        if (student == null) {
            throw new RuntimeException("No Students found for the name-" + name);
        }
        return student;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Student> findStudentsUsingNativeQuery(String name) {
        List<Student> student = repo.findStudentsUsingNativeQuery(name);
        if (student == null) {
            throw new RuntimeException("No Students found for the name-" + name);
        }
        return student;
    }

    @Override
    public List<Student> findStudentsUsingRno(String rollno) {
        return repo.findStudentsUsingRno(rollno);
    }

    @Override
    public List<Student> findStudentsUsingNativeQueryRno(String rollno) {
        return repo.findStudentsUsingNativeQueryRno(rollno);
    }

}
