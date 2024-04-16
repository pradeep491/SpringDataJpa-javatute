package com.test.controller;

import com.test.entity.Student;
import com.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentData")
public class StudentController {
    @Autowired
    StudentService service;

    @PostMapping("/savestudents")
    public List<Student> saveallstudents(@RequestBody List<Student> student) {
        List<Student> list = (List<Student>) service.saveallstudents(student);
        return list;
    }

    @GetMapping("/findallstudents")
    public List<Student> findallstudents() {
        List<Student> list = (List<Student>) service.findallstudents();
        return list;
    }
}
