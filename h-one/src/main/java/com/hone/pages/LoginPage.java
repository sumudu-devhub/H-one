package com.hone.pages;

import org.openqa.selenium.By;

public class LoginPage {
	public LoginPage() {
	}
	
	public static By userName = By.id("identifierId");
	public static By next = By.id("identifierNext");
	public static By password = By.name("password"); 
	public static By nextPw = By.id("passwordNext");
	
}