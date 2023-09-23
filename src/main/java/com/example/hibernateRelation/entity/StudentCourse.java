package com.example.hibernateRelation.entity;

import jakarta.persistence.*;


@Entity
public class StudentCourse {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "STUDENT_ID")
    private int studentId;
    @Column(name = "COURSE_ID")
    private int courseId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
