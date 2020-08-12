package com.pagefactoryConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class HomePageOsa {
	
	@FindBy(xpath="//*[@id=\"ftco-nav\"]/ul/li[7]/a") WebElement osaforumlogin;	
	@FindBy(id="fName") WebElement osafirstname;
	@FindBy(id="lName") WebElement osalastname;               //pagefactory concept
	@FindBy(id="topic") WebElement osaprofessionaltraining;
	@FindBy(id="phone") WebElement phone;
	@FindBy(id="email") WebElement email;
	@FindBy(id="message") WebElement message;
	
	
	WebDriver dr;
	public HomePageOsa(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}	
	
	public void url() {
		dr.get("https://osaconsultingtech.com/");
		dr.manage().window().maximize();
		String excepturl="https://osaconsultingtech.com/";
		String actualurl=dr.getCurrentUrl();
		
		if(excepturl.equals(actualurl)) {
			System.out.println("pass");
		}
			else {System.out.println("Fail");}
		}
	
	public Forumlogin ClickForumlogin() {
		osaforumlogin.click();
		
		return new Forumlogin(dr);
		
	}
	
	
	

}
