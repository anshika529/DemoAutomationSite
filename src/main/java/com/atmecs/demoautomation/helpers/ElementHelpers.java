package com.atmecs.demoautomation.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementHelpers {

	public static void clickElement(WebDriver driver, String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}

	public static void sendkeys(WebDriver driver, String xpath, String text) {
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	}
	
	public static void selectfromdropdown(WebDriver driver, String xpath, String value) {
		Select choose=new Select(driver.findElement(By.xpath(xpath)));
			choose.selectByValue(value);
	}

}
