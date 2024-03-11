package com.one_to_one;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class passportId {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "p_id")
	private int passport_ID;
	
	
	private String nameString;
	
	
	
	
	public passportId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public passportId(int passport_ID, String nameString) {
		super();
		this.passport_ID = passport_ID;
		this.nameString = nameString;
	}
	public int getPassport_ID() {
		return passport_ID;
	}
	public void setPassport_ID(int passport_ID) {
		this.passport_ID = passport_ID;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nameString, passport_ID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		passportId other = (passportId) obj;
		return Objects.equals(nameString, other.nameString) && passport_ID == other.passport_ID;
	}
	@Override
	public String toString() {
		return "passportId [passport_ID=" + passport_ID + ", nameString=" + nameString + "]";
	}
	
	
	
}
