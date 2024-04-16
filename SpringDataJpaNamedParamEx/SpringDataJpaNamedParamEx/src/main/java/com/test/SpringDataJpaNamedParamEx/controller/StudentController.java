package com.test.SpringDataJpaNamedParamEx.controller;

import com.test.SpringDataJpaNamedParamEx.entity.Student;
import com.test.SpringDataJpaNamedParamEx.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentData")
public class StudentController {
    @Autowired
    StudentService service;

    @PostMapping("/saveStudents")
    public List<Student> saveStudents(@RequestBody List<Student> student) {
        List<Student> list = (List<Student>) service.saveStudents(student);
        return list;
    }

    @GetMapping("/findStudents/{name}")
    public List<Student> findStudentsByName(@PathVariable("name") String name) {
        List<Student> list = (List<Student>) service.findStudents(name);
        return list;
    }

    @GetMapping("/findStudentsbyNameAndRno/{name}/{rno}")
    public List<Student> findStudentsByNameAndRno(@PathVariable("name") String name,
                                                  @PathVariable("rno") String rno) {
        List<Student> list = (List<Student>) service.findStudentsbyNameAndRno(name, rno);
        return list;
    }

    @GetMapping("/findStudentsbyNameOrRno/{name}/{rno}")
    public List<Student> findStudentsByNameOrRno(@PathVariable("name") String name,
                                                 @PathVariable("rno") String rno) {
        List<Student> list = (List<Student>) service.findStudentsbyNameOrRno(name, rno);
        return list;
    }
}
