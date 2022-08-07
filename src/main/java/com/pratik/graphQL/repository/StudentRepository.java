package com.pratik.graphQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pratik.graphQL.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
