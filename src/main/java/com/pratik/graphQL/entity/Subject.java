package com.pratik.graphQL.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SUBJECT")
public class Subject {

	@Id
	@Column(name = "SUBJECT_ID")
	private int subjectId;

	@Column(name = "NAME")
	private int subjectName;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "STUDENT_ID")
	private Student student;

	public Subject(int subjectId, int subjectName, Student student) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.student = student;
	}

	public Subject() {
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

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + ", student=" + student + "]";
	}

}
