package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	WebDriver dr;
	@BeforeMethod
	public void open() {
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\Driver\\chromedriver.exe";
		System.setProperty(key, value);
		dr = new ChromeDriver();
		dr.get("https://www.facebook.com/");
		dr.manage().window().maximize();
	}
	
	
	@AfterMethod
	public void close() {
		dr.close();
	}
	


}
