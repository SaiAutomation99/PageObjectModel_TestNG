package com.crm.qa.pages;

import java.util.Base64;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.BaseClass;
import com.crm.qa.util.Utilities;

public class HomePage extends BaseClass{
	
	
	@FindBy(xpath = "(//span[text()='Calendar'])[1]")  WebElement calendar;
	
	
	public HomePage() {
		
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void calendar() {
		
		Utilities ut1=new Utilities();
		WebElement element=ut1.moveToElementsForElement(calendar);
		element.click();
		boolean b =false;
		if(!b) {
			System.out.println("hello");
			
		}
		
		
		
		
		
		
	}
	

}
