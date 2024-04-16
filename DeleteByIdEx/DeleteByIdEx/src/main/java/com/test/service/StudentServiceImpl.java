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
    public List<Student> saveallsttudents(List<Student> student) {
        List<Student> list = repo.saveAll(student);
        return list;
    }

    @Transactional
    @Override
    public void deletebyid(int id) {
        repo.deleteById(id);
        log.info("student record deleted for the id:{}", id);
    }
}
