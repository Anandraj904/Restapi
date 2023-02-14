package com.test.api;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.CodeValid;
import com.api.base.Constants;
import com.api.base.JsonPath;
import com.api.base.RepoMethods;
import com.api.base.TestRequirement;
import com.api.base.Utility;
import com.api.client.SinglerepoClient;
import com.api.payload.SingleRepoPayload;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SingleRepos {	
	public static TestRequirement tr =new TestRequirement();
	public static SinglerepoClient sc= new SinglerepoClient();
	@Test(enabled = true)
	public static void CreateRepoAuthUser() {
		Response response = sc.createSingleRepo(tr.getValidHeader());
		int CreatStatusCode = response.getStatusCode();
		CodeValid.codeValidation(CreatStatusCode);
		String value = Utility.readJsonPath(response, JsonPath.JSON_PATH_REPONAME);
		Assert.assertEquals(value, tr.repo());
		String CreatePretty = response.asPrettyString();
		System.out.println(CreatePretty);
		}
	
	@Test(enabled = true)
	public static void getRepo() {
		Response response = sc.getSingleRepo(tr.getValidHeader());
		int StatusCode = response.getStatusCode();
		CodeValid.codeValidation(StatusCode);
		String CreatePretty = response.asPrettyString();
		System.out.println(CreatePretty);
		}
	
	@Test(enabled = true)
	public static void patchRepo() {
		Response response = sc.patchSingleRepo(tr.getValidHeader());
		int StatusCode = response.getStatusCode();
		CodeValid.codeValidation(StatusCode);		
		String CreatePretty = response.asPrettyString();
		System.out.println(CreatePretty);
		}
	
	@Test(enabled = true)
	public static void putRepo() {
		Response response = sc.putSingleRepo(tr.getValidHeader());
		int StatusCode = response.getStatusCode();
		CodeValid.codeValidation(StatusCode);
		String CreatePretty = response.asPrettyString();
		System.out.println(CreatePretty);
		}
	
	@Test(enabled = true)
	public static void enableVulnerable() {
		Response response = sc.enableVulnerableSingleRepo(tr.getValidHeader());
		int StatusCode = response.getStatusCode();
		CodeValid.codeValidation(StatusCode);
		String CreatePretty = response.asPrettyString();
		System.out.println(CreatePretty);
		}
	
	@Test(enabled = true)
	public static void checkVulnerable() {
		Response response = sc.checkVulnerableSingleRepo(tr.getValidHeader());
		int StatusCode = response.getStatusCode();
		CodeValid.codeValidation(StatusCode);
		String CreatePretty = response.asPrettyString();
		System.out.println(CreatePretty);
		}
	
	
	@Test(enabled = true)
	public static void disableVulnerable() {
		Response response = sc.disableVulnerableSingleRepo(tr.getInValidHeader());
		int StatusCode = response.getStatusCode();
		CodeValid.codeValidation(StatusCode);
		String CreatePretty = response.asPrettyString();
		System.out.println(CreatePretty);
		}
	
	@Test(enabled=true)
	public static void deleteRepo() {
		Response response = sc.deleteSingleRepo(tr.getValidHeader());
		int statusCode = response.getStatusCode();
		CodeValid.codeValidation(statusCode);
		String deletePretty = response.asPrettyString();
		System.out.println(deletePretty);
	}
	
}
