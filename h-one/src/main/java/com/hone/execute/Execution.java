package com.hone.execute;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.hone.action.AddNewItemTypeAction;
import com.hone.action.AdminSideMenuAction;
import com.hone.action.AzureLoginAction;
import com.hone.common.Actions;
import com.hone.config.Configration;
import com.hone.exceptions.WebAutomationException;

public class Execution {
	public static AzureLoginAction login;
	private static WebDriver driver;
	private static Configration config;
	private static Actions action;
	public static AdminSideMenuAction adminSideMenuAction;
	public static AddNewItemTypeAction addNewItem;
	
	
	private static Logger LOGGER = LoggerFactory.getLogger(Execution.class);
	
	@SuppressWarnings("static-access")
	@Test
	public  void run (){
		System.out.println("PROCESS EXECUTION STARTED");
		try {
			
			driver = config.init();
			action = new Actions(driver);
			login.login();
			adminSideMenuAction.clickSideMenuItem("Admin");
			adminSideMenuAction.clickSideMenuSubItem("Item Type");
			adminSideMenuAction.clickNewItemAdd();
			addNewItem.addItemType();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			LOGGER.info("PROCESS EXECUTION END");
		}catch (WebAutomationException e) {
			LOGGER.info("Error : {}",e.getMessage());
			Assert.assertEquals("Login Failure", e.getMessage());
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	/*@AfterMethod
	public void zloseDriver(){
		System.out.println("close");
		driver.quit();
	}*/
	
	

}
