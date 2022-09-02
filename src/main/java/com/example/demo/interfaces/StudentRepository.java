package com.example.demo.interfaces;

import com.example.demo.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// T es la clase que se utilizara del modelo y ID es la primary key
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    /** 1 Forma de hacerlo
     * es igual que SELECT * FROM STUDENT.STUDENTS WHERE EMAIL = ?;
     * @param email email
     * @return student
     */
    Optional<Student> findStudentByEmail(String email);

    /** 2 Forma de hacerlo
     * las "s" hace referencia a que Student y como Student está mapeado a la BD
     * SpringBoot sabe como hacer la consulta
     * @param email email
     * @return student
     */
    @Query("select s from Student s where s.email =?1")
    Optional<Student> findStudentXEmail(String email);

}
