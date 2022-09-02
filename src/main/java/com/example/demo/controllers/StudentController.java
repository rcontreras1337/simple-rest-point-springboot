package com.example.demo.controllers;

import com.example.demo.models.Student;
import com.example.demo.services.StudentServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentServiceImpl studentService;

    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "getStudents")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
}
