package com.pratik.graphQL.service;

import com.pratik.graphQL.entity.Student;
import com.pratik.graphQL.exception.NotFoundException;

public interface IGraphQlService {

	public Student fetchStudentById(int id) throws NotFoundException;

}
