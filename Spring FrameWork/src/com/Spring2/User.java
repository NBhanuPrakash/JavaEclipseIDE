package com.Spring2;

public class User {
	
	private int id=1001;
	
	private String nameString="Bhanu";
	
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public User(int id, String nameString) {
		super();
		this.id = id;
		this.nameString = nameString;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", nameString=" + nameString + "]";
	}
	
	

}
