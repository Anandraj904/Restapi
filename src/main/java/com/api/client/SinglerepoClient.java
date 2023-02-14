package com.api.client;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;

import com.api.base.Constants;
import com.api.base.Endpoints;
import com.api.base.HttpMethods;
import com.api.base.TestRequirement;
import com.api.payload.SingleRepoPayload;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SinglerepoClient {
public TestRequirement tr =new TestRequirement();


	
public Response createSingleRepo(Map<String,String> header) {
	Response response= HttpMethods.doPostCallwithBody(header, SingleRepoPayload.createSinglerepo(tr.repo()), Endpoints.SingleRepo.CREATE_REPO);
	return response;

}

public Response deleteSingleRepo(Map<String,String> header) {
	Response response = HttpMethods.doDelete(header, Endpoints.SingleRepo.DELETE_REPO);
	return response;
	
}

public Response getSingleRepo(Map<String,String> header) {
	Response response = HttpMethods.doGet(header, Endpoints.SingleRepo.GET_REPO);
	return response;
}

public Response putSingleRepo(Map<String,String> header) {
	Response response=HttpMethods.doPut(header, SingleRepoPayload.updateAllRepoTopic(), Endpoints.SingleRepo.UPDATE_REPO);
	return response;
	
}

public Response patchSingleRepo(Map<String,String> header) {
	Response response= HttpMethods.doPatch(header, SingleRepoPayload.patchRepo(tr.name()), Endpoints.SingleRepo.PATCH_REPO);
	return response;
}

public Response enableVulnerableSingleRepo(Map<String,String> header) {
	Response response= HttpMethods.doPutVulnerability(header,Endpoints.SingleRepo.ENABLE_VULNEARABILITY);
	return response;
	
}

public Response checkVulnerableSingleRepo(Map<String,String> header) {
	Response response= HttpMethods.doGet(header, Endpoints.SingleRepo.CHECK_VULNEARABILITY);
	return response;
	
}

	

public Response disableVulnerableSingleRepo(Map<String,String> header) {
	Response response= HttpMethods.doGet(header, Endpoints.SingleRepo.DISABLE_VULNEARABILITY);
	return response;
	
}

}
