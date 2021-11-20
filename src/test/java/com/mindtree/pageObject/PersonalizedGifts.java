package com.mindtree.pageObject;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.reusableComponent.WebDriverSupport;
import com.mindtree.uiStore.PersonalizedGiftsUi;
import com.relevantcodes.extentreports.ExtentTest;

public class PersonalizedGifts extends PersonalizedGiftsUi {

	WebDriver driver;
	Logger log;
	ExtentTest test;

	public PersonalizedGifts(WebDriver driver, Logger log, ExtentTest test) throws Exception {
		this.driver = driver;
		this.test = test;
		this.log = log;
	}

	public void personalizedButton() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, personalizedButton, " Home page", "personalized button", log, test);
		Thread.sleep(2000);
	}

	public void clickItem(String item) throws ReusableComponentException, Exception {

		List<WebElement> listRec = driver.findElements(result);
		for (WebElement temp : listRec) {
			if (temp.getText().equalsIgnoreCase(item)) {
				WebDriverSupport.clickByWebElement(driver, temp, "result page", item, log, test);
				break;
			}
		}
		Thread.sleep(3000);
	}

	public void setData(String qunt, String Name) throws ReusableComponentException, Exception {
		driver.findElement(quantity).clear();
		WebDriverSupport.sendKeys(driver, quantity, "cart page", "quantity field", log, test, qunt);
		if (driver.findElement(name).isDisplayed())
			WebDriverSupport.sendKeys(driver, name, "Cart Page", "name Field", log, test, Name);
	}

	public void clickAddToCart() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, cart, "cart page", "cart button", log, test);
		Thread.sleep(3000);
	}

	public void HandelCartPage() throws ReusableComponentException, Exception {
		if (driver.findElement(formCart).isDisplayed()) {
			WebDriverSupport.click(driver, close, "Cart Page", "Close Button", log, test);
		}
		WebDriverSupport.click(driver, getHome, "cart page", "Bigsmall pic", log, test);
		Thread.sleep(5000);
	}

}
