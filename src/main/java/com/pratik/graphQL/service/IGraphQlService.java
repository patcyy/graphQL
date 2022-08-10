package com.pratik.graphQL.service;

import com.pratik.graphQL.entity.Student;
import com.pratik.graphQL.exception.NotFoundException;
import com.pratik.graphQL.request.StudentRequest;

public interface IGraphQlService {

	public Student fetchStudentById(int id) throws NotFoundException;
	
	public int createStudent(StudentRequest studentRequest);

}
