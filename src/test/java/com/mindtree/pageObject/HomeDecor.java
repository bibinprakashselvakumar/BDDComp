package com.mindtree.pageObject;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.reusableComponent.WebDriverSupport;
import com.mindtree.uiStore.HomeDecorUi;
import com.relevantcodes.extentreports.ExtentTest;

public class HomeDecor extends HomeDecorUi {
	WebDriver driver;
	Logger log;
	ExtentTest test;

	public HomeDecor(WebDriver driver, Logger log, ExtentTest test) throws Exception {
		this.driver = driver;
		this.test = test;
		this.log = log;
	}

	public void homeDecorClick() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, HomeDecorButton, " Home page", "secretsanta button", log, test);
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

	public void setQunt(String qunt) throws ReusableComponentException, Exception {
		driver.findElement(quantity).clear();
		WebDriverSupport.sendKeys(driver, quantity, "cart page", "quantity field", log, test, qunt);
	}

	public void clickAddToCart() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, cart, "cart page", "cart button", log, test);
		Thread.sleep(3000);
	}

	public void HandelCartPage() throws ReusableComponentException, Exception {
		if (driver.findElement(formCart).isDisplayed()) {
			WebDriverSupport.click(driver, close, "Cart slider Page", "Close Button", log, test);
		}
		WebDriverSupport.click(driver, getHome, "cart page", "Bigsmall pic", log, test);
		Thread.sleep(5000);
	}
}
