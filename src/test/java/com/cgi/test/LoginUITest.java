package com.cgi.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cgi.base.AutomationWrapper;

public class LoginUITest extends AutomationWrapper{
	@Test
	public void titleTest() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM");
	}

	@Test
	public void placeholderTest() {
		String actualUsernamePlaceholder = driver.findElement(By.name("username")).getDomAttribute("placeholder");
		String actualPasswordPlaceholder = driver.findElement(By.name("password")).getDomAttribute("placeholder");

		Assert.assertEquals(actualUsernamePlaceholder, "Username");
		Assert.assertEquals(actualPasswordPlaceholder, "Password");
	}
	
	@Test
	public void headerTest()
	{
		String actualHeader=driver.findElement(By.xpath("//h5")).getText();
		Assert.assertEquals(actualHeader, "Login");
	}

}
