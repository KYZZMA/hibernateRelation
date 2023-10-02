package com.example.hibernateRelation.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Teacher {

    @Id
    @Column(name = "teacherid")
    private Integer teacherId;

    @Column(name = "teachername")
    private String teacherName;

    @ManyToMany
    @JoinTable(name = "Teacher_Course",
            joinColumns = @JoinColumn(name = "teacherid", referencedColumnName = "teacherId"),
            inverseJoinColumns = @JoinColumn(name = "courseid", referencedColumnName = "courseId")
    )
    private Set<Course> courses;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
