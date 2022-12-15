package com.OrangeHRM;


import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AnnotationsPractice {
	WebDriver driver;

	SoftAssert s = new SoftAssert();
	
	@BeforeSuite
	@Parameters("browsername")
	@Test

	public void initializeBrowser(String browsername) {

		switch (browsername.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			break;
		}

		driver.manage().window().setSize(new Dimension(500, 1000));
		
	}
	@AfterSuite
	@Test

	public void Teardown() {
		driver.close();
	}

	@Test

	public void LaunchBrowser( ) {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}

	@Test

	public void EnterLoginCredentials() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	
	@Test

	public void verifyLogin() throws InterruptedException {
		Thread.sleep(5000);
		s.assertTrue(driver.findElement(By.xpath("//a[@id='welcome']")).isDisplayed());
		
		s.assertAll();

	}

	@Ignore
	@Test 

	public void verifyMyInfo() {
		
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();

		driver.findElement(By.id("employee_details")).click();
		WebElement Info = driver.findElement(By.id("employee-details"));
		s.assertTrue(Info.isDisplayed());

		s.assertAll();

	}

}