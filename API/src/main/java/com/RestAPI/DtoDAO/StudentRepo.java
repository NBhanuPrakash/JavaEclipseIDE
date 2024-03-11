package com.RestAPI.DtoDAO;

import com.RestAPI.Dto.Student;


public interface StudentRepo {
	
	public int createUser(Student student);
	
	public Student getSudentId(int id);
	
	public java.util.List<Student> getStudentDetails();
	
	public int update(Student student, int id);
	
	public int deletedata(int id);
	
	

}
