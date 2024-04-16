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

    @DeleteMapping("/delete")
    public String deletebyid(@RequestBody Student s) {
            service.delete(s);
            return s.getId()+" record deleted successfully...!";
    }

    @DeleteMapping("/deleteallinbatch")
    public String deleteallinbatch() {
        service.deleteallinbatch();
        return "all record deleted successfully...!";
    }
    @PostMapping("/savestudents")
    public List<Student> deleteallinbatch(@RequestBody List<Student> student) {
        List<Student> list = service.saveAllStudents(student);
        return list;
    }
}
