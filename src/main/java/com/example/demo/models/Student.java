package com.example.demo.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity //Hibernete
@Table(name = "students", schema = "student") // Tabla de base datos
public class Student {
    @Id
    @SequenceGenerator(
        name = "student_sequence",
        sequenceName = "student_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "student_sequence"
    )
    private Long idStudent;
    private String name;
    private String email;
    private LocalDate dateOfBirthDay;
    private Short age;

    public Student() {
    }

    public Student(Long idStudent, String name, String email, LocalDate dateOfBirthDay, Short age) {
        this.idStudent = idStudent;
        this.name = name;
        this.email = email;
        this.dateOfBirthDay = dateOfBirthDay;
        this.age = age;
    }

    public Student(String name, String email, LocalDate dateOfBirthDay, Short age) {
        this.name = name;
        this.email = email;
        this.dateOfBirthDay = dateOfBirthDay;
        this.age = age;
    }

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirthDay() {
        return dateOfBirthDay;
    }

    public void setDateOfBirthDay(LocalDate dateOfBirthDay) {
        this.dateOfBirthDay = dateOfBirthDay;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
            "idStudent=" + idStudent +
            ", name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", dateOfBirthDay=" + dateOfBirthDay +
            ", age=" + age +
            '}';
    }
}
