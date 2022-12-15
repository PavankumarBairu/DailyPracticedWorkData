package com.OrangeHRM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hLight {
	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsexExecutor = (JavascriptExecutor) driver;
		jsexExecutor.executeScript("arguments[0].setAttribute('style','border:2px solid red;background:Yellow')",element);
		try {
			Thread.sleep(1000);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		jsexExecutor.executeScript("arguments[0].setAttribute('style','border:2px solid red')",element);
	}
}
