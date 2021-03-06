package com.bewakoof.TestLayer;

import org.openqa.selenium.By;
import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.bewakoof.commanLibraries.GlobalClass;
import com.bewakoof.leftMenuNavigation.LeftMenuNavigationAction;
import com.bewakoof.loginPage.LoginPageAction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginPageTest extends GlobalClass {
	LeftMenuNavigationAction navigationAction;
	LoginPageAction loginPageAction;
	//Test Automation.
	@Test(priority=1,enabled=false)
	public void verifyLoginPage_Elements()
	{
		try {
			AndroidDriver<AndroidElement> androidDriver = getAndroidDriver();
			navigationAction = new LeftMenuNavigationAction(androidDriver);
			navigationAction.clickOnHamburgerMenu();
			navigationAction.clickOnLoginButton();
			loginPageAction = new LoginPageAction(androidDriver);
			Assert.assertEquals(loginPageAction.IsLoginHeaderDisplayed(), true);
			Assert.assertEquals(loginPageAction.getDiscoverFashionText(), "Discover Fashion!");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	@Test(priority=2)
	@Description("Verify functionlaity when user enters wrong email")
	public void verifyInvalidLoginFunctionalityForEmail()
	{
		try {
			AndroidDriver<AndroidElement> androidDriver = getAndroidDriver();
			navigationAction = new LeftMenuNavigationAction(androidDriver);
			navigationAction.clickOnHamburgerMenu();
			navigationAction.clickOnLoginButton();
			loginPageAction = new LoginPageAction(androidDriver);
			loginPageAction.enterPhone(prop.getProperty("wrongEmail"));
			loginPageAction.continueButton();
			//String toastMessagee=androidDriver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
			String s = loginPageAction.toastMessage();
			//System.out.println(toastMessagee);
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
