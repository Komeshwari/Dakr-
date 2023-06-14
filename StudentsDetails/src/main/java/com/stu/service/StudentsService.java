package com.stu.service;

import java.util.List;
import java.util.Optional;

import com.stu.entity.Student;

public interface StudentsService {
Student saveStudents(Student stu);
Student retriveStudents(Student stu);
Optional<Student> retriveData(Integer stdId);
List<Student> retriveAllStu();
Student updateStudents(Student std);
 void deleteStudents(Integer stdId);
public String deleteD(Integer stdId);

}
