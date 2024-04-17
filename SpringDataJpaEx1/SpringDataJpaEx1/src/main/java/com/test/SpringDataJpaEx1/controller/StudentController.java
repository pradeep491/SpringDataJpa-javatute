package com.test.SpringDataJpaEx1.controller;

import com.test.SpringDataJpaEx1.model.Student;
import com.test.SpringDataJpaEx1.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentData")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping("/saveStudents")
    public List<Student> saveStudents(@RequestBody List<Student> students) {
        return service.saveAllStudents(students);
    }

    @GetMapping("/findStudentsUsingNativeQuery/{name}")
    public List<Student> findStudentsNativeQuery(@PathVariable("name") String name) {
        return service.findStudentsUsingNativeQuery(name);
    }

    @GetMapping("/findStudents/{name}")
    public List<Student> findStudents(@PathVariable("name") String name) {
        return service.findStudents(name);
    }

    @GetMapping("/findStudentswithrno/{rollno}")
    public List<Student> findStudentsByRno(@PathVariable("rollno") String rollno) {
        return service.findStudentsUsingRno(rollno);
    }

    @GetMapping("/findStudentswithrno1/{rollno}")
    public List<Student> findStudentsbyrnousingnative(@PathVariable("rollno") String rollno) {
        return service.findStudentsUsingNativeQueryRno(rollno);
    }
}
