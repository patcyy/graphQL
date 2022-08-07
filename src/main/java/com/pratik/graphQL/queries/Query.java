package com.pratik.graphQL.queries;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.pratik.graphQL.bean.SampleRequest;

@Component
public class Query implements GraphQLQueryResolver {
	
	public String firstQuery () {
		return "First Query";
	}
	
	public String yourInput(String input) {
		return "Your Input : " + input;
	}

	public String inputWIthReqBody(SampleRequest sampleRequest) {
		return "Input :: " + sampleRequest.toString();
	}
}
