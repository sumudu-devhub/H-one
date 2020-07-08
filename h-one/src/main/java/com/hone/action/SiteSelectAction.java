package com.hone.action;

import org.openqa.selenium.WebDriver;

import com.hone.common.Actions;
import com.hone.pages.SiteSelectPage;

public class SiteSelectAction extends Actions{
	private static SiteSelectPage page;

	public SiteSelectAction(WebDriver driver) {
		super(driver);
	}
	// AGA - Factory B
	public static void selectSite(String value){
		selectOptionByVisibleText(page.site, value);
		
	}

}
