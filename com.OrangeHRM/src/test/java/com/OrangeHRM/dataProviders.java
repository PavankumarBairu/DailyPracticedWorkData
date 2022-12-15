package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataProviders {


	@Test(dataProvider ="Logindata")
	
	public void initializeBrowser(String userName,String password) {
		
		SoftAssert s = new SoftAssert();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	@DataProvider
	public Object[][] Logindata() {
		Object [][] data = new Object [4][2];
		data[0][0]="admin";
		data[0][1]="xyz12";
		
		data[1][0]="Admin";
		data[1][1]="admin123";
		
		data[2][0]="Admin";
		data[2][1]="test023";
		
		data[3][0]="Admin";
		data[3][1]="admin123";
		
		return data;
		
	}
}
