package com.hone.pages;

import org.openqa.selenium.By;

public class DeleteItemPage {

	public static By searchItemType() {

		return By.xpath("//input[@type= 'search']");
	}

	public static By selectItemGrid(String name) {

		return By.xpath("//td[text()='" + name + "']");

	}
	
	public static By deleteitemButton(String name){
		
		return By.xpath("//div[@ng-click='"+ name +"']");
		
		
	}

}
