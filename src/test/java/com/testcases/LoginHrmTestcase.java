package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.loginHrm;
import com.utils.ReadWrite;




public class LoginHrmTestcase extends Library {
	
	@BeforeMethod
	public void startUp() throws IOException {
		launchApplication();
	}
	
	@Test(dataProvider="orangehrm")
	public void OrangeHRMLogin(String username,String pword) throws IOException {
		loginHrm hrm = new loginHrm (driver);
		hrm.clickSummit(username,pword);
		
	}
	@DataProvider(name="orangehrm")
	public Object[][] passData() throws IOException{
		ReadWrite read = new ReadWrite();
		Object[][] data = read.ReadData();
		return data;
	}
	
	/*@DataProvider(name="orangehrm")
	  public  Object[][] passData() throws IOException{
		XLUtils util =  new XLUtils();
		
		  int rowcount = util.getRowCount("C:\\Users\\itsdi\\Downloads\\FBLoginTest.xlsx","Sheet3");
		  int CellCnt = util.getcellCount("C:\\Users\\itsdi\\Downloads\\FBLoginTest.xlsx","Sheet3",1);
		  
		  Object[][] data = new Object[rowcount][CellCnt];
		  for(int i=1;i<=rowcount;i++) 
			{				  
			  for(int j=0;j<CellCnt;j++) {
				  data[i-1][j] =util.getCelldata("C:\\Users\\itsdi\\Downloads\\FBLoginTest.xlsx", "Sheet3", i, j);
				  
			 }
			}
	 
		  return data;
		  }*/
	
	
	@AfterMethod
	public void close() throws IOException {
		screenShot();
		quit();
	}

}
