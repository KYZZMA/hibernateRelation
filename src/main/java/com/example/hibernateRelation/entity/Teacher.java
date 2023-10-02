package com.example.hibernateRelation.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name="NAME_TEACHER")
    private String nameTeacher;


//    @JsonIgnore
//    @OneToMany(mappedBy = "teacher")
//    private List<Course> courses;

    @ManyToMany
    @JoinTable(name = "TeacherCourse",
            joinColumns = @JoinColumn(name = "TEACHER_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "COURSE_ID", referencedColumnName = "ID")
    )
    private List<Course> courses;



    @ManyToMany
    @JoinTable(name = "TeacherStudent",
            joinColumns = @JoinColumn(name = "TEACHER_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "STUDENT_ID", referencedColumnName = "ID")
    )
    private List<Student> students;


    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }


    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

//    public List<Course> getCourses() {
//        return courses;
//    }
//
//    public void setCourses(List<Course> courses) {
//        this.courses = courses;
//    }
}
