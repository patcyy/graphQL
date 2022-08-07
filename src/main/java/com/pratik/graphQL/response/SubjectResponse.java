package com.pratik.graphQL.response;

import com.pratik.graphQL.entity.Subject;

public class SubjectResponse {

	private int subjectId;

	private int subjectName;

	public SubjectResponse(int subjectId, int subjectName) {
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

	public int getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(int subjectName) {
		this.subjectName = subjectName;
	}

	@Override
	public String toString() {
		return "SubjectResponse [subjectId=" + subjectId + ", subjectName=" + subjectName + "]";
	}

}
