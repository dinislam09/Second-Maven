package com.pagefactoryConceptRun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class Browser {
	
	public static WebDriver dr;

	@BeforeMethod
	public WebDriver Open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\Driver\\chromedriver.exe");
		dr=new ChromeDriver();
		
	/*	if(browser.equals("Chrome")) {
			System.setProperty("webdriver.driver.chrome", "C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\ChD\\chromedriver.exe");
			dr=new ChromeDriver();}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.geco.driver", "");
			dr=new FirefoxDriver(); }  */
		
		return dr;
}
	@AfterMethod
	public void Close() {
		dr.quit();
		
	}
	
}



