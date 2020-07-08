package com.hone.action;

import org.openqa.selenium.WebDriver;

import com.hone.common.Actions;
import com.hone.common.CommonData;
import com.hone.pages.AddItemMasterPage;

public  class AddNewItemTypeAction extends Actions {
	private static AddItemMasterPage addItem;
	private static CommonData common;
	
	public AddNewItemTypeAction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public  static void addItemType() throws Exception{
		
		try {
			type(common.getItemTypeId(),addItem.itemTypeName);
			click(addItem.checkBox);
			type("This Is a Test" , addItem.attributename1);
			type("Charith Test", addItem.attributeName2);
			type("Ravindu Test Gihan Test", addItem.attributeName3);
			type("Binushi & Udari Special Charatet", addItem.attributeName4);
			type("Mune,Liynna Manjula,Prbath", addItem.attributeName5);
			click(addItem.clickAdd);
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		
		
		
	}
	
	

}
