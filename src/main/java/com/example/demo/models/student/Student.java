package com.example.demo.models.student;

import java.time.LocalDate;

public class Student {
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
}
