package com.inetBanking.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaptureSS {
	@Test
	public static void ScreenshotMethod() throws Exception {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/");
		
		SimpleDateFormat dft = new SimpleDateFormat("YYYY-MM-DD HH.mm.ss");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/"+dft.format(new Date())+".jpg");
		try {
		FileUtils.copyFile(src, dest);
		System.out.println("SS taken");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		driver.close();
		
		

		
		
		
		
	}

}
