package com.api.base;

public class Endpoints {
	public static TestRequirement tr =new TestRequirement();

public static final String BASE_URL=tr.getURL();
public static class SingleRepo{
	private SingleRepo() {
		
	}
	public static final String CREATE_REPO=BASE_URL+"/user/repos";
	public static final String GET_REPO=BASE_URL+"/repos/"+tr.owner()+"/"+tr.repo()+"";
	public static final String UPDATE_REPO=BASE_URL+"/repos/"+tr.owner()+"/"+tr.repo()+"/topics";
	public static final String PATCH_REPO=BASE_URL+"/repos/"+tr.owner()+"/"+tr.repo()+"";
	public static final String CHECK_VULNEARABILITY=BASE_URL+"/repos/"+tr.owner()+"/"+tr.repo()+"/vulnerability-alerts";
	public static final String ENABLE_VULNEARABILITY=BASE_URL+"/repos/"+tr.owner()+"/"+tr.repo()+"/vulnerability-alerts";
	public static final String DISABLE_VULNEARABILITY=BASE_URL+"/repos/"+tr.owner()+"/"+tr.repo()+"/vulnerability-alerts";
	public static final String DELETE_REPO=BASE_URL+"/repos/"+tr.owner()+"/"+tr.repo()+"";
	
	
	
}
public static class ListOfRepo{
	private ListOfRepo() {

	}
	public static final String LIST_REPO=BASE_URL+"/users/"+tr.owner()+"/repos";
	public static final String LIST_AUTH_REPO=BASE_URL+"/user/repos";
	public static final String LIST_PUBLIC_REPO=BASE_URL+"/repositories";
	public static final String LIST_REPO_LAUNGUAGES=BASE_URL+"/repos/"+tr.owner()+"/"+tr.repo()+"/languages";
	public static final String LIST_REPO_TAGS=BASE_URL+"/repos/"+tr.owner()+"/"+tr.repo()+"/tags";


}
}
