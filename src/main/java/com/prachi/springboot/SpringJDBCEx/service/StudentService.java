package com.prachi.springboot.SpringJDBCEx.service;

import com.prachi.springboot.SpringJDBCEx.model.Student;
import com.prachi.springboot.SpringJDBCEx.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student s1){
        repo.save(s1);


    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
