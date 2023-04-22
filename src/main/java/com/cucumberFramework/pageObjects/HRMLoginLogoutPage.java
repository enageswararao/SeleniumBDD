package com.cucumberFramework.pageObjects;

import com.cucumberFramework.helper.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HRMLoginLogoutPage {

	private WebDriver driver;
	WaitHelper waitHelper;

	@FindBy(name="username")
	public WebElement userName;

	@FindBy(name="password")
	public WebElement password;

	@FindBy(xpath="//button[@type='submit']")
	WebElement loginButton;

	@FindBy(xpath="//p[text()='Time at Work1']")
	public WebElement brandLogo;

	public HRMLoginLogoutPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//waitHelper.WaitForElement(userName, 60);
	}
	
	public void enterUserName(String userName){
		this.userName.sendKeys(userName);
	}
	
	public void enterPassword(String password){
		this.password.sendKeys(password);
	}
	
	public void clickLoginButton(){
		loginButton.click();
	}



}
