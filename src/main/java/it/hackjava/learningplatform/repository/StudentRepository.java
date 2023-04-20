package it.hackjava.learningplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.hackjava.learningplatform.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
