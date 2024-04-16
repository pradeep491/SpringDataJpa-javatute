package com.test.service;

import com.test.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentService {
    public Student saveandflush(Student student);

    public Student findstudentbyid(int id);
}
