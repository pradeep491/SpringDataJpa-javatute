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
    public void deleteAll() {
        repo.deleteAll();
    }

    @Transactional
    @Override
    public void deleteallinbatch() {
        repo.deleteAllInBatch();
        log.info("all records deleted successfully...!");
    }

    @Override
    public void deleteinbatch(List<Student> student) {
        repo.deleteInBatch(student);
        log.info("all records deleted successfully...!");
    }

    @Transactional
    @Override
    public List<Student> saveAllStudents(List<Student> list) {
        List<Student> students = repo.saveAll(list);
        return students;
    }
}
