package com.hone.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("static-access")
public class Actions {
	public static WebDriver driver;
	public static WebDriverWait wait;
	private static ExpectedConditions ec;

	public Actions(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * 
	 * @param element
	 */
	public static void click(By element) {
		wait = new WebDriverWait(driver, 40);
		WebElement object = wait.until(ec.presenceOfElementLocated((element)));
		object.click();
	}

	/**
	 * this method can be use to get text value of elements
	 * 
	 * @param value
	 * @param element
	 */
	public static void type(String value, By element) {
		wait = new WebDriverWait(driver, 40);
		WebElement object = wait.until(ec.presenceOfElementLocated((element)));
		object.sendKeys(value);
	}

	public static String getText(By element) {
		String text = null;
		WebElement object = wait.until(ec.presenceOfElementLocated((element)));
		text = object.getText();
		return text;
	}

	/**
	 * Not recommended for web automation. use maximum 15 seconds, otherwise
	 * Driver will be crashed
	 * 
	 * @param seconds
	 */
	public static void pause(long seconds) {
		long miliseconds = seconds * 1000;
		try {
			Thread.sleep(miliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	/**
	 * this method can be used to validate whether the element is present 
	 * @param element
	 * @return
	 */
	public static boolean isElementPresent(By element){
		try {
			wait.until(ec.presenceOfElementLocated((element)));
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	/**
	 * this method is used to select dropdown value using by value
	 * @param element
	 * @param value
	 */
	public static void selectOptionByValue(By element,String value){
		Select select = new Select(wait.until(ec.presenceOfElementLocated((element))));
		select.selectByValue(value);
	}
	/**
	 * this method is used to select drop down value using by visible text
	 * @param element
	 * @param value
	 */
	public static void selectOptionByVisibleText(By element,String value){
		Select select = new Select(wait.until(ec.presenceOfElementLocated((element))));
		select.selectByVisibleText(value);
	}
	/**
	 * This method is used to get first selected element of drop down list
	 * @param element
	 * @return
	 */
	public static String getSelectedFirstItem(By element){
		Select select = new Select(driver.findElement(element));
		WebElement option = select.getFirstSelectedOption();
		String defaultItem = option.getText();
		return defaultItem;
	}

}
