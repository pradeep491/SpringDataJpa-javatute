package com.test.repo;

import com.test.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    public List<Student> findByNameOrNameIsNull(String name);
    public List<Student> findByNameIsNull();
    public List<Student> findByNameAndUniversityOrNameIsNull(String name,String university);
}
