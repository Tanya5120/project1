package com.cognixia.traning.MavenTestNGSelenium.test;

import com.cognixia.training.MavenTestNGSelenium.common.ReadFromExcel;
	
	
	
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleSearchAssignmentTestNG extends TestNGBase{

	@Test (dataProvider = "getDataFromExcel")
	public void myTest(String searchstring, String expectedstring) {
		String searchstrings = searchstring;
		searchbox.sendKeys(searchstrings);
		searchbox.submit();
		String expected = expectedstring;
		String actual = driver.getTitle();
		
		Assert.assertEquals(actual, expected);

	}
	
	@DataProvider
	public Object[][] getDataFromExcel() throws IOException {
		return ReadFromExcel.readExcelData("E:\\New folder\\New folder\\MavenTestNGSelenium\\Resourses\\tydata.xlsx");
	}
}
	
	
