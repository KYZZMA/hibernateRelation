package com.example.hibernateRelation.service;

import com.example.hibernateRelation.entity.Course;
import com.example.hibernateRelation.entity.Student;
import com.example.hibernateRelation.entity.StudentDao;
import com.example.hibernateRelation.entity.Teacher;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UniversityService {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public List<Student> allStudent(){

//       String jpql = "SELECT c FROM StudentCourse c";
       String jpql = "SELECT c FROM Student c";
//        String jpql = "SELECT c FROM Student c WHERE id = 1";
//        String jpql = "select student_id from list_student_on_course group by student_id";
//        String jpql = "select studentId from StudentCourse GROUP BY studentId HAVING COUNT(studentId)=1";
//        select student_id from student_course GROUP BY student_id HAVING COUNT(student_id)=1
        TypedQuery<Student> query = entityManager.createQuery(jpql, Student.class);

        return query.getResultList();


    }
    @Transactional
    public List<Teacher> allTeacher(){


       String jpql = "SELECT c FROM Teacher c";

        TypedQuery<Teacher> query = entityManager.createQuery(jpql, Teacher.class);

        return query.getResultList();


    }


}
