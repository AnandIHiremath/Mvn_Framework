package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.mindtree.uistore.DownyLocater;

public class DownyObject {

	WebDriver driver;
	public DownyObject(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickonDowny() {
		driver.findElement(DownyLocater.downy).click();
	}
	
	public void hoverOnAbout() {
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(DownyLocater.about)).build().perform();
	}
	
	public void clickOnIngre() {
		driver.findElement(DownyLocater.ingre).click();
	}
	
	public void verifyText() {
		boolean str=driver.getPageSource().contains("Downy ingredients");
        Assert.assertTrue(str);
		driver.findElement(DownyLocater.verify).isDisplayed();
		System.out.println(driver.findElement(DownyLocater.verify).getText());
	}
	
}
