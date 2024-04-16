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

    @GetMapping("/findByRnoGreaterThan/{rno}")
    public List<Student> findByRnoGreaterThan(@PathVariable("rno") String rno) {
        List<Student> list = (List<Student>) service.findStudentsByRnoGreaterThan(rno);
        return list;
    }

    @GetMapping("/findByRnoGreaterThanEqual/{rno}")
    public List<Student> findByRnoGreaterThanEqual(@PathVariable("rno") String rno) {
        List<Student> list = (List<Student>) service.findStudentsByRnoGreaterThanEqual(rno);
        return list;
    }
    @GetMapping("/findByRnoLessThan/{rno}")
    public List<Student> findByRnoLessThan(@PathVariable("rno") String rno) {
        List<Student> list = (List<Student>) service.findStudentsByRnoLessThan(rno);
        return list;
    }

    @GetMapping("/findByRnoLessThanEqual/{rno}")
    public List<Student> findByRnoLessThanEqual(@PathVariable("rno") String rno) {
        List<Student> list = (List<Student>) service.findStudentsByRnoLessThanEqual(rno);
        return list;
    }
}
