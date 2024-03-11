package com.LoginPageDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "userlogin")
public class UserLogin {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "user_name")
	private String userName;
	
	private String email;
	
	private String dateField;
	
	private String conformPassword;
	

	public UserLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public UserLogin(int id, String userName, String email, String dateField, String conformPassword) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.dateField = dateField;
		this.conformPassword = conformPassword;
	}







	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateField() {
		return dateField;
	}

	public void setDateField(String dateField) {
		this.dateField = dateField;
	}

	public String getConformPassword() {
		return conformPassword;
	}

	public void setConformPassword(String conformPassword) {
		this.conformPassword = conformPassword;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}






	@Override
	public String toString() {
		return "UserLogin [ userName=" + userName + ", email=" + email + ", dateField=" + dateField
				+ ", conformPassword=" + conformPassword + "]";
	}


	
	
	

}
