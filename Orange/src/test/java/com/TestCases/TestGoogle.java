package com.TestCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGoogle {
	public static String ScreenshotSubFolderName;
	static SoftAssert s = new SoftAssert();

	@Test

	public static void googleSearch( ) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYR tutorials",Keys.ENTER);
		String act_title=driver.getTitle();
		String expt_title="HYR tutorials-Google Search";
		System.out.println(driver.getTitle());
		s.assertEquals(act_title,expt_title,"title mismatched");

		if(ScreenshotSubFolderName==null) {
			LocalDateTime mydatetime= LocalDateTime.now();
			DateTimeFormatter dft=DateTimeFormatter.ofPattern("ddMMyyyyhhMMss");
			ScreenshotSubFolderName=mydatetime.format(dft);
			System.out.println("Folder Name:-"+ScreenshotSubFolderName);
		}

		TakesScreenshot ts= (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("./screenshots/"+ScreenshotSubFolderName+"/"+"googleSearch"+".jpeg");
		try {
			FileUtils.copyFile(src, dest);
			System.out.println("screenshot taken");
			driver.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("not possible");
			driver.close();
		}

	}
}
