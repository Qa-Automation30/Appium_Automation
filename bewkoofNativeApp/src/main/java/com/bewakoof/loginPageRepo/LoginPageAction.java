package com.bewakoof.loginPageRepo;

import com.bewakoof.commanLibraries.GlobalClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginPageAction extends GlobalClass {
	LoginPageRepo loginpagerepo;
	public LoginPageAction(AndroidDriver<AndroidElement> androidDriver)
	{
		loginpagerepo = new LoginPageRepo(androidDriver);
	}
	public boolean IsLoginHeaderDisplayed()
	{
		return loginpagerepo.getLoginHeader().isDisplayed();
	}
	public String getDiscoverFashionText()
	{
		return loginpagerepo.getDiscoverFashion().getText();
	}
	public void enterEmail(String email)
	{
		loginpagerepo.getEnterEmailOrMobile().sendKeys(email);
	}
	public void enterPhone(String phone)
	{
		loginpagerepo.getEnterEmailOrMobile().sendKeys(phone);
	}
	public void continueButton()
	{
		loginpagerepo.getContinueButton().click();
	}
	public String toastMessage()
	{
		return loginpagerepo.getToastMessage();
	}
}
