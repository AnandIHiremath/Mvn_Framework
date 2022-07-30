package com.mindtree.runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.mindtree.pageobjects.BounceObject;
import com.mindtree.pageobjects.DownyObject;
import com.mindtree.pageobjects.FooterObject;
import com.mindtree.pageobjects.GuideObject;
import com.mindtree.pageobjects.HomepageSearchObject;
import com.mindtree.pageobjects.HoverObject;
import com.mindtree.pageobjects.OurCommitmentObject;
import com.mindtree.pageobjects.PandGObject;
import com.mindtree.pageobjects.RegisterObjet;
import com.mindtree.pageobjects.TideSaftyobject;
import com.mindtree.utilities.BaseClass;
import com.mindtree.utilities.ConfigureData;
import com.mindtree.utilities.ExcelDataProvider;
import com.mindtree.utilities.ExtentReport;
import com.mindtree.utilities.ScreenShotCapture;

public class Runner {

	WebDriver driver = null;
	ExcelDataProvider ex;
    ConfigureData config;
	BaseClass baseObject;
	ExtentReport er;
	private static Logger log = LogManager.getLogger(Runner.class);
	
	@BeforeSuite
	public void before() throws IOException {
		ex = new ExcelDataProvider();
		config = new ConfigureData();
		baseObject = new BaseClass();
		er=new ExtentReport();
		er.extentReport();
		log.info("Initilizing all the methods");
	}

	@BeforeMethod
	public void setUp() {
		driver = baseObject.initializeDriver(config.getUrl(), config.getBrowser());
		
		log.info("Setting Up Browser");
	}
	
	@Test(priority = 1)
	public void test1() throws InterruptedException {
		er.test = er.extent.createTest("Shop products Test ", "This is test to validate shop products working");
		er.test.log(Status.INFO, "Starting Test case");
		log.info("First Test case");
		HoverObject ho=new HoverObject(driver);
		ho.mouseHover();
		log.info("Mouse hovered on shop products");
		er.test.pass("Mouse hovered on shop products");
		ho.clickOnPacs();
		log.info("Clicked on Pacs");
		er.test.pass("Clicked on pacs");
		ho.TextVerify();	
		log.info("Text verified");
		er.test.pass("Text displayed");
        
	}
	
	@Test(priority = 2)
	public void test2() {
		er.test = er.extent.createTest(" Signup funcationality Test ", "This is test to validate signup page ");
		er.test.log(Status.INFO, "Starting Test case");
		log.info("Second Test case");
		RegisterObjet ro=new RegisterObjet(driver);
		ro.clickOnRegister();
		log.info("Clicked on Register button");
		er.test.pass("Clicked on Register button");
		ro.clickOnSignup();
		log.info("Clicked on Signup button");
		er.test.pass("Clicked on Signup button");
		ro.enterNmae(ex.getStringData(0, 0, 0));
		log.info("Entered first name");
		er.test.pass("Entered first name");
		ro.enterEmail(ex.getStringData(0, 1, 0));
		log.info("Entered Email address");
		er.test.pass("Entered Email address");
		ro.enterPassword(ex.getStringData(0, 2, 0));
		log.info("Entered password");
		er.test.pass("Entered password");
		ro.createAccount();
		log.info("Clicked on Create Account button");
		er.test.pass("Clicked on Create Account button");
		//ro.verifySignup();
	}
	
	@Test(priority = 3)
	private void test3() {
		er.test = er.extent.createTest(" Tide safty message Test ", "This is test to validate Tide safty page ");
		er.test.log(Status.INFO, "Starting Test case");
		log.info("Third Test case");
		TideSaftyobject to=new TideSaftyobject(driver);
		to.clickOnSafty();
		log.info("Clicked on At Tide Safety Comes First, and It Never Stops");
		er.test.pass("Clicked on At Tide Safety Comes First, and It Never Stops");
		to.verifyText();
		log.info("Text verified");
		er.test.pass("Text displayed");
	}
	
	@Test(priority = 4)
	public void test4() {
		er.test = er.extent.createTest(" Search funcationality Test ", "This is test to validate search operation ");
		er.test.log(Status.INFO, "Starting Test case");
		log.info("Fourth Test case");
		HomepageSearchObject hpo=new HomepageSearchObject(driver);
		
		hpo.clickOnSearchBox();
		log.info("Clicked on Search box");
		er.test.pass("Clicked on Search box");
		hpo.enterText(ex.getStringData(0, 3, 0));
		log.info("Entered text in Search box");
		er.test.pass("Entered text in Search box");
		hpo.pressEnter();
		log.info("Pressed Enter");
		er.test.pass("Pressed Enter");
		hpo.verifyResult();
		log.info("Text verified");
		er.test.pass("Text displayed");
	}
	
