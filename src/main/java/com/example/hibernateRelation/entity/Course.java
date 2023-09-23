package com.example.hibernateRelation.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name="NAME_COURSE")
    private String nameCourse;

//    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "courses")
//    private Set<Student> students;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

}
