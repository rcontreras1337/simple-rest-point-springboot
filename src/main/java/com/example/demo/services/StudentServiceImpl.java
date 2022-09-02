package com.example.demo.services;

import com.example.demo.interfaces.StudentDAO;
import com.example.demo.interfaces.StudentRepository;
import com.example.demo.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Servicio que se usara por el controlador para la generación del endpoint de Student
 */
@Service
public class StudentServiceImpl implements StudentDAO {

    private final StudentRepository studentRepository;
    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /** método que obtiene la lista de estudiantes heredada del DAO
     * @return List<Student>
     */
    @Override
    public List<Student> getStudentsList() {
        return studentRepository.findAll();
    }

    /**
     * @param student student
     */
    @Override
    public void addNewStudent(Student student) {
        Optional<Student> studentXEmail = studentRepository.findStudentXEmail(student.getEmail());
        if (studentXEmail.isPresent()) {
            throw new IllegalStateException("Email Existente");
        }
        // Si entra al throw no se ejecutara esta línea, por eso no está en el else
        studentRepository.save(student);

    }

}
