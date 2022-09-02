package com.example.demo.controllers;

import com.example.demo.models.Student;
import com.example.demo.services.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controlador para los end point de Student
 */
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentServiceImpl studentService;

    /**
     * @param studentService studentService
     */
    @Autowired
    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    /**
     * @return List<Student>
     */
    @GetMapping(path = "getStudents")
    public List<Student> getStudents(){
        return studentService.getStudentsList();
    }
}
