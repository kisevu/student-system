package com.ameda.kevin.studentsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ameda.kevin.studentsystem.model.Student;

@Service
public interface StudentService {
    public Student registerStudent(Student student);

    public List<Student> getStudents();

    public Student getStudent(Integer id);
}
