package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.mindtree.uistore.PandGLocater;

public class PandGObject {

	WebDriver driver;
	public PandGObject(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnPandG() {
		driver.findElement(PandGLocater.pAg).click();
	}
	
	public void mouseHoverOnOurCompany() {
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(PandGLocater.hover)).build().perform();
	}
	
	public void clickOnLeadership() {
		driver.findElement(PandGLocater.leadership).click();
	}
	
	public void verifyText() {
		boolean str=driver.getPageSource().contains("A team with the future in mind");
        Assert.assertTrue(str);
		driver.findElement(PandGLocater.verify).isDisplayed();
		System.out.println(driver.findElement(PandGLocater.verify).getText());
	}
	
}
