package com.bewakoof.commanLibraries;

import java.io.IOException;
import java.net.ServerSocket;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumServer {
	public static AppiumDriverLocalService service;
	
	public static void startServer()
	{
		service = AppiumDriverLocalService.buildDefaultService();
		if(!checkIfServerIsRunning(4723))
		{
			service.start();
			System.out.println("Appium server start");
		}
		else {
			System.out.println("Appium server is already running on port");
		}
	}
	public static void stopServer()
	{
		System.out.println("Appium Server stopped");
		service.stop();	
	}
	public static boolean checkIfServerIsRunning(int port)
	{
		boolean isServiceRunning = false;
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);
			serverSocket.close();
		} catch (IOException e) {
			isServiceRunning=true;
		}
		finally {
			serverSocket = null;
		}
		return isServiceRunning;
	}
	
}
