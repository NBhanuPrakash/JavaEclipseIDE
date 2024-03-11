package com.SpringHibernate.JPA;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.SpringHibernate.DTO.Teacher;

@Component("productJPA")
public class ServiceDataImp implements ServiceData {
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int createData(Teacher teacher) {
		int save = (int) hibernateTemplate.save(teacher);
		return save;
	}

	@Override
	public Teacher getTeacherId(int teacherId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getTeacherDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public int updateData(Teacher teacher) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@Transactional
	public int deleteData(int teacherId) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
