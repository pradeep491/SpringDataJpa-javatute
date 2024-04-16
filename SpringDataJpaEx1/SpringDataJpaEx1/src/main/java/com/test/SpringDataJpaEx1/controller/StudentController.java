package com.test.SpringDataJpaEx1.controller;

import com.test.SpringDataJpaEx1.model.Student;
import com.test.SpringDataJpaEx1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentData")
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping("/saveStudents")
    @ResponseBody
    public List<Student> saveStudents(@RequestBody List<Student> students) {
        List<Student> list = (List<Student>) service.saveAllStudents(students);
        return list;
    }

    @GetMapping("/findStudentsUsingNativeQuery/{name}")
    @ResponseBody
    public List<Student> findStudentsNativeQuery(@PathVariable("name") String name) {
        List<Student> list = (List<Student>) service.findStudentsUsingNativeQuery(name);
        return list;
    }

    @GetMapping("/findStudents/{name}")
    @ResponseBody
    public List<Student> findStudents(@PathVariable("name") String name) {
        List<Student> list = (List<Student>) service.findStudents(name);
        return list;
    }

    @GetMapping("/findStudentswithrno/{rollno}")
    @ResponseBody
    public List<Student> findStudentsByRno(@PathVariable("rollno") String rollno) {
        List<Student> list = (List<Student>) service.findStudentsUsingRno(rollno);
        return list;
    }

    @GetMapping("/findStudentswithrno1/{rollno}")
    @ResponseBody
    public List<Student> findStudentsbyrnousingnative(@PathVariable("rollno") String rollno) {
        List<Student> list = (List<Student>) service.findStudentsUsingNativeQueryRno(rollno);
        return list;
    }
}
