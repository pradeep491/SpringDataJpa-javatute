package com.test.repo;

import com.test.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    public List<Student> findByRollNumberGreaterThan(String rno);
    public List<Student> findByRollNumberGreaterThanEqual(String rno);
    public List<Student> findByRollNumberLessThan(String rno);
    public List<Student> findByRollNumberLessThanEqual(String rno);
}
