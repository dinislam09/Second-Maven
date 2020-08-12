package com.browser;



import org.testng.annotations.Test;

import com.bro.HomePage;
import com.bro.LoginPage;

public class SmokeTest extends BaseTest {
	HomePage hp;
	LoginPage lp;
	@Test
	public void test() throws InterruptedException {
		hp = new HomePage(dr);
		hp.urlVarify();
		hp.titleVarify();
		lp =hp.clickOnForumLoginButton();  //variable
		lp.urlVarify();
		lp.loginTest();
	}
	
	
	
}
