package com.bewakoof.commanLibraries;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class GlobalClass extends AppiumServer {
	public static AndroidDriver<AndroidElement> androidDriver;
	DesiredCapabilities capability=null;
	
	public DesiredCapabilities setCapabitilty()
	{
		capability = new DesiredCapabilities();
		capability.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Driver");
		capability.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capability.setCapability("appPackage", "com.bewakoof.bewakoof");
		capability.setCapability("appActivity", "com.bewakoof.bewakoof.MainActivity");
		capability.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
		return capability;
	}
	public AndroidDriver<AndroidElement> getAndroidDriver()
	{
		try {
			capability = setCapabitilty();
			androidDriver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capability);
			androidDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			return androidDriver;
		} catch (MalformedURLException e) {
			System.out.println(e.toString());
		}
		return null;
	}
	@BeforeSuite
	public void setUp()
	{
		startServer();
	}
	@AfterSuite
	public void tearDown()
	{
		stopServer();
	}
}