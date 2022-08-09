package com.pratik.graphQL.resolver;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.pratik.graphQL.enums.SubjectEnum;
import com.pratik.graphQL.response.StudentResponse;
import com.pratik.graphQL.response.SubjectResponse;

@Service
public class StudentResponseResolver implements GraphQLResolver<StudentResponse> {

	private static final Logger log = LoggerFactory.getLogger(StudentResponseResolver.class);

	public List<SubjectResponse> getSubjects(StudentResponse studentResponse, SubjectEnum subjectEnum) {

		log.info("Query Resolver Invoked for Student : {}", studentResponse.getStudentId());

		List<SubjectResponse> subjects = new ArrayList<>();
		//WIthout filter on edge
		//studentResponse.getStudent().getSubjects().forEach(e -> subjects.add(new SubjectResponse(e)));
		
		//Implementing filter on edge
		studentResponse.getStudent().getSubjects().stream()
				.filter(e -> subjectEnum.name().equalsIgnoreCase("All")||subjectEnum.name().equalsIgnoreCase(e.getSubjectName()))
				.forEach(e -> subjects.add(new SubjectResponse(e)));
		return subjects;

	}

}
