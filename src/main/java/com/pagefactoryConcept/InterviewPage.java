package com.pagefactoryConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InterviewPage {
	WebDriver dr;
	public InterviewPage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
}
