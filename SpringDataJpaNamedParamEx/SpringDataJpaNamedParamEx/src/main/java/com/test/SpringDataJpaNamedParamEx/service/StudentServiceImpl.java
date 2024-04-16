package com.test.SpringDataJpaNamedParamEx.service;

import com.test.SpringDataJpaNamedParamEx.entity.Student;
import com.test.SpringDataJpaNamedParamEx.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository repo;

    @Transactional
    @Override
    public List<Student> saveStudents(List<Student> student) {
        List<Student> list = (List<Student>)repo.saveAll(student);
        return list;
    }
    @Transactional(readOnly = true)
    @Override
    public List<Student> findStudents(String name) {
        List<Student> list = (List<Student>)repo.findStudents(name);
        return list;
    }
    @Transactional(readOnly = true)
    @Override
    public List<Student> findStudentsbyNameAndRno(String name, String rno) {
        List<Student> list = (List<Student>)repo.findStudentsByNativeNameAndRno(name,rno);
        return list;
    }
    @Transactional(readOnly = true)
    @Override
    public List<Student> findStudentsbyNameOrRno(String name, String rno) {
        List<Student> list = (List<Student>)repo.findStudentsByNameOrRno(name,rno);
        return list;
    }
}
