package com.example.hibernateRelation.controller;

import com.example.hibernateRelation.entity.Course;
import com.example.hibernateRelation.entity.Student;
import com.example.hibernateRelation.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/university")
public class UniversityController {
    @Autowired
    UniversityService universityService;

    @GetMapping("/allStudent")
    public List<Student> allStudent(){
        return universityService.allStudent();
    }

}
