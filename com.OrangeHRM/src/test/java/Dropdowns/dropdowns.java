package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdowns {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		driver.findElement(By.id("menu_leave_assignLeave")).click();
		driver.findElement(By.id("assignleave_txtEmployee_empName")).sendKeys("PavanBairu");

		WebElement Leavetypes = driver.findElement(By.id("assignleave_txtLeaveType"));

		Select leavetypeslist = new Select(Leavetypes); 

		List <WebElement> leaveoptions = leavetypeslist.getOptions();

		for (WebElement list : leaveoptions) {

			System.out.println(list.getText());

		}
		leavetypeslist.selectByIndex(3);


	}

}