package com.example.demo.controllers;

import com.example.demo.models.Student;
import com.example.demo.services.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador para los end point de Student
 */
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentServiceImpl studentService;

    /**
     * @param studentService studentService
     */
    @Autowired
    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    /** End Point Listar estudiantes
     * @return List<Student>
     */
    @GetMapping(path = "getStudents")
    public List<Student> getStudents(){
        return studentService.getStudentsList();
    }

    /** End Point Guardar estudiantes
     * @param student student
     */
    @PostMapping(path = "saveStudent")
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }

    /** End Point borrar estudiante
     * @param studentId studentId
     */
    @DeleteMapping(path = "deleteStudent/{studentId}")
    // El PathVariable indica cuál es la variable que recibe el deleteMapping que es igual
    // al que se declara arriba en la anotación
    // DESTACAR QUE SI LA VARIABLE QUE RECIBE TIENE EL MISMO NOMBRE QUE LA VARIABLE QUE SE LE PASA,
    // NO ES NECESARIO INDICARLE AL @PathVariable A DONDE IRA LA VARIABLE QUE RECIBE EL MÉTODO
    public void deleteStudent(@PathVariable("studentId") Long studentId){
        studentService.deleteStudent(studentId);
    }

    /** End Point guardar estudiante
     * @param name name
     * @param email email
     * @param studentId studentId
     */
    @PutMapping(path = "updateStudent/{studentId}")
    public void updateStudent(
        @RequestParam( required = false) String name,
        @RequestParam( required = false) String email,
        @PathVariable Long studentId){
        studentService.updateStudent(studentId, name, email);
    }

}
