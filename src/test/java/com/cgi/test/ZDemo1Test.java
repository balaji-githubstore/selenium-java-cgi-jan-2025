package com.cgi.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/**
 * Will be deleted. Not part of the framework!!
 */
public class ZDemo1Test {

	@DataProvider
	public String[][] validData() 
	{
		String[][] data = new String[4][2];
		// i-->number of testcases
		// j--> number of arguments

		data[0][0] = "saul";
		data[0][1] = "saul123";

		data[1][0] = "kim";
		data[1][1] = "kim123";

		data[2][0] = "peter";
		data[2][1] = "peter123";
		
		data[3][0]="john";
		data[3][1]="john123";

		return data;
	}

	@Test(dataProvider = "validData")
	public void validLogin(String username, String password) 
	{
		System.out.println("Valid Login"+username+password);
	}

}
