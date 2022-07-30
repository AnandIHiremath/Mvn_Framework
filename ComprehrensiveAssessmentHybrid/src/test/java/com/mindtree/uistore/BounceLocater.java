package com.mindtree.uistore;

import org.openqa.selenium.By;

public class BounceLocater {

	public static By bounce=By.cssSelector("img[src='/images/header_logo_bounce.png']");
	
	public static By buy=By.linkText("Buy Now");
	
	public static By text1=By.xpath("//p[contains(text(),'Bounce® Rapid Touch ')]");
	
	public static By text2=By.xpath("//h1[contains(text(),'Bounce® Rapid Touch Up 3-in-1 Clothing Spray')]");
}
