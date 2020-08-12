package com.bro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver dr;
	
	
	public HomePage(WebDriver dr) {
		this.dr=dr;
	}
	
	
public void urlVarify() {
	dr.get("http://www.osaconsultingtech.com/");
	String expecteUrl="http://www.osaconsultingtech.com/";
	String actualUrl=dr.getCurrentUrl();
	if (expecteUrl.equals(actualUrl)) {
		
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
	}
	}

public void titleVarify() {
	String expecteTitle="OSA Consulting Tech Corp || Best Available Resources For Software Industry";
	String actualTitle=dr.getTitle();
	if(expecteTitle.equals(actualTitle)) {
		System.out.println(actualTitle);
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
	}
}
	
	public LoginPage clickOnForumLoginButton() {
		dr.findElement(By.xpath("//a[text()='Forum Login']")).click();
		return new LoginPage(dr);
	}
	
	
	


}
