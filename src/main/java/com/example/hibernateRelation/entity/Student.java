package com.example.hibernateRelation.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Student {

    @Id
    @Column(name = "studentid")
    private Integer studentId;

    @Column(name = "studentname")
    private String studentName;


    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
