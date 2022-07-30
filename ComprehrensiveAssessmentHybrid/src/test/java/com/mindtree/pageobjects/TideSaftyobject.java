package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.uistore.TideSaftyLocater;

public class TideSaftyobject {

	WebDriver driver;
	public TideSaftyobject(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnSafty() {
		driver.findElement(TideSaftyLocater.safty).click();
	}
	
	public void verifyText() {
		boolean str=driver.getPageSource().contains("Home Safety During Use");
        Assert.assertTrue(str);
		driver.findElement(TideSaftyLocater.verify).isDisplayed();
		System.out.println(driver.findElement(TideSaftyLocater.verify).getText());
	}
	
}
