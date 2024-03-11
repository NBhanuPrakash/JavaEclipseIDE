package com.RestAPI.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RestAPI.Dto.Student;
import com.RestAPI.DtoDAO.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo studentRepo;

	@Override
	public int createUser(Student student) {
		int createUser = studentRepo.createUser(student);
		return createUser;
	}

	@Override
	public Student getSudentId(int id) {
		Student sudentId = studentRepo.getSudentId(id);
		return sudentId;
	}

	@Override
	public List<Student> getStudentDetails() {
		List<Student> studentDetails = studentRepo.getStudentDetails();
		return studentDetails;
	}

	@Override
	public int update(Student student,int id) {
		int update = studentRepo.update(student,id);
		return update;
	}

	@Override
	public int deletedata(int id) {
		int deletedata = studentRepo.deletedata(id);
		return deletedata;
	}

}
