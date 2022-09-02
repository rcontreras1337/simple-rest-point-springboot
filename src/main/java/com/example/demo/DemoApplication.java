package com.example.demo;

import com.example.demo.models.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;


@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping
    public List<Student> helloWorld(){
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
