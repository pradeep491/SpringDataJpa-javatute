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

    @DeleteMapping("/deleteall")
    public String deleteall() {
        service.deleteAll();
        return "record deleted successfully by deleteAll()...!";
    }

    @DeleteMapping("/deleteallinbatch")
    public String deleteallinbatch() {
        service.deleteallinbatch();
        return "all record deleted successfully by deleteAllInBatch()...!";
    }

    @PostMapping("/savestudents")
    public List<Student> saveallinbatch(@RequestBody List<Student> student) {
        List<Student> list = service.saveAllStudents(student);
        return list;
    }
    @DeleteMapping("/deleteinbatch")
    public String deleteinbatch(@RequestBody List<Student> student) {
        service.deleteinbatch(student);
        return "all record deleted successfully by deleteInBatch()...!";
    }

}
