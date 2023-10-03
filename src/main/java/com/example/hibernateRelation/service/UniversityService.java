package com.example.hibernateRelation.service;

import com.example.hibernateRelation.entity.Student;
import com.example.hibernateRelation.entity.Teacher;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityService {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public List<Student> allStudent(){


        String jpql = "select studentId from StudentCourse GROUP BY studentId HAVING COUNT(studentId)=1";

        TypedQuery<Student> query = entityManager.createQuery(jpql, Student.class);

        return query.getResultList();


    }
    @Transactional
    public List<Teacher> allTeacher(){


//       String jpql = "SELECT c FROM Teacher c";
//       String jpql = "select tc from Teacher_Course tc";
       String jpql = "select c from Course c";
//       String jpql = "SELECT t.teacherName, c.courseName FROM Teacher t join Teacher_Course tc on tc.teacherid = t.teacherid join Course c on tc.courseid = c.courseid";

       //select teacher.teacherName, course.coursename
        //from teacher
        // join teacher_course on teacher_course.teacherid = teacher.teacherid
        //join course on teacher_course.courseid = course.courseid

       //select teacher.teacherName, course.coursename, course_student.courseid, student.studentname, course_student.studentid
        //from teacher
        // join teacher_course on teacher_course.teacherid = teacher.teacherid
        // join course on teacher_course.courseid = course.courseid
        // join course_student on course_student.courseid = course.courseid
        // join student on course_student.studentid = student.studentid
        //

        TypedQuery<Teacher> query = entityManager.createQuery(jpql, Teacher.class);

        return query.getResultList();


    }


}
