package com.bewakoof.landingPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bewakoof.commanLibraries.GlobalClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LandingPageRepo extends GlobalClass {
	public LandingPageRepo(AndroidDriver<AndroidElement> androidDriver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
	}
	@FindBy(xpath="//android.widget.TextView[@index='0']")
	private WebElement hamburgerMenu;
	
	public WebElement getHamburgerMenu()
	{
		return hamburgerMenu;
	}
	
}
