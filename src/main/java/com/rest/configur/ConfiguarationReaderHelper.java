package com.rest.configur;

import java.io.IOException;

public class ConfiguarationReaderHelper {
public static ConfiguarationReader getInstance() throws IOException {
	ConfiguarationReader cr= new ConfiguarationReader();
	return cr;
}
private  ConfiguarationReaderHelper() {
	
}
}
