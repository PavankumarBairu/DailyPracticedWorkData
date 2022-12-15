package com.OrangeHRM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class h {

	public static void highlight(WebDriver driver, WebElement element) {

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('Style',border:2px solid red;background:Yellow');",element);
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		jsExecutor.executeScript("arguments[0].setAttribute('Style','border:2px solid red;background:White');",element);
	}
}


