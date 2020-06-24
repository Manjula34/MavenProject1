package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RecruitmentPage {
	WebDriver driver;
	
	public RecruitmentPage(WebDriver rdriver) {
			
		driver = rdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//b[contains(text(),'Recruitment')]")
	WebElement Recruitment;
	
	@FindBy(id="candidateSearch_jobTitle")
	WebElement jtitle;
	
	@FindBy(id="candidateSearch_jobVacancy")
	WebElement jvacant;
	
	@FindBy(id="candidateSearch_status")
	WebElement Status;
	
	@FindBy(id="candidateSearch_candidateName")
	WebElement cname;
	
	@FindBy(id="candidateSearch_keywords")
	WebElement ckeywords;
	
	@FindBy(id="candidateSearch_fromDate")
	WebElement fromdate;
	
	@FindBy(id="candidateSearch_toDate")
	WebElement todate;
	
	@FindBy(id="btnSrch")
	WebElement searchbtn;
	
	@FindBy(id="candidateSearch_modeOfApplication")
	WebElement modeofApp;
	
	@FindBy(id="btnAdd")
	WebElement Addbtn;
	
	@FindBy(id="addCandidate_firstName")
	WebElement fname;
	
	@FindBy(id="addCandidate_lastName")
	WebElement lname;
	
	@FindBy(id="addCandidate_email")
	WebElement email;
	
	@FindBy(id="addCandidate_contactNo")
	WebElement ContactNo;
	
	@FindBy(id="addCandidate_resume")
	WebElement cresume;
	
	@FindBy(id="addCandidate_appliedDate")
	WebElement date;
	
	@FindBy(xpath= "//a[contains(text(),'15')]")
	WebElement DOA;
	
	@FindBy(id="btnSave")
	WebElement Savebtn;
	
	public void jobTitle(String text) {
		Select Sel = new Select(jtitle);
		Sel.selectByVisibleText(text);
	}
	public void dateofApp() {
		//date.clear();
		date.click();
		DOA.click();
		
	}
	
	public void ClickRecurit(){
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(Recruitment));			
		Recruitment.click();
	}
	
	public void Status(String text) {
		Select Sel = new Select(Status);
		Sel.selectByVisibleText(text);
	}
	public void cname_keyword(String name,String keyword) {
		cname.sendKeys(name);
		ckeywords.sendKeys(keyword);
	}
	public void dateSelection(String from,String to) {
		fromdate.clear();
		fromdate.sendKeys(from);
		todate.clear();
		todate.sendKeys(to);
		}
	public void modeofApplication(String mode) {
		modeofApp.sendKeys(mode);
	}
	public void clickSearch() {
		searchbtn.click();
	}
	public void ClickAdd(){
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.elementToBeClickable(Addbtn));			
		Addbtn.click();
	}
	public void FullName(String firstname,String lastname)
	{
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
	}
	public void emailContact(String Email,String contact) {
		email.sendKeys(Email);
		ContactNo.sendKeys(contact);
	}
	public void candResume(String path) {
		cresume.sendKeys(path);
	}
	public void SaveButton() {
		Savebtn.click();
	}
	
}
