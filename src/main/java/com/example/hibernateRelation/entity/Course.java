package com.example.hibernateRelation.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Course {

    @Id
    @Column(name = "courseid")
    private Integer courseId;

    @Column(name = "coursename")
    private String courseName;

    @ManyToMany
    @JoinTable(name = "course_student",
            joinColumns = @JoinColumn(name = "courseid", referencedColumnName = "courseId"),
            inverseJoinColumns = @JoinColumn(name = "studentid", referencedColumnName = "studentId")
    )
    private Set<Student> students;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
