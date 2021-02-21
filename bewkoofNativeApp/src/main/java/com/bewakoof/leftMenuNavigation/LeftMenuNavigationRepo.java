package com.bewakoof.leftMenuNavigation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bewakoof.commanLibraries.GlobalClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LeftMenuNavigationRepo extends GlobalClass {
	public LeftMenuNavigationRepo(AndroidDriver<AndroidElement> androidDriver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
	}
	@FindBy(xpath="//android.widget.TextView[@index='0']")
	private WebElement hamburgerMenu;
	@FindBy(xpath="//android.view.ViewGroup[@index='1']/android.widget.TextView[@text='Login']")
	private WebElement loginButton;
	@FindBy(xpath="//android.widget.TextView[@text='Sign Up']")
	private WebElement signUpButton;
	public WebElement getHamburgerMenu()
	{
		return hamburgerMenu;
	}
	public WebElement getloginButton()
	{
		return loginButton;
	}
	public WebElement getsignUpButton()
	{
		return signUpButton;
	}
	
}
