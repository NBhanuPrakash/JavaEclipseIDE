package com.hibernate2;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {
	@Id
	private int id;
	private String namString;
	private int marks;
	private String statuString;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String namString, int marks, String statuString) {
		super();
		this.id = id;
		this.namString = namString;
		this.marks = marks;
		this.statuString = statuString;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNamString() {
		return namString;
	}

	public void setNamString(String namString) {
		this.namString = namString;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getStatuString() {
		return statuString;
	}

	public void setStatuString(String statuString) {
		this.statuString = statuString;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, marks, namString, statuString);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id && marks == other.marks && Objects.equals(namString, other.namString)
				&& Objects.equals(statuString, other.statuString);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", namString=" + namString + ", marks=" + marks + ", statuString=" + statuString
				+ "]";
	}
	
	
}
