package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.step.step;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
static WebDriver driver;
public static WebDriver getDriver() {
	WebDriverManager.chromedriver().setup();
	return driver;
	}
public static void loadUrl(String data) {
	driver.get(data);
	}
public static void product(WebElement element,String value) {
	element.sendKeys(value);

}
public static void search(WebElement element) {
	element.click();

}
public static void printProduct(WebElement element) {
	element.click();

}
public static void printPrice(WebElement element) {
	element.click();
}
}