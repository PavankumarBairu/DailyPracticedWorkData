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

public class assertionsPractice {
	WebDriver driver;

	SoftAssert s = new SoftAssert();

	@BeforeSuite
	@Parameters("browsername")
	@Test

	public void LaunchBrowser(String browsername) {

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
		
		driver.manage().window().setSize(new Dimension(500,1000));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


	}

	@Test

	public void EnterLoginCredentials() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		WebElement login = driver.findElement(By.id("btnLogin"));
		hLight.highlight(driver, login);
		login.click();


	}
	@Test

	public void verifyLogin() {
		WebElement verifylogin= driver.findElement(By.id("welcome"));
		s.assertTrue(verifylogin.isDisplayed());
		System.out.println(verifylogin.isDisplayed());
		System.out.println(verifylogin.getText());
		
	}
	@Ignore
	@Test (enabled=true)

	public void verifyMyInfo() {

		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		WebElement Info = driver.findElement(By.id("employee-details"));
		s.assertTrue(Info.isDisplayed());

		s.assertAll();

	}
	@AfterSuite
	@Test
	public void teardown() {
		driver.close();
	}

}