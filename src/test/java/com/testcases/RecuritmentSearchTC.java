package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.RecruitmentPage;
import com.pages.loginHrm;

public class RecuritmentSearchTC extends Library{
	loginHrm lghrm;
	@BeforeMethod
	public void startUp() throws IOException {
		launchApplication();
		lghrm = new loginHrm(driver);
		//lghrm.setUserName("Admin");
		//lghrm.setPassword("admin123");
		lghrm.clickSummit("Admin","admin123");
	}
	@Test(priority =1)
	public void RecruitmentSearch() {
		RecruitmentPage hrm = new RecruitmentPage (driver);		
		hrm.ClickRecurit();
		hrm.jobTitle("CEO");
		hrm.Status("Job Offered");
		hrm.cname_keyword("Johny","Testing");
		hrm.dateSelection("2020-05-05", "2020-05-25");
		hrm.modeofApplication("Manual");
		hrm.clickSearch();
	}
	@Test(priority =2)
	public void RecruitmentAdd() {
		RecruitmentPage orghrm = new RecruitmentPage (driver);
		orghrm.ClickRecurit();
		orghrm.ClickAdd();
		orghrm.FullName("John", "Smith");
		orghrm.emailContact("johnsmith@gmail.com", "6027896520");
		orghrm.candResume("C:\\Users\\itsdi\\Downloads\\selenium\\Test data\\Testing.docx");
		orghrm.dateofApp();
		orghrm.SaveButton();
		}
	
	@AfterMethod
	public void close() throws IOException {
		screenShot();
		quit();
	}

}
