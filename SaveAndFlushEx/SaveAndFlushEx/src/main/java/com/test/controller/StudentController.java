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

    @PostMapping("/saveandflush")
    public Student saveandflush(@RequestBody Student student) {
        Student s = service.saveandflush(student);
        return s;
    }

    @GetMapping("/findbyid/{id}")
    public Student findbyid(@PathVariable int id) {
        Student student = service.findstudentbyid(id);
        return student;
    }
}
