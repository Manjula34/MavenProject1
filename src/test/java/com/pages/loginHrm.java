package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginHrm {
	
	WebDriver driver;
	
	public loginHrm(WebDriver rdriver) {
			
		driver = rdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="txtUsername")
	WebElement uname;
	
	@FindBy(id="txtPassword")
	WebElement passwd;
	
	@FindBy(id="btnLogin")
	WebElement loginbutton;
	
	public void setUserName(String uName) {
		uname.sendKeys(uName);
	}
	public void setPassword(String uPwd) {
		passwd.sendKeys(uPwd);
	}
	public void clickSummit(String uName,String uPwd) {
		uname.sendKeys(uName);
		passwd.sendKeys(uPwd);
		loginbutton.click();
	
	}
	


}
