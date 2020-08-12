package com.browser;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	public WebDriver dr;
	
	@BeforeMethod
	public void openB() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\Driver\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		
		
		
		
		
	}
	
	
}
