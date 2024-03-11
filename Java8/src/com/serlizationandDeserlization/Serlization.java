package com.serlizationandDeserlization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serlization {

	public static void main(String[] args){
		
		Employee e1 = new Employee(215,"Bhanu","nnsaibhanupraksh@gmail.com","HOD");

		try {
			FileOutputStream fileout = new FileOutputStream("D:\\S3\\employee.ser");
			ObjectOutputStream obj1 = new ObjectOutputStream(fileout);
			obj1.writeObject(e1);
			fileout.close();
			obj1.close();
			System.out.println("Done");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
