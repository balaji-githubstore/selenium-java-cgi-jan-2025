package com.cgi.utilities;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
/**
 * Keep all the testdata for DataProvider
 * 
 */
public class DataProviderUtils {

	@DataProvider
	public Object[][] invalidLoginData() {
		Object[][] data = new Object[2][3];

		data[0][0] = "john";
		data[0][1] = "john123";
		data[0][2] = "Invalid credentials";

		data[1][0] = "saul";
		data[1][1] = "saul123";
		data[1][2] = "Invalid credentials";

		return data;
	}
	
	
	@DataProvider
	public Object[][] commonDataProvider(Method method) throws IOException {
		
		//sheetname is the @Test method
		//get the @Test method name. That should be added as sheetname in excel
		String sheetName=method.getName();
		
		Object[][] data=ExcelUtils.getSheetIntoTwoDimensionalArray("test-data/orange-test-data.xlsx", sheetName);
		return data;
	}
	
}
