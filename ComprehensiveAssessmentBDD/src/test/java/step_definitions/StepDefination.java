package step_definitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

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

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {

	public WebDriver driver;
	public ExcelDataProvider ex;
	public ConfigureData config;
	public BaseClass baseObject;
	public ExtentReport er;
	public static Logger log = LogManager.getLogger(StepDefination.class);

	@Before
	public void getProperty() {
		ex = new ExcelDataProvider();
		config = new ConfigureData();
		baseObject = new BaseClass();
		er = new ExtentReport();
		er.extentReport();
		log.info("Initilizing all the methods");
	}

	@Given("user is on home page")
	public void user_is_on_home_page() {
		driver = baseObject.initializeDriver(config.getUrl(), config.getBrowser());
		log.info("Setting Up Browser");
	}

	HoverObject ho;

	@Given("mouse hover on shop products")
	public void mouse_hover_on_shop_products() {
		er.test = er.extent.createTest(" ", "This is test to  page ");
		er.test.log(Status.INFO, "Starting Test case");
		log.info("First Test case");
		ho = new HoverObject(driver);
		ho.mouseHover();
		log.info("Mouse hovered on shop products");
		er.test.pass("Mouse hovered on shop products");
	}

	@When("user clicks on pacs")
	public void user_clicks_on_pacs() throws InterruptedException {
		ho = new HoverObject(driver);
		ho.clickOnPacs();
		log.info("Clicked on Pacs");
		er.test.pass("Clicked on pacs");
	}

	@Then("user verify the text")
	public void user_verify_the_text() {
		ho = new HoverObject(driver);
		ho.TextVerify();
		log.info("Text verified");
		er.test.pass("Text displayed");
	}
	RegisterObjet ro;
	@Given("user clicks on register button")
	public void user_clicks_on_register_button() {
		er.test = er.extent.createTest(" Signup funcationality Test ", "This is test to validate signup page ");
		er.test.log(Status.INFO, "Starting Test case");
		log.info("Second Test case");
	    ro=new RegisterObjet(driver);
		ro.clickOnRegister();
		log.info("Clicked on Register button");
		er.test.pass("Clicked on Register button");
	}

	@Given("user clicks on signup button")
	public void user_clicks_on_signup_button() {
		ro=new RegisterObjet(driver);
		ro.clickOnSignup();
		log.info("Clicked on Signup button");
		er.test.pass("Clicked on Signup button");
	}

	@When("user enters first name {string}")
	public void user_enters_first_name(String string) {
		ro=new RegisterObjet(driver);
		ro.enterNmae(ex.getStringData(0, 0, 0));
		log.info("Entered first name");
		er.test.pass("Entered first name");
	}

	@When("user enters email {string}")
	public void user_enters_email(String string) {
		ro=new RegisterObjet(driver);
		ro.enterEmail(ex.getStringData(0, 1, 0));
		log.info("Entered Email address");
		er.test.pass("Entered Email address");
	}

	@When("user enters password {string}")
	public void user_enters_password(String string) {
		ro=new RegisterObjet(driver);
		ro.enterPassword(ex.getStringData(0, 2, 0));
		log.info("Entered password");
		er.test.pass("Entered password");
	}

	@When("user clicks on create account button")
	public void user_clicks_on_create_account_button() {
		ro=new RegisterObjet(driver);
		ro.createAccount();
		log.info("Clicked on Create Account button");
		er.test.pass("Clicked on Create Account button");
	}
	
	BounceObject bo;
	@When("user clicks on bounce")
	public void user_clicks_on_bounce() {
		er.test = er.extent.createTest(" Bounce Header top bar Test ", "This is test to validate Bounce page ");
		er.test.log(Status.INFO, "Starting Test case");
		log.info("Seventh Test case");
		bo=new BounceObject(driver);
		
		bo.clickOnBounce();
		log.info("Clicked on Bounce");
		er.test.pass("Clicked on Bounce");
	}

	@When("user clicks on bounce item buy now and compare the text before and after clicking buy now")
	public void user_clicks_on_bounce_item_buy_now_and_compare_the_text_before_and_after_clicking_buy_now() throws InterruptedException {
		bo=new BounceObject(driver);
		bo.cliclOnBuy();
		log.info("Clicked on Buy now");
		er.test.pass("Clicked on Buy now");
		Thread.sleep(2000);
		bo.compareProductName();
		log.info("Compared text of product before clicking on buy and after clicking on buy ");
		er.test.pass("Compared text of product before clicking on buy and after clicking on buy");
	}
	
	 DownyObject dwo;
	@When("user clicks on downy")
	public void user_clicks_on_downy() {
		er.test = er.extent.createTest(" Downy Header top bar ", "This is test to validate Downy page ");
		er.test.log(Status.INFO, "Starting Test case");
		log.info("Eighth Test case");
        dwo=new DownyObject(driver);
        
        dwo.clickonDowny();
        log.info("Clicked on Downy");
		er.test.pass("Clicked on Downy");
	}

	@When("user mouse hover on about")
	public void user_mouse_hover_on_about() {
		dwo=new DownyObject(driver);
		dwo.hoverOnAbout();
        log.info("mouse hovered on About");
		er.test.pass("mouse hovered on About");
	}

	@When("user clicks on ingridents")
	public void user_clicks_on_ingridents() {
		dwo=new DownyObject(driver);
		dwo.clickOnIngre();
        log.info("Clicked on Ingridents");
		er.test.pass("Clicked on Ingridents");
	}

	@Then("user verify text in ingridents page")
	public void user_verify_text_in_ingridents_page() {
		dwo=new DownyObject(driver);
		 dwo.verifyText();
	        log.info("Text verified");
			er.test.pass("Text displayed");
	}

	FooterObject fo;
	@When("user clicks on remove stain")
	public void user_clicks_on_remove_stain() {
		er.test = er.extent.createTest(" Footer link Test ", "This is test to validate footer section ");
		er.test.log(Status.INFO, "Starting Test case");
		log.info("Sixth Test case");
		fo=new FooterObject(driver);
		
		fo.clickOnRemoveStain();
		log.info("Clicked on Remove Stain");
		er.test.pass("Clicked on Remove stain");
	}

	@Then("user verify text in How to remove stain page")
	public void user_verify_text_in_how_to_remove_stain_page() {
		fo=new FooterObject(driver);
		fo.verifyText();
		log.info("Text verified");
		er.test.pass("Text displayed");
	}
	
	GuideObject go;
	@When("user clicks on down arrow button")
	public void user_clicks_on_down_arrow_button() {
		er.test = er.extent.createTest(" Spinner Test ", "This is test to validate Guide page ");
		er.test.log(Status.INFO, "Starting Test case");
		log.info("Ninth Test case");
		go=new GuideObject(driver);
		
		go.clickOnArrow();
		log.info("Click on Arrow button ");
		er.test.pass("Click on Arrow button ");
	}

	@Then("user Verified stain and clicks on Learn More")
	public void user_verified_stain_and_clicks_on_learn_more() {
		go=new GuideObject(driver);
		go.clickOnLearnMore();
		log.info("Verified stain and clicked on Learn More");
		er.test.pass("Verified stain and clicked on Learn More");
	}
	
	OurCommitmentObject oo;
	@Given("mouse hover on our commitment")
	public void mouse_hover_on_our_commitment() {
		er.test = er.extent.createTest(" Our commitment Test ", "This is test to validate sustainability page ");
		er.test.log(Status.INFO, "Starting Test case");
		log.info("Tenth Test case");
		oo=new OurCommitmentObject(driver);
		
		oo.hoverOnOurCommitment();
		log.info("Mouse hovered on our commitment");
		er.test.pass("Mouse hovered on our commitment");
	}

	@When("user clicks on sustainablity")
	public void user_clicks_on_sustainablity() {
		oo=new OurCommitmentObject(driver);
		oo.clickOnSustainability();
		log.info("Click on sustainability ");
		er.test.pass("Click on sustainability ");
	}

	@When("user verify the text in sustainability page")
	public void user_verify_the_text_in_sustainability_page() {
		oo=new OurCommitmentObject(driver);
		oo.clickOnLearnMore();
		log.info("Click on learn more");
		er.test.pass("Click on learn more ");
	}
	
	PandGObject po;
	@When("user clicks on PandG")
	public void user_clicks_on_pand_g() {
		er.test = er.extent.createTest(" P&G Header top bar Test ", "This is test to validate P&G page ");
		er.test.log(Status.INFO, "Starting Test case");
		log.info("Fifth Test case");
		po=new PandGObject(driver);
		
		po.clickOnPandG();
		log.info("Clicked on P&G");
		er.test.pass("Clicked on P&G");
	}
	@When("user mouse hover on our commitment")
	public void user_mouse_hover_on_our_commitment() {
		po=new PandGObject(driver);
		po.mouseHoverOnOurCompany();
		log.info("mouse hovered on OurCompany");
		er.test.pass("mouse hovered on OurCompany");
	}
	@When("user clicks on leadership")
	public void user_clicks_on_leadership() {
		po=new PandGObject(driver);
		po.clickOnLeadership();
		log.info("Clicked on leadership");
		er.test.pass("Clicked on leadership");
	}
	@Then("user verify text in leadership page")
	public void user_verify_text_in_leadership_page() {
		po=new PandGObject(driver);
		po.verifyText();
		log.info("Text verified");
		er.test.pass("Text displayed");
	}
	
	HomepageSearchObject hpo;
	@When("user clicks on Search box")
	public void user_clicks_on_search_box() {
		er.test = er.extent.createTest(" Search funcationality Test ", "This is test to validate search operation ");
		er.test.log(Status.INFO, "Starting Test case");
		log.info("Fourth Test case");
		hpo=new HomepageSearchObject(driver);
		
		hpo.clickOnSearchBox();
		log.info("Clicked on Search box");
		er.test.pass("Clicked on Search box");
	}

	@When("user enter text in search box")
	public void user_enter_text_in_search_box() {
		hpo=new HomepageSearchObject(driver);
		hpo.enterText(ex.getStringData(0, 3, 0));
		log.info("Entered text in Search box");
		er.test.pass("Entered text in Search box");
	}

	@When("user pressed enter key")
	public void user_pressed_enter_key() {
		hpo=new HomepageSearchObject(driver);
		hpo.pressEnter();
		log.info("Pressed Enter");
		er.test.pass("Pressed Enter");
	}

	@Then("user verify text in results page")
	public void user_verify_text_in_results_page() {
		hpo=new HomepageSearchObject(driver);
		hpo.verifyResult();
		log.info("Text verified");
		er.test.pass("Text displayed");
	}
	
	TideSaftyobject to;
	@When("user clicks on Tide Safety Comes..")
	public void user_clicks_on_tide_safety_comes() {
		er.test = er.extent.createTest(" Tide safty message Test ", "This is test to validate Tide safty page ");
		er.test.log(Status.INFO, "Starting Test case");
		log.info("Third Test case");
		to=new TideSaftyobject(driver);
		to.clickOnSafty();
		log.info("Clicked on At Tide Safety Comes First, and It Never Stops");
		er.test.pass("Clicked on At Tide Safety Comes First, and It Never Stops");
	}

	@Then("user verify text in Tide safty page")
	public void user_verify_text_in_tide_safty_page() {
		to=new TideSaftyobject(driver);
		to.verifyText();
		log.info("Text verified");
		er.test.pass("Text displayed");
	}

	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {

		if (scenario.isFailed()) {
			er.test.fail("Test failed", MediaEntityBuilder
					.createScreenCaptureFromPath(ScreenShotCapture.captureScreenShot(driver)).build());
			log.warn("This Test Failed captured ScreenShot");
		} else {
			er.test.pass("Test Passed", MediaEntityBuilder
					.createScreenCaptureFromPath(ScreenShotCapture.captureScreenShot(driver)).build());
			log.info("Test Passed captured ScreenShot");
		}
		er.extent.flush();
		driver.close();

	}
}
