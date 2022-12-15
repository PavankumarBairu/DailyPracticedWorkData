package com.OrangeHRM;


import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parameters {
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

		driver.manage().window().maximize();

	}
	@AfterSuite
	@Test

	public void Teardown() {
		driver.close();
	}

	@Test

	public void LaunchBrowser( ) {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String exptitle="https://opensource-demo.orangehrmlive.com/";
		String acttitle= driver.getCurrentUrl();
		assertEquals(acttitle, exptitle,"URL is Mismatched");
	}

	@Test (dataProvider = "logindata")

	public void EnterLoginCredentials(String UserName, String Password) {
		driver.findElement(By.id("txtUsername")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		driver.findElement(By.id("btnLogin")).click();

	}
	@Test

	public void verifyLogin() throws InterruptedException {
		Thread.sleep(3000);
		s.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());


	}

	@Test 

	public void verifyMyInfo() {

		driver.findElement(By.id("menu_pim_viewMyDetails")).click();

		s.assertTrue(driver.findElement(By.xpath("//div[@id='employee-details']")).isDisplayed());

		s.assertAll();

	}
	@DataProvider
	public Object logindata() {
		Object [][] data = new Object[3][2];

		data[0][0]= "admindfhf";
		data[0][1]= "admin123";

		data[1][0]= "Adminnggh";
		data[1][1]= "Admin123";

		data[2][0]= "Admin";
		data[2][1]= "admin123";

		return data;

	}

}