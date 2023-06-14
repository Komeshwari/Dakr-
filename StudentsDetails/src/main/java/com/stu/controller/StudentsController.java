package com.stu.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stu.entity.Student;
import com.stu.service.StudentsServiceImp;

@RestController
public class StudentsController {
@Autowired
private StudentsServiceImp service;
@PostMapping("/savestudents")//Post data into database
public String insertStu(@RequestBody Student std)
{
	String msg=null;
	Student std2=service.saveStudents(std);
	if(std2!=null)
	{
		msg="Student Registered Sucessfully!";
	}
	else
	{
		msg="failed registration!";
	}
	return msg;
}
@GetMapping("/retriveStudents")
public Student retData(@RequestBody Student std)
{
	Student ret=service.retriveStudents(std);
	return ret;
}
@GetMapping("/retbyid")
public Optional<Student> retriD(@RequestParam Integer stdId)
{
	Optional<Student> stu2=service.retriveData(stdId);
	return stu2;
}
@GetMapping("/retriveAllStu")
public List<Student> retAllStu()
{
	List<Student> li=service.retriveAllStu();
	return li;
}
@PutMapping("/updateStu")
public Student updateData(@RequestBody Student std)
{
	Student std1=service.updateStudents(std);
	return std1;
}
@DeleteMapping("/deleteStu/{stdId}")
public void deleteMap(@PathVariable Integer stdId )
{
	service.deleteStudents(stdId);
}
@DeleteMapping("/delete")
public String deleteMa(@RequestParam Integer stdId)
{
	return service.deleteD(stdId);
}
}
