package com.stu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stu.entity.Student;
import com.stu.repository.StudentRepository;

@Service
public class StudentsServiceImp implements StudentsService{
@Autowired
private StudentRepository repo;
@Override
public Student saveStudents(Student std)//inserting
{
	Student std1=repo.save(std);
	return std1;
}
@Override
public Student retriveStudents(Student std)//retriving
{
	Student std2=repo.save(std);
	return std2;
}
@Override
public Optional<Student> retriveData(Integer stdId)//retriving
{
	return repo.findById(stdId);

}
@Override
public List<Student> retriveAllStu()//retriving
{
	return repo.findAll();
}
@Override
public Student updateStudents(Student std)
{
	return repo.save(std);
}
@Override
public void deleteStudents(Integer stdId)
{
      repo.deleteById(stdId);
}
public String deleteD(Integer stdId) {
	String temp=" ";
	if(repo.findById(stdId).isPresent())
	{
		repo.deleteById(stdId);
		temp="Sucessfully Deleted";
	}
	else 
	{
		temp="Deletion failed!";
	}
	return temp;
}
      
}
