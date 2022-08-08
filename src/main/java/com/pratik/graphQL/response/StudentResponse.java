package com.pratik.graphQL.response;

import java.util.ArrayList;
import java.util.List;

import com.pratik.graphQL.entity.Student;

public class StudentResponse {

	private int studentId;

	private String fName;

	private String lName;

	private String dob;

	private String city;

	private List<SubjectResponse> subjects;
	
	//For Resolver purpose. Do not put in Schema
	private Student student;

	public StudentResponse(int studentId, String fName, String lName, String dob, String city,
			List<SubjectResponse> subjects) {
		super();
		this.studentId = studentId;
		this.fName = fName;
		this.lName = lName;
		this.dob = dob;
		this.city = city;
		this.subjects = subjects;
	}

	public StudentResponse() {
	}

	public StudentResponse(Student student) {
		this.studentId = student.getStudentId();
		this.fName = student.getfName();
		this.lName = student.getlName();
		this.dob = student.getDob();
		this.city = student.getCity();
		
		this.student=student;
		//Moved to Resolver
		/*
		 * this.subjects = new ArrayList<>(); student.getSubjects().forEach(e ->
		 * subjects.add(new SubjectResponse(e)));
		 */
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

	public List<SubjectResponse> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<SubjectResponse> subjects) {
		this.subjects = subjects;
	}

	public Student getStudent() {
		return student;
	}

	@Override
	public String toString() {
		return "StudentResponse [studentId=" + studentId + ", fName=" + fName + ", lName=" + lName + ", dob=" + dob
				+ ", city=" + city + ", subjects=" + subjects + "]";
	}

}
