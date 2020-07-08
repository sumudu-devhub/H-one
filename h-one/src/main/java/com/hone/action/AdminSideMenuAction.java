package com.hone.action;

import org.openqa.selenium.WebDriver;

import com.hone.common.Actions;
import com.hone.pages.AdminSideMenuPage;

@SuppressWarnings("static-access")
public class AdminSideMenuAction extends Actions{
	private static AdminSideMenuPage page;
	public static String ADD_NEW = "addItemType ()";
	public AdminSideMenuAction(WebDriver driver) {
		super(driver);
		
	}
	public static void clickSideMenuItem(String menuItem){
		System.out.println("Inside Side Menu Option Click");
		pause(10);
		click(page.sideMenuItemClick(menuItem));
	System.out.println("Side Menu Click Completed");

	}
	
	
	public static void clickSideMenuSubItem(String subMenuItem){
		System.out.println("Inside Side Menu Option Click");
		click(page.sideMenuSubItemClick (subMenuItem));
	System.out.println("Side Menu Click Completed");

	}
	
	public static void clickNewItemAdd() {
		pause(10);
		System.out.println("New button Clicked");
		click(page.newButtonClicked(ADD_NEW));
		
		System.out.println("New Button Click Completed");
		
	}
	
	
	
	
	

}
