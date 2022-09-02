package com.example.demo.interfaces;

import com.example.demo.models.Student;

import java.util.List;

/**
 * Clase que se implementa en servicio para crear todos los metodos que se necesitan, seran metodos
 * heredados
 */
public interface StudentDAO {

     /**
      * @return List<Student>
      */
     List<Student> getStudentsList();

     /**
      * @param student student
      */
     void addNewStudent(Student student);

     /**
      * @param studentId studentId
      */
     void deleteStudent(Long studentId);

     /**
      * @param studentId studentId
      * @param name name
      * @param email email
      */
     void updateStudent(Long studentId, String name, String email);
}
