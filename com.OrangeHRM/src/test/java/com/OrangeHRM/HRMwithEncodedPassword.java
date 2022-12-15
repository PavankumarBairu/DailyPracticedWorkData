package com.OrangeHRM;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.DOMConfiguration;
import org.apache.logging.log4j.LogManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMwithEncodedPassword {
	
	
	
	
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys(decode("YWRtaW4xMjM="));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
	}
	
	public static String decode (String password) {
		String str ="admin123";
		
		//byte[] encodedString= Base64.encodeBase64(str.getBytes());
		//System.out.println("Encoded string: "+ new String(encodedString));
		
		//byte[] decodedString = Base64.decodeBase64(encodedString);
		//System.out.println("Decoded String: "+ new String(decodedString));
		
		byte[] decodedString = Base64.decodeBase64(password);
		//System.out.println("Decoded String: "+ new String(decodedString));
		
		return (new String(decodedString));
	}

}
