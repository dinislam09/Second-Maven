package com.pagefactoryConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forumlogin {
	
	@FindBy(xpath="/html/body/center/div[1]/div/b") WebElement forumloginlogo;
	@FindBy(id="username") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(id="position") WebElement student;
	@FindBy(id="login_button") WebElement login;
	
	WebDriver dr;
	public Forumlogin(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	
	public void urlvarify() {
		String excepturl="https://osaconsultingtech.com/Forum/logins/forum_login.html";
		String actualurl=dr.getCurrentUrl();
		
		
		if(excepturl.equals(actualurl)) {
			System.out.println("pass");
		}
		else {System.out.println("Fail");}
	}
	
	public InterviewPage InterviewQ() {
		username.sendKeys("md.islam@osaconsultingtech.com");
		password.sendKeys("507Md1985");
		login.click();
		
		return new InterviewPage(dr);
	}
	
	
}
