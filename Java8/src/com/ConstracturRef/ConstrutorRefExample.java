package com.ConstracturRef;

public class ConstrutorRefExample {
	public static void main(String[] args) {
		
//		employeeService emp11 = employees::new; // WithOut Lamda Expresstions...
		employeeService emp11 = () -> new employees(); // With Lamda Expresstions...
		employees employees = emp11.empl();
		employees.setId(450);
		System.out.println(employees.getId());
		
	}

}
interface employeeService{
	employees empl();
}

class employees{
	private int id;
	
	private String nameString;

	public employees() {
		super();
	}

	public employees(int id, String nameString) {
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
		return "employees [id=" + id + ", nameString=" + nameString + "]";
	}
	
	
	
}
