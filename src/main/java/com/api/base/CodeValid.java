package com.api.base;

public class CodeValid {

	private CodeValid() {

	}

	public static void codeValidation(int statusCode) {

		switch (statusCode) {
		case Constants.HTTPS_STATUS_CREATED -> {
			System.out.println("Created Successfully");
		}
		case Constants.HTTPS_STATUS_FORBIDDEN -> {
			System.out.println("InValid Password");
		}
		case Constants.HTTPS_STATUS_NOT_FOUND -> {
			System.out.println("Page Not Found");
		}
		case Constants.HTTPS_STATUS_UNPROCESSABLE_ENTITY -> {
			System.out.println("Name already Exsist");
		}
		case Constants.HTTPS_STATUS_BAD_REQUEST -> {
			System.out.println("Bad Request");
		}
		case Constants.HTTPS_STATUS_UNAUTHORISED -> {
			System.out.println("Your UnAuthorised");
		}
		case Constants.HTTPS_STATUS_NO_CONTENT -> {
			System.out.println("Repo has been Deleted");
		}
		case Constants.HTTPS_STATUS_OK -> {
			System.out.println("Got Your Repositories");
		}
		default -> {
			System.out.println("Not Valid or Some other code is: " + statusCode);
		}
		}
		;
	}
}
