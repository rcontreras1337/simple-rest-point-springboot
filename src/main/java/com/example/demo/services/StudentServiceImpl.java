package com.example.demo.services;

import com.example.demo.interfaces.StudentDAO;
import com.example.demo.interfaces.StudentRepository;
import com.example.demo.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
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

    /**
     * método que obtiene la lista de estudiantes heredada del DAO
     *
     * @return List<Student>
     */
    @Override
    public List<Student> getStudentsList() {
        return studentRepository.findAll();
    }

    /**
     * Método para guardar un nuevo estudiante
     *
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

    /**
     * Método para borrar un estudiante
     *
     * @param studentId studentId
     */
    @Override
    public void deleteStudent(Long studentId) {
        boolean existsById = studentRepository.existsById(studentId);
        if (!existsById) {
            throw new IllegalStateException("El estudiante de ID: " + studentId + " NO EXISTE");
        }
        // Si entra al throw no se ejecutara esta línea, por eso no está en el else
        studentRepository.deleteById(studentId);
    }

    /**
     * Método para actualizar un estudiante
     *
     * @param studentId studentId
     * @param name      name
     * @param email     email
     */
    @Override
    @Transactional
    public void updateStudent(Long studentId, String name, String email) {
        // La anotación @Transactional manejará este end point de forma automática sin necesidad
        // de tener que hacer Query's para que funcione esto

        // Validamos que exista el estudiante
        Student student = studentRepository.findById(studentId)
            .orElseThrow(() -> new IllegalStateException(
                "El estudiante con : " + studentId + " NO EXISTE"
            ));

        if (name != null && name.length() > 0 && !Objects.equals(student.getName(), name)) {
            student.setName(name);
        }

        if (email != null && email.length() > 0 && !Objects.equals(student.getEmail(), email)) {
            Optional<Student> studentXEmail = studentRepository.findStudentXEmail(email);
            if(studentXEmail.isPresent()){
                throw new IllegalStateException("El Email ya existe");
            }
            student.setEmail(email);
        }
    }

}
