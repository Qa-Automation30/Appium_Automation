package com.bewakoof.leftMenuNavigation;

import com.bewakoof.commanLibraries.GlobalClass;
import com.bewakoof.utils.CommanFunctionForMobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LeftMenuNavigationAction extends GlobalClass{
	LeftMenuNavigationRepo landingPageRepo;
	public LeftMenuNavigationAction(AndroidDriver<AndroidElement> androidDriver)
	{
		landingPageRepo= new LeftMenuNavigationRepo(androidDriver);
	}
	public void clickOnHamburgerMenu() throws InterruptedException
	{
		Thread.sleep(5000);
		CommanFunctionForMobile.clickEvent(landingPageRepo.getHamburgerMenu());
	}
	public void clickOnLoginButton() throws InterruptedException
	{
		CommanFunctionForMobile.elementIsvisibelToClick(landingPageRepo.getloginButton(), androidDriver);
		//landingPageRepo.getloginButton().click();
	}

}
