package com.LoginPageDAO;

import javax.transaction.Transactional;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.LoginPageDTO.UserLogin;

@Transactional
@Repository
public class UserRepoImpl implements UserRepo {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public int saveUser(UserLogin userLogin) {
		int save = (int) hibernateTemplate.save(userLogin);
		return save;
	}

	@Override
	public UserLogin login(String email, String password) {
		final String sqlString = "from UserLogin where email=:em and conformPassword=:password";
		UserLogin execute = (UserLogin) hibernateTemplate.execute(s -> {
			org.hibernate.query.Query query = s.createQuery(sqlString);
			query.setString("em", email);
			query.setString("password", password);
			return query.uniqueResult();
		});
		return execute;
	}

	@Override
	public UserLogin getUser(String email) {
		final String sqlString = "from UserLogin where email=:em";
		UserLogin execute = (UserLogin) hibernateTemplate.execute(s -> {
			org.hibernate.query.Query query = s.createQuery(sqlString);
			query.setString("em", email);
			return query.uniqueResult();
		});
		return execute;
	}

	@Override
	public UserLogin updateUser(int id, String conformPassword) {
		UserLogin userLogin = hibernateTemplate.get(UserLogin.class, id);
		if (userLogin != null) {
			userLogin.setConformPassword(conformPassword);
			hibernateTemplate.update(userLogin);
		}
		return userLogin;
	}

}
