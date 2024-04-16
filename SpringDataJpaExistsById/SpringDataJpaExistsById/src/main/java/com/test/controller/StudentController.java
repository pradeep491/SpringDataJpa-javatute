package com.test.controller;

import com.test.entity.Student;
import com.test.repo.StudentRepository;
import com.test.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/studentData")
@Slf4j
public class StudentController {
    @Autowired
    StudentService service;

    @Autowired
    private StudentRepository repo;

    @GetMapping("/existsbyid/{id}")
    public Student existsbyid(@PathVariable int id) {
        if (service.existsbyid(id)) {
            log.info("student found and fetching the details for the id:{}", id);
            Optional<Student> student = repo.findById(id);
            return student.get();
        } else {
            throw new RuntimeException("student does not exist for the id:"+id);
        }
    }
}
