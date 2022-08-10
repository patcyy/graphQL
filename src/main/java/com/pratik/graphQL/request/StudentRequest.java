package com.pratik.graphQL.request;

import java.util.List;

public class StudentRequest {

	private String fName;

	private String lName;

	private String dob;

	private String city;

	private List<SubjectRequest> subjects;

	public StudentRequest(String fName, String lName, String dob, String city, List<SubjectRequest> subjects) {
		this.fName = fName;
		this.lName = lName;
		this.dob = dob;
		this.city = city;
		this.subjects = subjects;
	}

	public StudentRequest() {
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

	public List<SubjectRequest> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<SubjectRequest> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "StudentRequest [fName=" + fName + ", lName=" + lName + ", dob=" + dob + ", city=" + city + ", subjects="
				+ subjects + "]";
	}

}
