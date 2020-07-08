package com.hone.action;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hone.common.Actions;
import com.hone.config.Configration;
import com.hone.exceptions.WebAutomationException;
import com.hone.pages.LoginPage;

public class LoginAction extends Actions{
	
	
	
	public LoginAction(WebDriver driver) {
		super(driver);
	}

	private static LoginPage login ;
	private static Configration config;
	
	@SuppressWarnings("static-access")
	public static void login() throws Exception {
		try {
		
			type("sssthushara@gmail.com",login.userName);
			click(login.next);
			type("krishanthishashitha",login.password);
			click(login.nextPw);
			
		} catch (Exception e) {
			config.close();
			throw new WebAutomationException("Gmail Login Failure");
		}
		

		
		
		
		
	}
	
	


}
