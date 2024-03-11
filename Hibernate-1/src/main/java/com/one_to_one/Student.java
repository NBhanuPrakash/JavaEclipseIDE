package com.one_to_one;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "s_id")
	private int id;

	private String nameString;

	@OneToOne(fetch = FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	@JoinColumn(name = "name",referencedColumnName = "nameString")
	private passportId passportId;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String nameString, com.one_to_one.passportId passportId) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.passportId = passportId;
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

	public passportId getPassportId() {
		return passportId;
	}

	public void setPassportId(passportId passportId) {
		this.passportId = passportId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nameString, passportId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(nameString, other.nameString)
				&& Objects.equals(passportId, other.passportId);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", nameString=" + nameString + ", passportId=" + passportId + "]";
	}
	
	
	
	
	

}
