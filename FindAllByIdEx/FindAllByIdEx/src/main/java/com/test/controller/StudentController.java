package com.test.controller;

import com.test.dto.IdContainer;
import com.test.entity.Student;
import com.test.repo.StudentRepository;
import com.test.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/studentData")
@Slf4j
public class StudentController {
    @Autowired
    StudentService service;

    @PostMapping("/findallbyid")
    public List<Student> findallbyid(@RequestBody List<IdContainer> ids) {

        List<Integer> list = new ArrayList<>();
        for(IdContainer i : ids){
            list.add(i.getId());
        }
        List<Student> s = service.findallbyid(list);
        return s;
    }
}
