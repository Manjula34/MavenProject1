package com.linkedin.testcase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.linkedin.pages.loginpage;

import com.utils.XLUtils;

public class loginTestcase extends Library{
	@BeforeMethod
	public void startUp() throws IOException {
		launchApplication();
	}
	@Test
	public void OrangeHRMLogin() throws IOException {
		loginpage linked = new loginpage (driver);
		XLUtils util =  new XLUtils();
		linked.login(util.excel_username(1), util.excel_password(1));
		}
	
	@AfterMethod
	public void close() throws IOException {
		screenShot();
		quit();
	}

}
