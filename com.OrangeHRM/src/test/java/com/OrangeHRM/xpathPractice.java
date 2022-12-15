package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathPractice {
	WebDriver driver;
	
	SoftAssert s= new SoftAssert();	
	
	@Parameters("browserName")
	@Test
	
	public void initialize(String browserName) {
		switch (browserName.toLowerCase()) {
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
			System.out.println("invalid browserName provided,Please check");
			break;
		}
		driver.manage().window().maximize();
		
	}
	
	@Test
	
	public void teardown() {
		driver.close();
	}
	@Test ()
	
	public void LaunchApp() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String acttitle= "https://opensource-demo.orangehrmlive.com/";
		String exptitle =driver.getCurrentUrl();
		s.assertEquals(acttitle, exptitle,"Mismacthed");
		
	}
	@Test
	
	public void Enterlogindetails() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
	}
	@Test
	
	public void verifyLogin() {
		driver.findElement(By.id("welcome"));
		s.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
		System.out.println("Login test Passed");
		
	}
	@Test
	public void verifyMyinfo () {
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		s.assertTrue(driver.findElement(By.id("pdMainContainer")).isDisplayed());
		System.out.println(driver.findElement(By.id("pdMainContainer")).isDisplayed());
		System.out.println("My Info Passed");
		s.assertAll();
		
	}
	@Test
	
	public void Recruitement() {
		driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
		s.assertTrue(driver.findElement(By.id("frmSrchCandidates")).isDisplayed());
	}
	

}
