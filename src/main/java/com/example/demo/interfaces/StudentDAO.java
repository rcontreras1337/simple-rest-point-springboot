package com.example.demo.interfaces;

import com.example.demo.models.Student;

import java.util.List;

/**
 * Clase que se implementa en servicio para crear todos los metodos que se necesitan, seran metodos
 * heredados
 */
public interface StudentDAO {

     List<Student> getStudentsList();

}