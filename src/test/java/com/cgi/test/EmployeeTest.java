package com.cgi.test;

import org.testng.annotations.Test;

import com.cgi.base.AutomationWrapper;
import com.cgi.pages.LoginPage;
import com.cgi.utilities.DataProviderUtils;

public class EmployeeTest extends AutomationWrapper{
	
	@Test(dataProviderClass = DataProviderUtils.class, dataProvider = "commonDataProvider")
	public void addValidEmployeeTest(String username,String password,String firstname,String middlename,String lastname,String expectedValue)
	{
		LoginPage login = new LoginPage(driver);

		login.enterUsername(username);
		login.enterPassword(password);
		login.clickOnLogin();
		
		//Click on PIM Menu
		//Click on Add employee
		//enter firstname
		//enter middlename 
		//enter lastname
		
		//Assert the profile name - firstname lastname
	}

}
