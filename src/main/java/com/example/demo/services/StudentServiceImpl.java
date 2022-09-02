package com.example.demo.services;

import com.example.demo.models.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class StudentServiceImpl {

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
