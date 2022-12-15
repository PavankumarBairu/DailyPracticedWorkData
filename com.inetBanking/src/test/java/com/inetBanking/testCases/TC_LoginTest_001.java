package com.inetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObject.LoginPage;
import com.inetBanking.utilities.CaptureSS;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	
	public void LoginTest() throws Exception {
		driver.get(baseURl);
		Thread.sleep(2000);
		LoginPage lp = new LoginPage(driver);
		
		lp.setUsername("mngr435793");
		lp.setPassword("UnUbUhY");
		lp.clickSubmit();
		
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("Guru999 Bank Manager HomePage")) {
			Assert.assertTrue(true);
		}
		else {
			CaptureSS.ScreenshotMethod();
			Assert.assertTrue(false);
		}
		
	}
}
