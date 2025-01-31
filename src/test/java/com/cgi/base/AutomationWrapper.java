package com.cgi.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class AutomationWrapper {

	protected WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	@Parameters({"browser"})
	public void setup(String browserName) {

		
		if (browserName.equalsIgnoreCase("ff")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@AfterMethod(alwaysRun = true)
	public void teardown() {
		driver.quit();
	}

}
