package com.registration;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.credentials.Dbusercredentials;

public class Student {

	public String idInteger;

	private String nameString;

	private String genderString;

	public Student() {
		super();
	}

	public Student(String idInteger, String nameString, String genderString) {
		super();
		this.idInteger = idInteger;
		this.nameString = nameString;
		this.genderString = genderString;
	}

	public String getIdInteger() {
		return idInteger;
	}

	public void setIdInteger(String idInteger) {
		this.idInteger = idInteger;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getGenderString() {
		return genderString;
	}

	public void setGenderString(String genderString) {
		this.genderString = genderString;
	}

	@Override
	public String toString() {
		return "Student [idInteger=" + idInteger + ", nameString=" + nameString + ", genderString=" + genderString
				+ "]";
	}

	public  void conncetionData() {
		
		try {
			java.sql.Connection connection = DriverManager.getConnection(Dbusercredentials.DBURL_STRING,
					Dbusercredentials.USER_STRING, Dbusercredentials.PSSWORD_STRING);
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into students(id,studentname,gender) values (?,?,?);");
			preparedStatement.setString(1,this.idInteger );
			preparedStatement.setString(2,this.nameString );
			preparedStatement.setString(3,this.genderString);
            preparedStatement.executeUpdate();

			}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	
}

}
