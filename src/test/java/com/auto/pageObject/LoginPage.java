package com.auto.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.auto.baseClass.BaseTest;
import com.auto.locators.Locators.loginPageLocators;
/**
 * 
 * * Author : Bhargav Sathwara ***
 * 
 * */
public class LoginPage extends BaseTest implements loginPageLocators {

	@FindBy(xpath = USERNAME)
	WebElement userName;
	@FindBy(xpath = LOGIN_PASSWORD)
	WebElement password;
	@FindBy(xpath = LOGIN_BUTTON)
	WebElement loginButton;
	@FindBy(xpath = LOGIN_SUCCESS)
	WebElement loginSuccess;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void login(String uname, String pwd) throws Exception {
		userName.sendKeys(uname);
		password.sendKeys(pwd);
		loginButton.click();
		waitFor3Sec();
	}

	public boolean isLoginSuccess() {
		if (driver.findElement(By.xpath(LOGIN_SUCCESS)) != null) {
			return true;
		}
		return false;
	}
}
