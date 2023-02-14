package com.api.base;

import java.net.MalformedURLException;
import java.net.URL;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Utility {

	public static String readJsonPath(Response response,String jsonpath) {
		return response.then().extract().jsonPath().getString(jsonpath);
		
	}
	
	
}
