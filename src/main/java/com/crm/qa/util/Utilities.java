package com.crm.qa.util;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.BaseClass;

public class Utilities {


	WebDriverWait wait=null;
	//Actions action=null;
	public static WebElement moveToElementsForElement(WebElement element) {

		BaseClass base=new BaseClass();
		WebDriverWait wait=new WebDriverWait(base.driver,Duration.ofSeconds(30));

		WebElement element1= wait.until(ExpectedConditions.visibilityOf(element));

		Actions   action=new Actions(base.driver);
		action.moveToElement(element1).build().perform();

		return element1;




	}




}
