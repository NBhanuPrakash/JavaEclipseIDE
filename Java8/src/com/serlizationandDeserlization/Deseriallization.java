package com.serlizationandDeserlization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deseriallization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee employee=null;
		
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream("D:\\S3\\employee.ser");
			ObjectInputStream obj1 = new ObjectInputStream(fileInputStream);
			employee = (Employee) obj1.readObject();
			obj1.close();
			fileInputStream.close();
			
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Employee name:"+employee.getNameString());
		System.out.println("Employee number:"+employee.getNumber());
		System.out.println("Employee email:"+employee.getEmailString());
		System.out.println("Employee dept:"+employee.getDeptString());
	}

}
