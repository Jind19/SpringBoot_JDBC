package com.prachi.springboot.SpringJDBCEx.repo;

import com.prachi.springboot.SpringJDBCEx.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {


    public void save(Student s1) {
        System.out.println("Student added");
    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        return students;
    }
}
