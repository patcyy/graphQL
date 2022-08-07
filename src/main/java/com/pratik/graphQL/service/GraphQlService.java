package com.pratik.graphQL.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratik.graphQL.entity.Student;
import com.pratik.graphQL.exception.NotFoundException;
import com.pratik.graphQL.repository.StudentRepository;
import com.pratik.graphQL.repository.SubjectRepository;

@Service
public class GraphQlService implements IGraphQlService {

	private StudentRepository studentRepo;
	private SubjectRepository subjectRepo;

	@Autowired
	public GraphQlService(StudentRepository studentRepo, SubjectRepository subjectRepo) {
		this.studentRepo = studentRepo;
		this.subjectRepo = subjectRepo;
	}

	@Override
	public Student fetchStudentById(int id) {
		return studentRepo.findById(id).orElseThrow(() -> new NotFoundException("Student Not Found with Id : " + id));
	}

}
