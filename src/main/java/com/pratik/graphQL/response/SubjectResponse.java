package com.pratik.graphQL.response;

import com.pratik.graphQL.entity.Subject;

public class SubjectResponse {

	private int subjectId;

	private String subjectName;

	public SubjectResponse(int subjectId, String subjectName) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
	}
	public SubjectResponse(Subject subject) {
		this.subjectId = subject.getSubjectId();
		this.subjectName = subject.getSubjectName();
	}

	public SubjectResponse() {
		super();
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	@Override
	public String toString() {
		return "SubjectResponse [subjectId=" + subjectId + ", subjectName=" + subjectName + "]";
	}

}
