package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.crm.qa.base.BaseClass;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.Utilities;

public class HomePageTest extends BaseClass {
	
	
	LoginPage h=null;
	HomePage page=null;

	public HomePageTest() {

		super();
	}
	
	
	
	  @BeforeSuite 
	  public void beforeSuite() {
		  BaseClass.intialize();
		  h=new LoginPage();
	  
	  page=new HomePage(); 
	  }
	 
	@Test
	public void loginTest() {

		System.out.println(h.validateTitle());
		h.loginDetails();
		h.clinkOnLoginBun();
	
		page.calendar();
		
		
	}

	
	
	
	
}
