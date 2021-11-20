package com.mindtree.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.PageObjectException;
import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.reusableComponent.WebDriverSupport;
import com.mindtree.uiStore.CorporateGiftsUi;
import com.relevantcodes.extentreports.ExtentTest;

public class CorporateGifts extends CorporateGiftsUi {

	WebDriver driver;
	Logger log;
	ExtentTest test;

	public CorporateGifts(WebDriver driver, Logger log, ExtentTest test) throws Exception {
		this.driver = driver;
		this.test = test;
		this.log = log;
	}

	public void clickCorporate() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, corporateButton, "Home Page", "Corporate Button", log, test);
		Thread.sleep(2000);
	}

	public void fillDetails(String name, String Gmail, String phno) throws ReusableComponentException, Exception {
		try {

			Thread.sleep(2000);
			WebDriverSupport.sendKeys(driver, fname, "Corporate gift form", name, log, test, name);
			WebDriverSupport.sendKeys(driver, email, "Corporate gift form", Gmail, log, test, Gmail);
			WebDriverSupport.sendKeys(driver, phn, "Corporate gift form", phno, log, test, phno);
		} catch (Exception e) {
			throw new PageObjectException(e.getMessage());
		}
	}

	public void submitForm() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, submit, "Corporate Page", "Submit Button", log, test);
		Thread.sleep(2000);
	}

}
