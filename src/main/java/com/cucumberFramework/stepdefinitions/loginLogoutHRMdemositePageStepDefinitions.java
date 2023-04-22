package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.HRMLoginLogoutPage;
import com.cucumberFramework.testBase.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class loginLogoutHRMdemositePageStepDefinitions extends TestBase {

	HRMLoginLogoutPage  HRMloginPage = new HRMLoginLogoutPage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	@Given("^I am on the HRM Login page URL \"([^\"]*)\"$")
	public void i_am_on_the_Login_page_URL(String arg1) throws Throwable {
		driver.get(arg1);
		waitHelper = new WaitHelper(driver);
		waitHelper.WaitForElement(HRMloginPage.userName, 10);
	}


	@Then("^I should see HRM Sign In Page$")
	public void i_should_see_Sign_In_Page() throws Throwable {
		HRMloginPage.userName.isDisplayed();
	}

	@When("^I enter HRM username as \"([^\"]*)\"$")
	public void i_enter_username_as(String arg1) throws Throwable {
		HRMloginPage.enterUserName(arg1);
	}



	@When("^I enter HRM password as \"([^\"]*)\"$")
	public void i_enter_password_as(String arg1) throws Throwable {
		HRMloginPage.enterPassword(arg1);
	}

	@When("^click on HRM login button$")
	public void click_on_login_button() throws Throwable {
		HRMloginPage.clickLoginButton();
	}
	@When("^I am logged in HRM")
	public void i_am_already_logged_in() throws Throwable {
		waitHelper.WaitForElement(HRMloginPage.brandLogo, 10);
		HRMloginPage.brandLogo.isDisplayed();
	}


	
}