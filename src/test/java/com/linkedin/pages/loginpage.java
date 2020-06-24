package com.linkedin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
WebDriver driver;
	
	public loginpage(WebDriver rdriver) {
			
		driver = rdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement uname;
	@FindBy(id="password")
	WebElement passwd;
	@FindBy(xpath="//button[contains(text(),'Sign in')]")
	WebElement login;
	
	
	public void login(String username,String password) {
		uname.sendKeys(username);
		passwd.sendKeys(password);
		login.click();
	}
	

}
