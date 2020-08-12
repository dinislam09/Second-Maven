package com.bro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	
WebDriver dr;

	@FindBy(id="username")WebElement username;   // pageFactory concept.
	@FindBy(id="password")WebElement password;
	
	public LoginPage(WebDriver dr) {
		this.dr=dr;
		
	PageFactory.initElements(dr, this);
		
	}	
	
	public void urlVarify() throws InterruptedException {
		Thread.sleep(4000);
		String expecteUrl="https://osaconsultingtech.com/Forum/logins/forum_login.html";
		String actualUrl=dr.getCurrentUrl();
		if (expecteUrl.equals(actualUrl)) {
			System.out.println(actualUrl);
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		}
	
	public void loginTest() {
		username.sendKeys("hjdfs");
		password.sendKeys("1762187");
		
		Select s=new Select(dr.findElement(By.id("position")));
		s.selectByIndex(1);
		//Select se=new Select(dr.findElement(By.id("position")));
		s.selectByVisibleText("Student");
		dr.findElement(By.id("login_button")).click();
		
		
		
	}
	
	
	
	
	
}
