package com.hone.pages;

import org.openqa.selenium.By;

public class AzureLoginPage {

	public static By userName = By.name("loginfmt");
	public static By next1 = By.xpath("//input[@value='Next']");
	public static By password = By.name("passwd"); 
	public static By submit = By.xpath("//input[@value='Sign in' and @type='submit']");
	public static By yes = By.xpath("//input[@value='Yes']");

}
