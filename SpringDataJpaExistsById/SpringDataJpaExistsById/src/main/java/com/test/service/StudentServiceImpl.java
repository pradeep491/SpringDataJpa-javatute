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

    @Transactional(readOnly = true)
    @Override
    public boolean existsbyid(int id) {
        if (repo.existsById(id)) {
            log.info("student exists for the id:{}",id);
            return true;
        }
        return false;
    }
}
