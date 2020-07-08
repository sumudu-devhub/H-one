package com.h_one;

import org.testng.annotations.Test;

import com.hone.action.Common;
import com.hone.action.GetUserName;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AsureTest {	
	WebDriver driver;
	String itemId ;
	GetUserName userDetails;
		@BeforeMethod
	  public void beforeMethod() throws IOException, ParseException {
			Common common = null;
			System.setProperty("webdriver.chrome.driver", common.getData("driver-path"));
			driver = new ChromeDriver();
			driver.get(common.getData("Asure-Link"));
			driver.manage().window().maximize();
			itemId = userDetails.getItemId();
			
		
	  }
	
	

	@Test()
	public void f() {
		
		
		
	}
	
  

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
