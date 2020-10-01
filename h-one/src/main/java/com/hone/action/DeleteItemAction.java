package com.hone.action;

import org.openqa.selenium.WebDriver;

import com.hone.common.Actions;
import com.hone.pages.DeleteItemPage;

public class DeleteItemAction extends Actions {
	
	private static DeleteItemPage delItem;
	
	public DeleteItemAction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static void deleteItemType(){
		
		type("", delItem.searchItemType());
		
	}
	
	
	
	

}
