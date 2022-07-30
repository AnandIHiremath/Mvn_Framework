package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.uistore.FooterLocater;

public class FooterObject {

	WebDriver driver;
	public FooterObject(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnRemoveStain() {
		driver.findElement(FooterLocater.stain).click();
	}
	
	public void verifyText() {
		boolean str=driver.getPageSource().contains("It’s a fact of life that not all stains are created equal.");
        Assert.assertTrue(str);
//		driver.findElement(FooterLocater.verify).isDisplayed();
//		System.out.println(driver.findElement(FooterLocater.verify).getText());
	}
	
}
