package com.api.client;

import java.util.HashMap;
import java.util.Map;

import com.api.base.Endpoints;
import com.api.base.HttpMethods;
import com.api.base.TestRequirement;

import io.restassured.response.Response;

public class ListOfRepoClient {
	public TestRequirement tr =new TestRequirement();

	
	public  Response listRepoLanguage(Map<String, String> header) {
		Response response= HttpMethods.doGet(header, Endpoints.ListOfRepo.LIST_REPO_LAUNGUAGES);
		return response;
	}
	
	
	public  Response listRepo(Map<String, String> header) {
		Response response= HttpMethods.doGet(header, Endpoints.ListOfRepo.LIST_REPO);
		return response;
	}
	public  Response listRepoAuthUser(Map<String, String> header) {
		Response response= HttpMethods.doGet(header, Endpoints.ListOfRepo.LIST_AUTH_REPO);
		return response;
	}
	public  Response listpublicRepo(Map<String, String> header) {
		Response response= HttpMethods.doGet(header, Endpoints.ListOfRepo.LIST_PUBLIC_REPO);
		return response;
	}
	public  Response listRepoTags(Map<String, String> header) {
		Response response= HttpMethods.doGet(header, Endpoints.ListOfRepo.LIST_REPO_TAGS);
		return response;
	}
}
