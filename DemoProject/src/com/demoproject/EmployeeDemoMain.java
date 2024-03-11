package com.demoproject;
import java.util.ArrayList;
import java.util.Collections;


public class EmployeeDemoMain {

	public static void main(String[] args) {
	ArrayList<Employeedata> storagedatabase =DamyData();
		
		Employeedata ne2 = new Employeedata(257,"NARI","PAkistan");
		System.out.println(SearchEmployee(storagedatabase,ne2));		 
		System.out.println(getEmployee(storagedatabase,"ISI"));
		
		
		
		
		
	}
	
	
	
	private static ArrayList<Employeedata> DamyData() {
		
		
		Employeedata employee1 = new Employeedata(256,"Bhanu","India");
		Employeedata employee2 = new Employeedata(257,"NARI","PAkistan");
		Employeedata employee3 = new Employeedata(258,"MAhesh","Afganisthan");
		Employeedata employee4 = new Employeedata(259,"Dheeraj","ISI");
		Employeedata employee5 = new Employeedata(251,"Ganesh","ISI");
		
		
		
		ArrayList<Employeedata> data = new ArrayList<Employeedata>();
		data.add(employee4);
		data.add(employee3);
		data.add(employee2);
		data.add(employee1);
		data.add(employee5);
		Collections.sort(data);
		System.out.println(data);
		return data;
	}
	public static boolean SearchEmployee(ArrayList<Employeedata> database, Employeedata Givendata) {
		
		for(Employeedata storeroom : database) {
			if(storeroom.getEmpId()==Givendata.getEmpId()) {
				return true;
			}
		}
		return false;
		
	}
	public static int getEmployee(ArrayList<Employeedata> databasee, String betcity) {
		int count =0;
		for(Employeedata storeroom : databasee) {
			if(betcity.equals(storeroom.getCity())) {
				
				count++;
				
			}
		
		}
		
		
		
		return count;
		
	}

}
