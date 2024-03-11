package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.RestAPI.Dto.Student;
import com.RestAPI.Service.StudentService;

@CrossOrigin
@RestController
public class COntrollerClass {

	@Autowired
	StudentService studentService;

	@GetMapping("/getStudents")
	public List<Student> getStudent() {
		List<Student> studentDetails = studentService.getStudentDetails();
		return studentDetails;
	}

	@GetMapping("/getStudent/{empId}")
	public Student getId(@PathVariable("empId") int empId) {
		Student sudentId = studentService.getSudentId(empId);
		return sudentId;
	}

	@GetMapping("/getStudent/id")
	public Student getIdByRequestParam(@RequestParam("empId") int empId) {

		Student sudentId = studentService.getSudentId(empId);
		return sudentId;

	}

	@PostMapping("/postStudent")
	public Student postData(@RequestBody Student student) {
		studentService.createUser(student);
		return student;

	}

	@PutMapping("/updateData/{empId}")
	public Student updateData(@PathVariable("empId") int empId, @RequestBody Student student) {
		studentService.update(student, empId);
		return student;
	}

	@DeleteMapping("/deletaData/{empId}")
	public int deleteData(@PathVariable("empId") int empId) {
		studentService.deletedata(empId);
		return empId;
	}

}
