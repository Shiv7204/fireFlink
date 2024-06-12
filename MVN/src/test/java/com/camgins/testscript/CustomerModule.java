package com.camgins.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
	@Test
	public void createCustomer()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Reporter.log("createCustomer",true);
	}

}
