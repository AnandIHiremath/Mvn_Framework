package com.mindtree.uistore;

import org.openqa.selenium.By;

public class RegisterLocater {

	public static By register=By.className("login-register");
	
	public static By signup=By.linkText("Sign up now");
	
	public static By firstname=By.id("name");
	
	public static By email=By.id("email");
	
	public static By password=By.id("password");
	
	public static By button=By.cssSelector("input[value='CREATE ACCOUNT']");
	
	public static By verify=By.xpath("//span[contains(text(),'If there are none, click skip')]");
}
