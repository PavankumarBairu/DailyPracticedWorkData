package com.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsPractice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alertBox")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		
		driver.findElement(By.id("confirmBox")).click();
		Alert calert = driver.switchTo().alert();
		System.out.println(calert.getText());
		calert.accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		
		driver.findElement(By.id("promptBox")).click();
		Alert palert = driver.switchTo().alert();
		System.out.println(palert.getText());
		palert.sendKeys("Pavan");
		palert.accept();
		System.out.println(driver.findElement(By.id("output")).getText());

		driver.close();
		
		
	}

}
