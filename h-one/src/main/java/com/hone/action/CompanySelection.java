package com.hone.action;

import org.openqa.selenium.WebDriver;

import com.hone.common.Actions;
import com.hone.pages.SelectCompanyPage;

public class CompanySelection extends Actions {
	private static SelectCompanyPage companyPage;
	
	public CompanySelection(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static void selectCompany(String value){
		selectOptionByVisibleText(companyPage.company,value );
		
		
		
		
	}

	


}
