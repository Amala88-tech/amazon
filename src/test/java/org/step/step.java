package org.step;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.base.Data;
import org.base.LibGlobal;
import org.base.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class step extends TestCase {
	WebDriver driver;
	
	@Given("User is on Amazon application.")
	public void user_is_on_Amazon_application() {
		getDriver();
		loadUrl("https://www.amazon.in/");		
		
	}

	@Then("User should search the product.")
	public void user_should_search_the_product() {
		step ste=new step();
		product(ste.getTxtProduct(),"Iphone");
	}

	@Then("click login button.")
	public void click_login_button() {
		step ste1=new step();
	   search(ste1.getBtnSearch());
	   	}

	@Then("User should print the product name and price.")
public void user_should_print_the_product_name_and_price() {
		List<WebElement> allProducts=driver.findElements(By.className("a-size-medium a-color-base a-text-normal"));
  for (WebElement element : allProducts) {
	String prodList=element.getText();
	System.out.println(prodList);
}
	}
	
	
	}
