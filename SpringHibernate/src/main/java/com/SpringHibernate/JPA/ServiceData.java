package com.SpringHibernate.JPA;

import java.util.List;


import com.SpringHibernate.DTO.Teacher;


public interface ServiceData {
	
	public int createData(Teacher teacher);
	
	public Teacher getTeacherId(int teacherId);
	
	public List<Teacher> getTeacherDetails();
	
	public int updateData(Teacher teacher);
	
	public int deleteData(int teacherId);

}
