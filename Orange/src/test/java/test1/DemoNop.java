package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoNop {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.findElement(By.id("Email")).sendKeys("pvnkumar100@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Test123");
		driver.close();
	}

}
