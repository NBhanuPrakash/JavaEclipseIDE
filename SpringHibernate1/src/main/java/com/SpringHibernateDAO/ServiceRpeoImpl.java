package com.SpringHibernateDAO;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.SpringHibernateDTO.OrderItems;

@Repository
@Component("serviceRepo")
public class ServiceRpeoImpl implements ServiceRepo {
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public void createData(OrderItems orderItems) {
		  hibernateTemplate.save(orderItems);
	}

	@Override
	public OrderItems getTeacherId(int teacherId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderItems> getTeacherDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public int updateData(OrderItems teacher) {
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
