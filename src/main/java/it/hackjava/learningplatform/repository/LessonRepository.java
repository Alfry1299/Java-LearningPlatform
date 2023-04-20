package it.hackjava.learningplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.hackjava.learningplatform.model.Lesson;

public interface LessonRepository extends JpaRepository<Lesson , Long> {
    
}
