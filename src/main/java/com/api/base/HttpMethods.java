package com.api.base;

import java.util.Map;

import com.api.payload.SingleRepoPayload;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HttpMethods {
	
public static Response doPostCallwithBody(Map<String,String> header, String payload, String endpoint) {
	Response response = RestAssured.given().headers(header).body(payload).when().post(endpoint).then().log().all().extract().response();
return response;
}
public static Response doDelete(Map<String,String> header, String endpoint) {
	Response response = RestAssured.given().headers(header).when().delete(endpoint).then().log().all().extract().response();
return response;
}
public static Response doGet(Map<String,String> header,String endpoint) {
	Response response=RestAssured.given().headers(header).when().get(endpoint).then().log().all().extract().response();
return response;
}
public static Response doPut(Map<String,String> header,String payload,String endpoint) {
	Response response= RestAssured.given().headers(header).body(payload).when().put(endpoint).then().log().all().extract().response();
	return response;
}
public static Response doPatch(Map<String,String> header,String payload,String endpoint) {
	Response response=RestAssured.given().headers(header).body(payload).when().patch(endpoint).then().log().all().extract().response();
	return response;
}
public static Response doPutVulnerability(Map<String,String> header,String endpoint) {
	Response response = RestAssured.given().headers(header).when().put(endpoint).then().log().all().extract().response();
		return response;
	
}
}
