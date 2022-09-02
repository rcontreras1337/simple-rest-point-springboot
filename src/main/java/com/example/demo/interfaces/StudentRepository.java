package com.example.demo.interfaces;

import com.example.demo.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// T es la clase que se utilizara del modelo y ID es la primary key
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
