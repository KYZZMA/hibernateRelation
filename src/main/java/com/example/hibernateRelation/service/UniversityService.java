package com.example.hibernateRelation.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityService {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public List<Object[]> firstSolution() {


        String jpql = "SELECT t.teacherName, c.courseName, COUNT(cs.courseId) AS studentCount " +
                "FROM Teacher t " +
                "join Teacher_Course tc on tc.teacherId = t.teacherId " +
                "join Course c on tc.courseId = c.courseId " +
                "join Course_Student cs on cs.courseId = c.courseId " +
                "join Student s on cs.studentId = s.studentId " +
                "GROUP BY  t.teacherName,c.courseName";

        List<Object[]> allResults = entityManager.createQuery(jpql).getResultList();

        return allResults;


    }

    @Transactional
    public List<Object[]> secondSolution() {


        String jpql = "SELECT c.courseName, COUNT(cs.courseId) AS studentCount " +
                "FROM Course_Student cs " +
                "join Course c on cs.courseId = c.courseId " +
                "WHERE cs.studentId IN " +
                "( " +
                "SELECT cs.studentId " +
                "FROM Course_Student cs " +
                "GROUP BY cs.studentId " +
                "HAVING COUNT(cs.studentId)=1 " +
                ") " +
                "GROUP BY c.courseName";

        List<Object[]> allResults = entityManager.createQuery(jpql).getResultList();

        return allResults;


    }

    @Transactional
    public List<Object[]> allUniversity() {

        String jpql = "SELECT t.teacherName, c.courseName, s.studentName " +
                "FROM Teacher t " +
                "join Teacher_Course tc on tc.teacherId = t.teacherId " +
                "join Course c on tc.courseId = c.courseId " +
                "join Course_Student cs on cs.courseId = c.courseId " +
                "join Student s on cs.studentId = s.studentId";

        List<Object[]> allResults = entityManager.createQuery(jpql).getResultList();

        return allResults;

    }


}
