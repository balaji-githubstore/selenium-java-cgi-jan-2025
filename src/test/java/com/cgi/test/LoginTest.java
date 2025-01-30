package com.cgi.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cgi.base.AutomationWrapper;
import com.cgi.pages.DashboardPage;
import com.cgi.pages.LoginPage;

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

	@Test
	public void invalidLoginTest() {

		LoginPage login = new LoginPage(driver);

		login.enterUsername("john");
		login.enterPassword("john123");
		login.clickOnLogin();

		// Assert the error - Invalid credentials
		String actualError = login.getInvalidErrorMessage();
		Assert.assertEquals(actualError, "Invalid credentials");
	}
}
