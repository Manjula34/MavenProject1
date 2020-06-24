package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage {
	WebDriver driver;
	
	public AdminPage(WebDriver rdriver) {
			
		driver = rdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="menu_admin_viewAdminModule")
	WebElement Admin;
	
	@FindBy(id="searchSystemUser_userName")
	WebElement uname;
	
	@FindBy(id="searchSystemUser_userType")
	WebElement urole;
	
	@FindBy(id="searchSystemUser_employeeName_empName")
	WebElement ename;
	@FindBy(id="searchSystemUser_status")
	WebElement status;
	
	@FindBy(id="searchBtn")
	WebElement searchbtn;
	
	@FindBy(id="btnAdd")
	WebElement Addbtn;
	
	@FindBy(id="systemUser_userType")
	WebElement userrole;
	
	@FindBy(id="systemUser_employeeName_empName")
	WebElement empname;
	
	@FindBy(id="systemUser_userName")
	WebElement username;
	
	@FindBy(id="systemUser_status")
	WebElement addstatus;
	
	@FindBy(id="systemUser_password")
	WebElement addpassword;
	
	@FindBy(id="systemUser_confirmPassword")
	WebElement addconfirmpwd;
	
	@FindBy(id="btnSave")
	WebElement SaveButton;
	
	
	public void CLickAmin() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(Admin));		
		Admin.click();
	}
	public void usename(String name) {
		uname.sendKeys(name);
	} 
	public void Userrole(String role) {
		Select sel = new Select(urole);
		sel.selectByVisibleText(role);
	}
	public void Status(String role) {
		Select sel = new Select(status);
		sel.selectByVisibleText(role);
	}
	public void EmpName(String name) {
		ename.sendKeys(name);
	}
	public void CLickSave() {
		SaveButton.click();
	}
	public void CLickSearch() {
		searchbtn.click();
	}
	public void CLickAdd() {
		Addbtn.click();
	}
	public void Adduserrole(String role) {
		Select sel = new Select(userrole);
		sel.selectByVisibleText(role);
	}
	public void AddEmpName(String name,String uname) {
		empname.sendKeys(name);
		username.sendKeys(uname);
	}
	public void AddStatus(String status) {
		Select sel = new Select(addstatus);
		sel.selectByVisibleText(status);
	}
	public void Addpassword(String pwd) {
		addpassword.sendKeys(pwd);
	}
	public void Addconfirmpwd(String pwd) {
		addconfirmpwd.sendKeys(pwd);
	}
}
