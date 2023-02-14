package com.rest.configur;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfiguarationReader {
Properties p;
public ConfiguarationReader() throws IOException {
	File file =new File("C:\\Users\\anand\\eclipse-workspace\\RestApi\\src\\main\\java\\com\\web\\properties\\RestProp.properties");
	FileInputStream fi =new FileInputStream(file);
	p=new Properties();
	p.load(fi);
}
public String getUrl() {
	String url=p.getProperty("Base_URI");
	return url;
}
public String getOwner() {
	String owner = p.getProperty("OWNER");
	return owner;
}
public String getRepo() {
	String repo = p.getProperty("REPO");
	return repo;
}
public String getAddRepo() {
	String addRepo = p.getProperty("REPO1");
	return addRepo;
}
public String getAuth() {
	String Auth = p.getProperty("TOKEN");
	return Auth;
}
public String getName() {
	String name = p.getProperty("NAME");
	return name;
}
}
