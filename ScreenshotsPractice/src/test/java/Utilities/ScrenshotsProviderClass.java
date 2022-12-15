package Utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScrenshotsProviderClass {
	
	public static String ScreenshotSubFolderName;
	
	public static void CaptureScreenshot(String Methodname) {
		if (ScreenshotSubFolderName == null) {
			LocalDateTime mydate = LocalDateTime.now();
			DateTimeFormatter dft = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
			ScreenshotSubFolderName = mydate.format(dft);
			System.out.println(ScreenshotSubFolderName);
		}

		
		TakesScreenshot takeScreenshot = (TakesScreenshot)driver;
		File SourceFIle = takeScreenshot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("./Screenshots/" + ScreenshotSubFolderName + "/" + Methodname+".jpg");

		try {
			FileUtils.copyFile(SourceFIle, DestFile);
		} catch (IOException e) {
			System.out.println("Exception is : " + e.getMessage());
		}
	}
}
