package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCase extends LibGlobal {
	public TestCase() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="twotabsearchtextbox")
	private WebElement txtProduct;
	@FindBy(className="nav-input")
	WebElement btnSearch;
	@FindBy(xpath="//*[text()='New Apple iPhone 11 (64GB) - Black']")
	WebElement prodSearch;
	@FindBy(xpath="//*[text()='51,999']")
	WebElement printPrice;
	public WebElement getTxtProduct() {
		return txtProduct;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	public WebElement getProdSearch() {
		return prodSearch;
	}
	public WebElement getPrintPrice() {
		return printPrice;
	}
	
	
	
	
}