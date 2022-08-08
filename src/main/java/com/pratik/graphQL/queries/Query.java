package com.pratik.graphQL.queries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.pratik.graphQL.exception.NotFoundException;
import com.pratik.graphQL.request.SampleRequest;
import com.pratik.graphQL.response.StudentResponse;
import com.pratik.graphQL.service.IGraphQlService;

@Component
public class Query implements GraphQLQueryResolver {
	
	private IGraphQlService graphQlService;
	
	
	@Autowired
	public Query(IGraphQlService graphQlService) {
		this.graphQlService = graphQlService;
	}

	public String firstQuery () {
		return "First Query";
	}
	
	public String yourInput(String input) {
		return "Your Input : " + input;
	}

	public String inputWIthReqBody(SampleRequest sampleRequest) {
		return "Input :: " + sampleRequest.toString();
	}
	
	public StudentResponse getStudent(int id) throws NotFoundException{
		return new StudentResponse(graphQlService.fetchStudentById(id));
	}
}
