package com.example.hibernateRelation.service;

import com.example.hibernateRelation.entity.Course;
import com.example.hibernateRelation.entity.Student;
import com.example.hibernateRelation.entity.StudentDao;
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

       String jpql = "SELECT c FROM StudentCourse c";
//        String jpql = "SELECT c FROM Student c WHERE id = 1";
//        String jpql = "select student_id from list_student_on_course group by student_id";
        TypedQuery<Student> query = entityManager.createQuery(jpql, Student.class);


//        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
//        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
//        Root<Student> studentRoot = criteriaQuery.from(Student.class);
//        criteriaQuery.orderBy(criteriaBuilder.desc(studentRoot.get("nameStudent")));
//        List<Student> students = entityManager.createQuery(criteriaQuery).getResultList();

//        return studentDao.findByNameStudent("Саша");

        return query.getResultList();


    }


}
