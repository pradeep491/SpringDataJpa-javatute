package com.test.SpringDataJpaEx1.repos;

import com.test.SpringDataJpaEx1.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query("select s from Student s where s.name = ?1")
    public List<Student> findStudents(String name);

    @Query(value = "select * from student s where s.name=?1", nativeQuery = true)
    public List<Student> findStudentsUsingNativeQuery(String name);

    @Query("select s from Student s where s.rollNumber = ?1")
    public List<Student> findStudentsUsingRno(String rollno);
    @Query(value = "select * from student s where s.roll_number = ?1",nativeQuery = true)
    public List<Student> findStudentsUsingNativeQueryRno(String rollno);
}
