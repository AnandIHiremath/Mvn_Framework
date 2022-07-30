package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.mindtree.uistore.OurCommitmentLocater;

public class OurCommitmentObject {

	WebDriver driver;
	public OurCommitmentObject(WebDriver driver) {
		this.driver=driver;
	}
	
	public void hoverOnOurCommitment() {
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(OurCommitmentLocater.hover)).build().perform();
	}
	
	public void clickOnSustainability() {
		driver.findElement(OurCommitmentLocater.sustain).click();
	}
	
	public void clickOnLearnMore() {
		driver.findElement(OurCommitmentLocater.more).click();
	}
	
}
