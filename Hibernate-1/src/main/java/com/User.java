package com;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name",length = 20)
	private String name;
	private int marks;
	
	private String status;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String nameString, int marks, String statuString) {
		super();
		this.id = id;
		this.name = nameString;
		this.marks = marks;
		this.status = statuString;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameString() {
		return name;
	}

	public void setNameString(String nameString) {
		this.name = nameString;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getStatuString() {
		return status;
	}

	public void setStatuString(String statuString) {
		this.status = statuString;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, marks, name, status);
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
		return id == other.id && marks == other.marks && Objects.equals(name, other.name)
				&& Objects.equals(status, other.status);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", nameString=" + name + ", marks=" + marks + ", statuString=" + status
				+ "]";
	}
	
	

}
