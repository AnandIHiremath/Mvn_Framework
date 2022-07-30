package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;

import com.mindtree.uistore.RegisterLocater;

public class RegisterObjet {

	public WebDriver driver;

	public RegisterObjet(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnRegister() {
		driver.findElement(RegisterLocater.register).click();
	}
	
	public void clickOnSignup() {
		driver.findElement(RegisterLocater.signup).click();
		for(String i:driver.getWindowHandles()) {
        	driver.switchTo().window(i);
        }
	}

	public void enterNmae(String name) {
		driver.findElement(RegisterLocater.firstname).sendKeys(name);
	}
	
	public void enterEmail(String email) {
		driver.findElement(RegisterLocater.email).sendKeys(email);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(RegisterLocater.password).sendKeys(pwd);
	}
	
	public void createAccount() {
		driver.findElement(RegisterLocater.button).click();
	}
	
	public void verifySignup() {
		driver.findElement(RegisterLocater.verify).isDisplayed();
	}
}
