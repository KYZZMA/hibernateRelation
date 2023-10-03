package com.example.hibernateRelation.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "teacher_course")
public class Teacher_Course {
    @Id
    @Column(name = "teacherid")
    private Integer teacherId;

    @Column(name = "courseid")
    private Integer courseId;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}
