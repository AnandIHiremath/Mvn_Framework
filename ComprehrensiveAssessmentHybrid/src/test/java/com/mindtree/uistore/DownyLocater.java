package com.mindtree.uistore;

import org.openqa.selenium.By;

public class DownyLocater {

	public static By downy=By.cssSelector("img[src='/images/header_logo_downy.png']");
	
	public static By about=By.id("2A");
	
	public static By ingre=By.xpath("//span[contains(text(),'Ingredients')]");
	
	public static By verify=By.xpath("//strong[contains(text(),'Downy ingredients')]");
}
