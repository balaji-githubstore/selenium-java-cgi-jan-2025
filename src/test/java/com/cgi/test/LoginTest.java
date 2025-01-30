package com.cgi.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.cgi.base.AutomationWrapper;

public class LoginTest extends AutomationWrapper {
	@Test
	public void validLoginTest() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		// enter password as admin123
		// click on login
		// Assert the QuickLaunch Text
	}

	@Test
	public void invalidLoginTest() {
		driver.findElement(By.name("username")).sendKeys("john");
		// enter password as john123
		// click on login
		// Assert the error - Invalid credentials
	}
}
