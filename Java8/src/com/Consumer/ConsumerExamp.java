package com.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExamp {

	public static void main(String[] args) {
		emp emplyName1 = new emp(10001, "Bhanu", 68500);
		emp emplyName2 = new emp(10002, "Prakash", 88500);
		emp emplyName3 = new emp(10003, "Sai", 98500);
		emp emplyName4 = new emp(10004, "Krishna", 78500);
		emp emplyName5 = new emp(10005, "Ramesh", 24500);
		List<emp> list = new ArrayList<>();
		list.add(emplyName1);
		list.add(emplyName2);
		list.add(emplyName3);
		list.add(emplyName4);
		list.add(emplyName5);
		Consumer<List<emp>> shConsumer = (em) -> {
			list.stream().filter(n -> n.getId()%2==0).forEach(k -> System.out.println(k));
		};
		shConsumer.accept(list);
		// filter about even number of id and print it.....
		
	}

}
class emp{
	private int id;
	
	private String nameString;
	
	private int salary;

	public emp() {
		super();
	}

	public emp(int id, String nameString, int salary) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.salary = salary;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "emp [id=" + id + ", nameString=" + nameString + ", salary=" + salary + "]";
	}
	
	
}

