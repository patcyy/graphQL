package com.pratik.graphQL.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {

	@Id
	@Column(name = "STUDENT_ID")
	private int studentId;

	@Column(name = "F_NAME")
	private String fName;

	@Column(name = "L_NAME")
	private String lName;

	@Column(name = "DOB")
	private String dob;

	@Column(name = "CITY")
	private String city;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "student")
	private List<Subject> subjects;

	public Student(int studentId, String fName, String lName, String dob, String city, List<Subject> subjects) {
		super();
		this.studentId = studentId;
		this.fName = fName;
		this.lName = lName;
		this.dob = dob;
		this.city = city;
		this.subjects = subjects;
	}

	public Student() {
		super();
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", fName=" + fName + ", lName=" + lName + ", dob=" + dob + ", city="
				+ city + ", subjects=" + subjects + "]";
	}

}
