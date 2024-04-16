package com.test.SpringDataJpaNamedParamEx.repo;

import com.test.SpringDataJpaNamedParamEx.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query("select s from Student s where s.name=:name")
    public List<Student> findStudents(@Param("name") String name);

    @Query(value = "select * from student s where s.name=:name and s.roll_number=:rno",nativeQuery = true)
    public List<Student> findStudentsByNativeNameAndRno(@Param("name") String name, @Param("rno") String rno);

    @Query("select s from Student s where s.name=:name or s.rollNumber=:rno")
    public List<Student> findStudentsByNameOrRno(@Param("name") String name, @Param("rno") String rno);
}
