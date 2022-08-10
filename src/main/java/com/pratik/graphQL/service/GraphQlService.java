package com.pratik.graphQL.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratik.graphQL.entity.Student;
import com.pratik.graphQL.entity.Subject;
import com.pratik.graphQL.exception.NotFoundException;
import com.pratik.graphQL.repository.StudentRepository;
import com.pratik.graphQL.repository.SubjectRepository;
import com.pratik.graphQL.request.StudentRequest;

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
	public Student fetchStudentById(int id) throws NotFoundException {
		return studentRepo.findById(id).orElseThrow(() -> new NotFoundException("Student Not Found with Id : " + id));
	}

	@Override
	public int createStudent(StudentRequest studentRequest) {

		Student studentEtitty = new Student(studentRequest.getfName(), studentRequest.getlName(),
				studentRequest.getDob(), studentRequest.getCity());

		List<Subject> listOfSubj = new ArrayList<>();
		studentRequest.getSubjects().forEach(e -> listOfSubj.add(new Subject(e.getSubjectName(), studentEtitty)));
		
		int studentid = studentEtitty.getStudentId();

		studentEtitty.setSubjects(listOfSubj);

		studentRepo.save(studentEtitty);
		subjectRepo.saveAll(listOfSubj);

		return studentid;
	}

}
