package com.mindtree.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.uistore.HomepageSearchLocater;

public class HomepageSearchObject {

	WebDriver driver;
	public HomepageSearchObject(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnSearchBox() {
		driver.findElement(HomepageSearchLocater.searchBox).click();
	}
	
	public void enterText(String search) {
		driver.findElement(HomepageSearchLocater.searchBox).sendKeys(search);
	}
	
	public void pressEnter() {
		driver.findElement(HomepageSearchLocater.searchBox).sendKeys(Keys.ENTER);
	}
	
	public void verifyResult() {
		boolean str=driver.getPageSource().contains("for \"Detergent\"");
        Assert.assertTrue(str);
		driver.findElement(HomepageSearchLocater.verify).isDisplayed();
		System.out.println(driver.findElement(HomepageSearchLocater.verify).getText());
	}
	
}
