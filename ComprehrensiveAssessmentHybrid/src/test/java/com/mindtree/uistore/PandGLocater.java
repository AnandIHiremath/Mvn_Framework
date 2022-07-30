package com.mindtree.uistore;

import org.openqa.selenium.By;

public class PandGLocater {

	public static By pAg=By.cssSelector("img[src='/images/header_logo_png.png']");
	
	public static By hover=By.xpath("//div[@class='navigation']//li//span[contains(text(),'Our Company')]");
	
	public static By leadership=By.linkText("Leadership");
	
	public static By verify=By.xpath("//span[contains(text(),'A team with the future in mind')]");
}
