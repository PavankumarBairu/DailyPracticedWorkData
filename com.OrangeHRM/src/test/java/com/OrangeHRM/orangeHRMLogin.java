package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangeHRMLogin {
	WebDriver driver;

	SoftAssert s = new SoftAssert();

	@Test(priority=1)

	public void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}
	@Test(priority=2)

	public void EnterLoginCredentials() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		WebElement login = driver.findElement(By.id("btnLogin"));
		hLight.highlight(driver, login);
		login.click();
	}



	@Test(priority=4)

	public void verifyLogin() {
		WebElement verifylogin= driver.findElement(By.id("welcome"));
		System.out.println(verifylogin.isDisplayed());
		System.out.println(verifylogin.getText());
	}

	@Test(priority=3)

	public void verifyMyInfo() {

		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		WebElement Info = driver.findElement(By.id("employee-details"));
		System.out.println(Info.isDisplayed());
	}

	@Test(priority=5)

	public void teardown() {

		driver.close();
	}

}
