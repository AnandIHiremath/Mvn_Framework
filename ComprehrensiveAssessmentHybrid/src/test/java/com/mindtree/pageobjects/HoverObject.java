package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.mindtree.uistore.HoverLocater;

public class HoverObject {

	WebDriver driver;
	public  HoverObject(WebDriver driver) {
		this.driver=driver;
	}
	
	public void mouseHover() {
		
		
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(HoverLocater.hover)).build().perform();
		
	}
	
	public void clickOnPacs() throws InterruptedException {
		
		driver.findElement(HoverLocater.pacs).click();
		Thread.sleep(2000);
	}
	
	public void TextVerify()   {
		
		boolean str=driver.getPageSource().contains("Tide Laundry Pacs");
          Assert.assertTrue(str);
		driver.findElement(HoverLocater.verify).isDisplayed();
		System.out.println(driver.findElement(HoverLocater.verify).getText());
		
	}
}
