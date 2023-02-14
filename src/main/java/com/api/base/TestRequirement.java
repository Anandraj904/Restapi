package com.api.base;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import com.rest.configur.ConfiguarationReaderHelper;

public class TestRequirement {
private  String Url ;
private  String authorization;
private  String Owner;
private  String Repo; 
private  String Name;
private  Map<String,String> validHeader = new HashMap<String,String>();
private  Map<String,String> inValidHeader = new HashMap<String,String>();

public Map<String, String> getValidHeader() {
	try {
		validHeader.put("Accept","application/vnd.github+json");
		validHeader.put("Authorization","Bearer "+getAuthorization());
	} catch (Exception e) {
		e.printStackTrace();
	}
	return validHeader;
}
public Map<String, String> getInValidHeader() {
	
	try {
		inValidHeader.put("Accept","application/vnd.github+json");
		inValidHeader.put("Authorization","Bearer "+getinValidAuthorization());
	} catch (Exception e) {
		e.printStackTrace();
	}
	return inValidHeader;
}

public String getURL() {
	String url = null;

	try {		
		url = ConfiguarationReaderHelper.getInstance().getUrl();
	} catch (MalformedURLException e) {
		e.printStackTrace();
		throw new RuntimeException(String.format("URL %s is not correct", url));
	} catch (IOException e) {
		e.printStackTrace();
	}
	this.Url=url;
	return Url;
}


public String getAuthorization() {
	String auth = null;
	try {
		auth = ConfiguarationReaderHelper.getInstance().getAuth();
	} catch (IOException e) {
		e.printStackTrace();
	}
  this.authorization=auth;
	return authorization;
}
public String owner()  {
	String owner = null;
	try {
		owner = ConfiguarationReaderHelper.getInstance().getOwner();
	} catch (IOException e) {
		e.printStackTrace();
	}
	this.Owner=owner;
	return Owner;
}
public String repo() {
	String repo = null;
	try {
		repo = ConfiguarationReaderHelper.getInstance().getRepo();
	} catch (IOException e) {
		e.printStackTrace();
	}
	this.Repo=repo;
	return Repo;
}
public String getinValidAuthorization() {
	String auth="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234";
	return auth;
}
public String name() {
	String name=null;
	try {
		 name=ConfiguarationReaderHelper.getInstance().getName();
	} catch (IOException e) {
		e.printStackTrace();
	}
	this.Name=name;
	return Name;
}
}
