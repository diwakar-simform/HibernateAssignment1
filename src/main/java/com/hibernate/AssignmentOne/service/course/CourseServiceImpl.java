package com.hibernate.AssignmentOne.service.course;

import com.hibernate.AssignmentOne.entities.Course;
import com.hibernate.AssignmentOne.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    CourseRepo courseRepo;

    @Override
    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }
}
