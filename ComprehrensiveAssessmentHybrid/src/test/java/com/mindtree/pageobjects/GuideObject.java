package com.mindtree.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.uistore.GuideLocater;

public class GuideObject {

	WebDriver driver;
	public GuideObject(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnArrow() {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,800)", "");
		driver.findElement(GuideLocater.arrow).click();
	}
	
	public void clickOnLearnMore() {
		
		boolean str=driver.getPageSource().contains("mildew");
		Assert.assertTrue(str);
		
		driver.findElement(GuideLocater.learn).click();
	}
	
}
