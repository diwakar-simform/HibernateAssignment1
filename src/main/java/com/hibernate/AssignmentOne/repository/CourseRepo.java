package com.hibernate.AssignmentOne.repository;

import com.hibernate.AssignmentOne.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Long> {

}
