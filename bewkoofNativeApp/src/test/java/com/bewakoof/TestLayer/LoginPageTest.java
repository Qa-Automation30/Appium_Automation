package com.bewakoof.TestLayer;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.bewakoof.commanLibraries.GlobalClass;
import com.bewakoof.leftMenuNavigation.LeftMenuNavigationAction;
import com.bewakoof.loginPageRepo.LoginPageAction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginPageTest extends GlobalClass {
	LeftMenuNavigationAction navigationAction;
	LoginPageAction loginPageAction;
	
	@Test
	public void verifyLoginPage()
	{
		try {
			AndroidDriver<AndroidElement> androidDriver = getAndroidDriver();
			navigationAction = new LeftMenuNavigationAction(androidDriver);
			navigationAction.clickOnHamburgerMenu();
			navigationAction.clickOnLoginButton();
			loginPageAction = new LoginPageAction(androidDriver);
			boolean b = loginPageAction.IsLoginHeaderDisplayed();
			Assert.assertEquals(loginPageAction.IsLoginHeaderDisplayed(), true);
			String s = loginPageAction.getDiscoverFashionText();
			Assert.assertEquals(loginPageAction.getDiscoverFashionText(), "Discover Fashion!");
			System.out.println(b+" "+s);
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
