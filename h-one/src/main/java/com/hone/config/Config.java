package com.hone.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	public static void main(String[] args) {
		
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sumudu.Sampath\\eclipse-workspace\\sumuduFristAutomation\\DriverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
        

        
        driver.get(baseUrl);

        
        actualTitle = driver.getTitle();

        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
       
        
        driver.close();
       
    }

}
