package com.pratik.graphQL.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.pratik.graphQL.request.StudentRequest;
import com.pratik.graphQL.service.IGraphQlService;

@Service
public class Mutation implements GraphQLMutationResolver {

	private IGraphQlService graphQlService;

	@Autowired
	public Mutation(IGraphQlService graphQlService) {
		this.graphQlService = graphQlService;
	}

	public String createStudent(StudentRequest studentRequest) {
		return "Student Created with Id :: " + graphQlService.createStudent(studentRequest);
	}

}
