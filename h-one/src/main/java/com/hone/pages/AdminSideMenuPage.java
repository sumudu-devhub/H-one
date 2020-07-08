package com.hone.pages;

import org.openqa.selenium.By;

public class AdminSideMenuPage {
	/**
	 * 
	 * @param name "Admin, Fabric Inspection"
	 * @return
	 */
	public static By sideMenuItemClick(String name){
		return By.xpath("//span[text()='"+name+"']");
	}
	
	public static By sideMenuSubItemClick(String name){
		return By.xpath("//a[text()='"+name+"']");
	}
	
	public static By newButtonClicked(String ClickNew) {
		return By.xpath("//div[@ng-click ='"+ClickNew+"']");
	}
	
	public static By adminImage = By.xpath("//img[@src='../../img/qmslogo3.png']");

}
