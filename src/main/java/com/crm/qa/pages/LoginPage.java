package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.BaseClass;

public class LoginPage extends BaseClass{
	
	
	@FindBy(xpath = "//input[@name='email']")  WebElement email;
	
	@FindBy(xpath = "//input[@name='password']")  WebElement password;
	
	@FindBy(xpath="//div[text()='Login']") WebElement loginbutton;
	
	
	public LoginPage() {
		
		
		PageFactory.initElements(driver, this);
	}
	
	
	public String  validateTitle() {
		
		return driver.getTitle();
	}
	
	public void loginDetails() {
		
		email.sendKeys(pro.getProperty("username"));
		password.sendKeys(pro.getProperty("password"));
		
	}
	
	public void clinkOnLoginBun() {
		
		if(loginbutton.isEnabled() && loginbutton.isDisplayed()) {
			
			loginbutton.click();
		}
		
	}

}