	@Test(priority = 5)
	public void test5() {
		er.test = er.extent.createTest(" P&G Header top bar Test ", "This is test to validate P&G page ");
		er.test.log(Status.INFO, "Starting Test case");
		log.info("Fifth Test case");
		PandGObject po=new PandGObject(driver);
		
		po.clickOnPandG();
		log.info("Clicked on P&G");
		er.test.pass("Clicked on P&G");
		po.mouseHoverOnOurCompany();
		log.info("mouse hovered on OurCompany");
		er.test.pass("mouse hovered on OurCompany");
		po.clickOnLeadership();
		log.info("Clicked on leadership");
		er.test.pass("Clicked on leadership");
		po.verifyText();
		log.info("Text verified");
		er.test.pass("Text displayed");
	}
	
	@Test(priority = 6)
	public void test6() {
		er.test = er.extent.createTest(" Footer link Test ", "This is test to validate footer section ");
		er.test.log(Status.INFO, "Starting Test case");
		log.info("Sixth Test case");
		FooterObject fo=new FooterObject(driver);
		
		fo.clickOnRemoveStain();
		log.info("Clicked on Remove Stain");
		er.test.pass("Clicked on Remove stain");
		fo.verifyText();
		log.info("Text verified");
		er.test.pass("Text displayed");
	}
	
	@Test(priority = 7)
	public void test7() throws InterruptedException {
		er.test = er.extent.createTest(" Bounce Header top bar Test ", "This is test to validate Bounce page ");
		er.test.log(Status.INFO, "Starting Test case");
		log.info("Seventh Test case");
		BounceObject bo=new BounceObject(driver);
		
		bo.clickOnBounce();
		log.info("Clicked on Bounce");
		er.test.pass("Clicked on Bounce");
		bo.cliclOnBuy();
		log.info("Clicked on Buy now");
		er.test.pass("Clicked on Buy now");
		Thread.sleep(2000);
		bo.compareProductName();
		log.info("Compared text of product before clicking on buy and after clicking on buy ");
		er.test.pass("Compared text of product before clicking on buy and after clicking on buy");
	}
	
	@Test(priority = 8)
	public void test8() {
		er.test = er.extent.createTest(" Downy Header top bar ", "This is test to validate Downy page ");
		er.test.log(Status.INFO, "Starting Test case");
		log.info("Eighth Test case");
        DownyObject dwo=new DownyObject(driver);
        
        dwo.clickonDowny();
        log.info("Clicked on Downy");
		er.test.pass("Clicked on Downy");
        dwo.hoverOnAbout();
        log.info("mouse hovered on About");
		er.test.pass("mouse hovered on About");
        dwo.clickOnIngre();
        log.info("Clicked on Ingridents");
		er.test.pass("Clicked on Ingridents");
        dwo.verifyText();
        log.info("Text verified");
		er.test.pass("Text displayed");
	}
	
	@Test(priority = 9)
	public void test9() {
		er.test = er.extent.createTest(" Spinner Test ", "This is test to validate Guide page ");
		er.test.log(Status.INFO, "Starting Test case");
		log.info("Ninth Test case");
		GuideObject go=new GuideObject(driver);
		
		go.clickOnArrow();
		log.info("Click on Arrow button ");
		er.test.pass("Click on Arrow button ");
		go.clickOnLearnMore();
		log.info("Verified stain and clicked on Learn More");
		er.test.pass("Verified stain and clicked on Learn More");
	}
	
	@Test(priority = 10)
	public void test10() throws InterruptedException {
		er.test = er.extent.createTest(" Our commitment Test ", "This is test to validate sustainability page ");
		er.test.log(Status.INFO, "Starting Test case");
		log.info("Tenth Test case");
		OurCommitmentObject oo=new OurCommitmentObject(driver);
		
		oo.hoverOnOurCommitment();
		log.info("Mouse hovered on our commitment");
		er.test.pass("Mouse hovered on our commitment");
		oo.clickOnSustainability();
		log.info("Click on sustainability ");
		er.test.pass("Click on sustainability ");
		oo.clickOnLearnMore();
		log.info("Click on learn more");
		er.test.pass("Click on learn more ");
	}
	
	
	
	@AfterMethod
	public void tearDownMethod(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
		er.test.fail("Test failed",
				MediaEntityBuilder.createScreenCaptureFromPath(ScreenShotCapture.captureScreenShot(driver)).build());
		log.warn("This Test Failed captured ScreenShot");	
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			er.test.pass("Test Passed",
					MediaEntityBuilder.createScreenCaptureFromPath(ScreenShotCapture.captureScreenShot(driver)).build());
			log.info("Test Passed captured ScreenShot");
		}
		er.extent.flush();
		driver.close();
	}
	
	@AfterSuite
	public void tearDown() {
		baseObject.quitBrowser(driver);
	}
	
}
