package com.example.demo.services;

import com.example.demo.interfaces.StudentDAO;
import com.example.demo.interfaces.StudentRepository;
import com.example.demo.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collections;
import java.util.List;

/**
 * Servicio que se usara por el controlador para la generacion del endpoint de Student
 */
@Service
public class StudentServiceImpl implements StudentDAO {

    private final StudentRepository studentRepository;
    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /** metodo que obtiene la lista de estudiantes
     * @return List<Student>
     */
     public List<Student> getStudents(){
        return Collections.singletonList(
            new Student(
                1L,
                "Ruben",
                "ruben4tip@gmail.com",
                LocalDate.of(1994, Month.AUGUST, 17),
                (short) 28
            )
        );
    }

    /** metodo que obtiene la lista de estudiantes herado del DAO
     * @return List<Student>
     */
    @Override
    public List<Student> getStudentsList() {
        return studentRepository.findAll();
    }

}
