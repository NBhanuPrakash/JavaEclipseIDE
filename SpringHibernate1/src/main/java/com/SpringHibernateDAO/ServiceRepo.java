package com.SpringHibernateDAO;

import java.util.List;


import com.SpringHibernateDTO.OrderItems;


public interface ServiceRepo {
	
	public void createData(OrderItems teacher);
	
	public OrderItems getTeacherId(int teacherId);
	
	public List<OrderItems> getTeacherDetails();
	
	public int updateData(OrderItems teacher);
	
	public int deleteData(int teacherId);

}
