package com.hone.config;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Configration {

	private static WebDriver driver;
	private static String URL;
	private static String DRIVER_PATH;

	/**
	 * 
	 * @return
	 */
	public static WebDriver init() {
		try {
			URL = getData("Asure-Link");
			DRIVER_PATH = getData("driver-path");
			// declaration and instantiation of objects/variables
			System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
			driver = new ChromeDriver();
			driver.get(URL);
			driver.manage().window().maximize();

			return driver;

		} catch (Exception e) {
			return null;
		}

	}

	public static void close() {
		driver.quit();

	}
	
	
	//Sumudu Test

	public static String getData(String key) throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		JSONObject value = null;
		Object text  = null;
		try (FileReader reader = new FileReader("./data/data.json")) {
			// Read JSON file
			Object obj = jsonParser.parse(reader);

			value = (JSONObject) obj;
			text  = value.get(key);

			// Iterate over employee array

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return text.toString();
	}

	/*
	 * // Get the WebElement corresponding to the Email Address(TextField)
	 * WebElement email = driver.findElement(By.id("identifierId")); WebElement next
	 * = driver.findElement(By.id("identifierNext"));
	 * email.sendKeys("sssthushara@gmail.com"); next.click();
	 * 
	 * // Get the WebElement corresponding to the Password Field //WebElement
	 * password = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
	 * "//*[@id=\"password\"]/div[1]/div/div[1]/input"))); WebElement password =
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"password\"]/div[1]/div/div[1]/input")));
	 * 
	 * 
	 * WebElement ssss = driver.findElement(By.id("passwordNext"));
	 * 
	 * 
	 * password.sendKeys("krishanthishashitha"); ssss.click();
	 * 
	 * // password.sendKeys("abcdefghlkjl"); System.out.println("Text Field Set");
	 * 
	 * // Deleting values in the text box // email.clear(); //password.clear();
	 * System.out.println("Text Field Cleared");
	 * 
	 * // Find the submit button // WebElement login =
	 * driver.findElement(By.id("SubmitLogin"));
	 * 
	 * // Using click method to submit form // email.sendKeys("abcd@gmail.com"); //
	 * password.sendKeys("abcdefghlkjl"); //login.click();
	 * //System.out.println("Login Done with Click");
	 * 
	 * //using submit method to submit the form. Submit used on password field //
	 * driver.get(baseUrl);
	 * //driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
	 * //driver.findElement(By.name("passwd")).sendKeys("abcdefghlkjl");
	 * //driver.findElement(By.id("SubmitLogin")).submit(); //
	 * System.out.println("Login Done with Submit");
	 * 
	 * //driver.close();
	 * 
	 * }}
	 */
}
