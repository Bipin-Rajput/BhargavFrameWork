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
public class Registration_Demo extends BaseTest{
	ReadPropertyConfig readPro = new ReadPropertyConfig();
	String firstname = readPro.getFirstName();
	String lastname = readPro.getLastName();
	String adress = readPro.getAddress();
	String emailAddress = readPro.getEmail();
	String phoneNumber = readPro.getPhoneNumber();
	String password = readPro.getPassword();
	String cPassword = readPro.getConfirmPassword();
	String url = readPro.getBaseUrl();

	@BeforeMethod
	public void beforeMethod() {
		openBrowser(url);
	}

	@Test
	public void registrationTest_01() throws Exception {
		RegistrationPage regPage = new RegistrationPage();
		regPage.register(firstname, lastname, adress, emailAddress, phoneNumber, password, cPassword);
	}
}
