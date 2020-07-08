package com.hone.pages;

import org.openqa.selenium.By;

public class AddItemMasterPage {
	
	public static By itemTypeName = By.id("ItemTypeName"); 
	public static By attributename1 = By.id("Attribute1Name");
	public static By checkBox = By.xpath("//input[@ng-model='item.Active']");
	public static By attributeName2 = By.id("Attribute2Name");
	public static By attributeName3 = By.id("Attribute3Name");
	public static By attributeName4 = By.id("Attribute4Name");
	public static By attributeName5 = By.id("Attribute5Name");
	public static By clickAdd = By.xpath("//button[@ng-click='addItemType(item)']");
	
	
	

}
