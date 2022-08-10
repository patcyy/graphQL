package com.pratik.graphQL.request;

public class SubjectRequest {

	private String subjectName;

	public SubjectRequest(String subjectName) {
		this.subjectName = subjectName;
	}

	public SubjectRequest() {
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	@Override
	public String toString() {
		return "SubjectRequest [subjectName=" + subjectName + "]";
	}

}
