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
    public void delete(Student s) {

        if (repo.existsById(s.getId())) {
            log.info("student exists for the id,deletion in progress:{}", s.getId());
            long start = System.currentTimeMillis();
            repo.delete(s);
            long end = System.currentTimeMillis();
            log.info("time taken for record deletion by delete()-" + (end - start) + "ms");
        } else {
            throw new RuntimeException("Record not found for the student id:" + s.getId());
        }
    }

    @Transactional
    @Override
    public void deleteallinbatch() {
        long start = System.currentTimeMillis();
        repo.deleteAllInBatch();
        long end = System.currentTimeMillis();
        log.info("time taken for all records deletion by deleteInBatch()-" + (end - start) + "ms");
    }

    @Transactional
    @Override
    public List<Student> saveAllStudents(List<Student> list) {
        List<Student> students = repo.saveAll(list);
        return students;
    }
}
