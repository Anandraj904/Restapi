package com.api.payload;

public class SingleRepoPayload {
public static String createSinglerepo(String repo) {
	String body ="{\r\n"
			+ "    \"name\": \""+repo+"\",\r\n"
			+ "    \"description\": \"RestApi\"\r\n"
			+ "}";
	return body;
}

public static String updateAllRepoTopic() {
	String body="{\r\n"
			+ "    \"names\": [\r\n"
			+ "        \"raj\",\r\n"
			+ "        \"atom\",\r\n"
			+ "        \"electron\",\r\n"
			+ "        \"api\"\r\n"
			+ "    ]\r\n"
			+ "}";
	return body;
}
public static String patchRepo(String repo) {
	String body="{\r\n"
			+ "    \"name\": \""+repo+"\",\r\n"
			+ "    \"description\": \"Repository Name is my Name\",\r\n"
			+ "    \"private\": true\r\n"
			+ "}";
	return body;
}
}
