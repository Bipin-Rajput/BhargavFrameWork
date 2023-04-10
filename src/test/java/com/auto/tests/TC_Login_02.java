package com.auto.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.auto.baseClass.BaseTest;
import com.auto.pageObject.LoginPage;
import com.auto.pageObject.RegistrationPage;
import com.auto.utility.ReadPropertyConfig;
/**
 * 
 * * Author : Bhargav Sathwara ***
 * 
 * */
public class TC_Login_02 extends BaseTest {

	ReadPropertyConfig readProp = new ReadPropertyConfig();
	String url = readProp.getSiteURL();
	String uname = readProp.getEmail();
	String pwd = readProp.getPassword();

	@BeforeMethod
	public void beforeMethod() {
		openBrowser(url);
	}

	@Test
	public void loginTest() throws Exception {
		RegistrationPage regPage = new RegistrationPage();
		LoginPage loginPage = new LoginPage();
		regPage.clickOnMyAccountMenu();
		loginPage.login(uname, pwd);
		Assert.assertTrue(loginPage.isLoginSuccess(), "Login is not success as expected !!!");
	}
}
