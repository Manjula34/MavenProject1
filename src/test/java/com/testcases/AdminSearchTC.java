package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.AdminPage;
import com.pages.loginHrm;

public class AdminSearchTC extends Library{
	loginHrm lghrm;
	@BeforeMethod
	public void startUp() throws IOException {
		launchApplication();
		
		lghrm = new loginHrm(driver);

		lghrm.clickSummit("Admin","admin123");
	}
	@Test(priority=1)
	public void AdminSearch() {
		AdminPage adpage= new AdminPage(driver);
		adpage.CLickAmin();
		adpage.usename("Sarah");
		adpage.Userrole("ESS");
		adpage.EmpName("John");
		adpage.Status("Enabled");
		adpage.CLickSearch();
	}
	@Test(priority=2)
	public void AddSearch() {
		AdminPage add = new AdminPage(driver);
		add.CLickAmin();
		add.CLickAdd();
		add.Adduserrole("ESS");
		add.AddEmpName("Ashwin","Ashwin123");
		add.Addpassword("kumar23");
		add.Addconfirmpwd("kumar123");
		add.CLickSave();		
	}
	
	
	@AfterMethod
	public void close() throws IOException {
		screenShot();
		quit();
	}


}
