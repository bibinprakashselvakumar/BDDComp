package com.mindtree.uiStore;

import org.openqa.selenium.By;

public class OfficialMerchandiseUi {

	public static By OfficialMerchandiseButton = By.xpath("//a[@data-dropdown-rel='official-merchandise']");
	public static By dropDown = By.xpath("(//ul[@class='site-nav__dropdown text-left'])[2] //a");
	public static By result = By.cssSelector("div.grid-product__title");
	public static By quantity = By.xpath("//input[@id='quantity']");
	public static By cart = By.xpath("//button[@name='add']");
	public static By formCart = By.cssSelector("form.drawer__contents.cart.ajaxcart");
	public static By close = By.cssSelector("button.drawer__close-button.js-drawer-close");
	public static By getHome = By.cssSelector("img.small--hide");

}
