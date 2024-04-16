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

    @PostMapping("/saveall")
    public List<Student> savell(@RequestBody List<Student> student) {
        List<Student> s = service.saveallsttudents(student);
        return s;
    }

    @DeleteMapping("/deletebyid/{id}")
    public String deletebyid(@PathVariable int id) {
        service.deletebyid(id);
        return "Student record for the id:"+id+" deleted successfully...!";
    }
}
