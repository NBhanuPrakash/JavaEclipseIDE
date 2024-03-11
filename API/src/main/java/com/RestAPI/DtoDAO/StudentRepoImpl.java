package com.RestAPI.DtoDAO;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.RestAPI.Dto.Student;

@Repository
public class StudentRepoImpl implements StudentRepo {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int createUser(Student student) {
		int save = (int) hibernateTemplate.save(student);
		return save;
	}

	@Override
	public Student getSudentId(int id) {
		Student student = hibernateTemplate.get(Student.class, id);
		return student;
	}

	@Override
	public List<Student> getStudentDetails() {
		List<Student> loadAll = hibernateTemplate.loadAll(Student.class);
		return loadAll;
	}

	@Override
	@Transactional
	public int update(Student student, int id) {
		Student student2 = hibernateTemplate.get(Student.class, id);
		if (student2 != null) {
			student2.setStdName(student.getStdName());
			student2.setStdSubject(student.getStdSubject());
			student2.setTotalMarks(student.getTotalMarks());
			hibernateTemplate.update(student2);
		}
		return 1;
	}

	@Override
	@Transactional
	public int deletedata(int id) {
		Student student = hibernateTemplate.get(Student.class, id);
		if (student != null) {
			hibernateTemplate.delete(student);
		}
		return 0;
	}

}
