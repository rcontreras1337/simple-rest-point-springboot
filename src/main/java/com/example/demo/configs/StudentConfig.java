package com.example.demo.configs;

import com.example.demo.interfaces.StudentRepository;
import com.example.demo.models.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
        StudentRepository repository) {
        return args -> {
            Student ruben = new Student(
                "Ruben",
                "ruben4tip@gmail.com",
                LocalDate.of(1994, Month.AUGUST, 17),
                (short) 28
            );
            Student carlos = new Student(
                "Carlos",
                "carlos4tip@gmail.com",
                LocalDate.of(1993, Month.AUGUST, 17),
                (short) 29
            );

            repository.saveAll(Arrays.asList(ruben,carlos));
        };
    }
}
