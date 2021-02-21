package com.bewakoof.TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.bewakoof.commanLibraries.GlobalClass;
import com.bewakoof.landingPage.LandingPageAction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LandingPageTest extends GlobalClass {
	LandingPageAction landingPageAction;
	
	@Test
	public void verifyLandingPage()
	{
		try {
			AndroidDriver<AndroidElement> androidDriver = getAndroidDriver();
			landingPageAction = new LandingPageAction(androidDriver);
			landingPageAction.clickOnHamburgerMenu();
			landingPageAction.clickOnLoginButton();	
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	@AfterTest
	public void tearDown()
	{
		androidDriver.quit();
	}

}
