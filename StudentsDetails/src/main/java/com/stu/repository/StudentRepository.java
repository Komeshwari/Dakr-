package com.stu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stu.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
