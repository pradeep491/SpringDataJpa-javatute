package com.test.controller;

import com.test.entity.Student;
import com.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/studentData")
public class StudentController {
    @Autowired
    StudentService service;

    @GetMapping("/findbyid/{id}")
    public Student findbyid(@PathVariable("id") int id) {
        Student list = service.findstudentbyid(id);
        return list;
    }

    @GetMapping("/getOne/{id}")
    public Student getone(@PathVariable("id") int id) {
        Student list = service.getOneStudent(id);
        return list;
    }
}
