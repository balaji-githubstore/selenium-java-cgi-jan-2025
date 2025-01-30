package com.cgi.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cgi.base.AutomationWrapper;
import com.cgi.pages.DashboardPage;
import com.cgi.pages.LoginPage;
import com.cgi.utilities.DataProviderUtils;

public class LoginTest extends AutomationWrapper {
	@Test
	public void validLoginTest() {

		LoginPage login = new LoginPage(driver);

		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clickOnLogin();

		DashboardPage dashboard = new DashboardPage(driver);

		String actualValue = dashboard.getQuickLaunchText();
		Assert.assertEquals(actualValue, "Quick Launch");
	}

	@Test(dataProviderClass = DataProviderUtils.class, dataProvider = "invalidLoginData")
	public void invalidLoginTest(String username, String password, String expectedError) {

		LoginPage login = new LoginPage(driver);

		login.enterUsername(username);
		login.enterPassword(password);
		login.clickOnLogin();

		// Assert the error - Invalid credentials
		String actualError = login.getInvalidErrorMessage();
		Assert.assertEquals(actualError, expectedError);
	}
}
