package screenshots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static String ScreenshotSubFolderName;

	@BeforeSuite
	public static void InitializeBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(500, 1000));

	}

	@AfterSuite
	public static void Teardown() {
		driver.close();
	}

	@AfterMethod
	public static void getScreenshot(ITestResult result) {

		SimpleDateFormat sdft = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		if (result.getStatus() == ITestResult.SUCCESS) {
			CaptureScreenshot(result.getTestContext().getName() + "-" + result.getMethod().getMethodName());
			System.out.println("Screenshot Taken for :-" + result.getTestContext().getName() + "-"
					+ result.getMethod().getMethodName() + "  " +"at "+ sdft.format(new Date()));

		}
	}

	public static void CaptureScreenshot(String Methodname) {
		if (ScreenshotSubFolderName == null) {
			LocalDateTime mydate = LocalDateTime.now();
			DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd-MM-yyyy-HHmmss");
			ScreenshotSubFolderName = mydate.format(dft);
			System.out.println(ScreenshotSubFolderName);
		}

		TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
		File SourceFIle = takeScreenshot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("./Screenshots/" + ScreenshotSubFolderName + "/" + Methodname + ".png");

		try {
			FileUtils.copyFile(SourceFIle, DestFile);
		} catch (IOException e) {
			System.out.println("Exception is : " + e.getMessage());
		}
	}

}
