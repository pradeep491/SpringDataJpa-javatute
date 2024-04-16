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

    @GetMapping("/findbynameisnull")
    public List<Student> findByRnoGreaterThan() {
        List<Student> list = (List<Student>) service.findbynameisnull();
        return list;
    }

    @GetMapping("/findbynameornameisnull/{name}")
    public List<Student> findByRnoGreaterThanEqual(@PathVariable("name") String name) {
        List<Student> list = (List<Student>) service.findbynameornameisnull(name);
        return list;
    }

    @GetMapping("/findbynameanduniversityornameisnull/{name}/{university}")
    public List<Student> findByRnoLessThan(@PathVariable("name") String name, @PathVariable("university") String university) {
        List<Student> list = (List<Student>) service.findbynameanduniversityornameisnull(name, university);
        return list;
    }

    @PostMapping("/savestudents")
    public List<Student> savestudents(@RequestBody List<Student> student) {
        List<Student> list = (List<Student>) service.saveAllStudents(student);
        return list;
    }

}
