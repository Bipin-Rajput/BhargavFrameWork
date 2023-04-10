package com.auto.locators;
/**
 * 
 * * Author : Bhargav Sathwara ***
 * 
 * */
public interface Locators {

	public interface registrationLocators {
		String FIRST_NAME = "//*[@placeholder='First Name']";
		String LAST_NAME = "//*[@placeholder='Last Name']";
		String ADDRESS = "//div//textarea[@ng-model='Adress']";
		String EMAIL_ADDRESS = "//div//input[@ng-model='EmailAdress']";
		String PHONE = "//div//input[@ng-model='Phone']";
		String GENDER = "//input[@value='Male']";
		String COUNTRY_NAME = "//[@id='countries']";
		String PASSWORD = "//div//input[@ng-model='Password']";
		String CONFIRM_PASSWORD = "//div//input[@ng-model='CPassword']";
		String SUBMIT_BUTTON = "//*[@id='submitbtn']";
		String EMAIL_SHOP = "//*[@id='reg_email']";
		String PASSWORD_SHOP = "//*[@id='reg_password']";
		String RESITER_BUTTON = "//*[@name='register']";
		String MYACCOUNT = "//*[@id='menu-item-50']/a";
	}

	public interface loginPageLocators {
		String USERNAME = "//*[@id='username']";
		String LOGIN_PASSWORD = "//*[@id='password']";
		String LOGIN_BUTTON = "//*[@name='login']";
		String LOGIN_SUCCESS = "//*[@id='page-36']/div";
	}
}
