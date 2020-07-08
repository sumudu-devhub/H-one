package com.hone.execute;

import org.testng.annotations.Test;

import com.hone.action.AdminSideMenuAction;
import com.hone.action.AzureLoginAction;
import com.hone.action.CompanySelection;
import com.hone.action.SiteSelectAction;
import com.hone.common.Actions;
import com.hone.config.Configration;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FabricRollCreation {
	private static WebDriver driver;
	private static Configration config;
	private static AzureLoginAction login;
	private static SiteSelectAction site;
	private static Actions action;
	private static AdminSideMenuAction adminSideMenuAction;
	private static CompanySelection company;
	

	

	@BeforeMethod
	public static void beforeMethod() throws Exception{

			System.out.println("Fabric Roll Creation Process");
			driver = config.init();
			action = new Actions(driver);
	}
	@Test
	public void f() {
		try {
			login.login();
			site.selectSite("AGA - Factory B");
			adminSideMenuAction.clickSideMenuItem("Admin");
			adminSideMenuAction.clickSideMenuSubItem("Site Master");
			action.pause(10);
			company.selectCompany("HIE - Knit Cluster");
			action.pause(30);
			
			adminSideMenuAction.clickSideMenuItem("Admin");
			AdminSideMenuAction.clickSideMenuItem("Fabric Inspection");
			adminSideMenuAction.clickSideMenuSubItem("Transactions");
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}

}
