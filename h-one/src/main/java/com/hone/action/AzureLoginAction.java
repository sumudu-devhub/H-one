package com.hone.action;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hone.common.Actions;
import com.hone.config.Configration;
import com.hone.exceptions.WebAutomationException;
import com.hone.pages.AdminSideMenuPage;
import com.hone.pages.AzureLoginPage;

public class AzureLoginAction extends Actions{
	private static AzureLoginPage login ;
	private static AdminSideMenuPage admin;

	public AzureLoginAction(WebDriver driver) {
		super(driver);
	}
	
	@SuppressWarnings("static-access")
	public static void login() throws Exception,IOException {
		try {
			type("sumudu.sampath@hirdaramani.com",login.userName);
			click(login.next1);
			type("ict@20vihas",login.password);
			click(login.submit);
			click(login.yes);
			boolean isDashImagePresent = isElementPresent(admin.adminImage);
			if (isDashImagePresent){
				
			}else {
				throw new WebAutomationException("Login Failure");
			}
			
			
			
			
			
		} catch (Exception e) {
			
			throw new WebAutomationException(" Login Failure");
		}
		

}}
