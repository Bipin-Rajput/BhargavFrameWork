package com.auto.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.auto.baseClass.BaseTest;
import com.auto.pageObject.RegistrationPage;
import com.auto.utility.ReadPropertyConfig;
/**
 * 
 * * Author : Bhargav Sathwara ***
 * 
 * */
public class TC_Registration_01 extends BaseTest {

	ReadPropertyConfig readProp = new ReadPropertyConfig();
	String url = readProp.getSiteURL();
	String email = readProp.getEmail();
	String password = readProp.getPassword();

	@BeforeMethod
	public void beforeMethod() {
		openBrowser(url);
	}

	@Test
	public void registrationShop() throws Exception {
		RegistrationPage pageReg = new RegistrationPage();
		pageReg.clickOnMyAccountMenu();
		pageReg.registerShop(email, password);
	}

}
