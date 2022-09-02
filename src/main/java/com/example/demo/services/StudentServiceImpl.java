package com.example.demo.services;

import com.example.demo.models.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

/**
 * Servicio que se usara por el controlador para la generacion del endpoint de Student
 */
@Service
public class StudentServiceImpl {

    /** metodo que obtiene la lista de estudiantes
     * @return List<Student>
     */
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
