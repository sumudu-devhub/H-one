package com.hone.action;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetUserName {

	public static String getItemId(){
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
