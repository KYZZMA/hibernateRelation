package com.example.hibernateRelation.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "course_student")
public class Course_Student {
    @Id
    @Column(name = "courseid")
    private Integer courseId;
    @Column(name = "studentid")
    private Integer studentId;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
}
