package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.BaseClass;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends BaseClass{




	public LoginPageTest() {

		super();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		
		BaseClass.intialize();
	}

	@Test
	public void loginTest() {

		//BaseClass.intialize();
		LoginPage h=new LoginPage();
		System.out.println(h.validateTitle());
		h.loginDetails();
		h.clinkOnLoginBun();
	}
	
	
	@AfterMethod
	public void browserclose() {
		
		driver.quit();
	}



}
