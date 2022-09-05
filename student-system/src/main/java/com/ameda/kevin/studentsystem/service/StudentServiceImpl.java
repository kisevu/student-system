package com.ameda.kevin.studentsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ameda.kevin.studentsystem.model.Student;
import com.ameda.kevin.studentsystem.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student registerStudent(Student student) {
        student = Student.builder()
                .name(student.getName())
                .address(student.getAddress())
                .build();
        studentRepository.save(student);
        return student;
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(Integer id) {
        return studentRepository.findById(id).get();
    }
}
