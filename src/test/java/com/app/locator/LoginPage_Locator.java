package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.base.Base;

public class LoginPage_Locator extends Base{
	
	public static WebElement getusername() {
		return driver.findElement(By.id("username"));
		
	}

}
