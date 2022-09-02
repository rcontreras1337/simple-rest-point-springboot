package com.example.demo.controllers;

import com.example.demo.models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @GetMapping(path = "getStudents")
    public List<Student> getStudents(){
        return Arrays.asList(
            new Student(
                1L,
                "Ruben",
                "ruben4tip@gmail.com",
                LocalDate.of(1994, Month.AUGUST,17),
                (short) 28
            )
        );
    }
}
