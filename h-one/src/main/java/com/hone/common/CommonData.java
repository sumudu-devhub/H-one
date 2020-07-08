package com.hone.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonData {
	
	public static String BaseUrl = "https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm%26ogbl&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession";
	public static String driverPath = "./chromedriver.exe";
	
	
	public static String getItemTypeId(){
		String name = getUserName();
		String date = getCurrentDate();
		String itemTypeId = name+"-"+date;
		System.out.println(itemTypeId);
		return itemTypeId;

	}
	
	
public static String getUserName() {
	String userName = (System.getProperty("user.name"));
	String subUserName = userName.substring(0,3);
	System.out.println(subUserName.toUpperCase());
	return subUserName.toUpperCase();
}

public static String  getCurrentDate(){
	Date date = new Date();
	String datt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
	String dateString = datt.replace("-", "").replace(":", "").replace(" ", "");
	System.out.println(dateString);
	return dateString;
}
}
