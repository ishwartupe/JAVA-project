package com.boot.Project2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DBConfig {
	@Value("${mysql.driver}")
	private String driver;
	@Value("${mysql.url}")
	private String url;
	@Value("${mysql.user}")
	private String user;
	@Value("${mysql.pass}")
	private String password;
	@Override
	public String toString() {
		return "DBConfig [driver=" + driver + ", url=" + url + ", user=" + user + ", password=" + password + "]";
	}
	
	
}
