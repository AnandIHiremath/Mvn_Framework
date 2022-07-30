package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;

import com.mindtree.uistore.BounceLocater;

public class BounceObject {

	WebDriver driver;
	public BounceObject(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnBounce() {
		driver.findElement(BounceLocater.bounce).click();
	}
	
	public String s1;
	public void cliclOnBuy() {
		s1=driver.findElement(BounceLocater.text1).getText();
		System.out.println(s1);
		driver.findElement(BounceLocater.buy).click();
	}
	
	public void compareProductName() {
		String s2=driver.findElement(BounceLocater.text2).getText();
		System.out.println(s2.toUpperCase());
		if(s1.equals(s2.toUpperCase())) {
			System.out.println("Product name is same");
		}else {
			System.out.println("product name is different");
		}
	}
	
}
