package it.hackjava.learningplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.hackjava.learningplatform.model.Course;

public interface CourseRepository extends JpaRepository <Course , Long> {
    
}
