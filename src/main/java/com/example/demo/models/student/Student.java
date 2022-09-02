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
