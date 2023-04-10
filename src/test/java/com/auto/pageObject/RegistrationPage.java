package com.auto.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.auto.baseClass.BaseTest;
import com.auto.locators.Locators.registrationLocators;
/**
 * 
 * * Author : Bhargav Sathwara ***
 * 
 * */
public class RegistrationPage extends BaseTest implements registrationLocators {

	JavascriptExecutor js = (JavascriptExecutor) driver;

	@FindBy(xpath = FIRST_NAME)
	WebElement firstName;

	@FindBy(xpath = LAST_NAME)
	WebElement lastName;

	@FindBy(xpath = ADDRESS)
	WebElement address;

	@FindBy(xpath = EMAIL_ADDRESS)
	WebElement emailAdd;

	@FindBy(xpath = PHONE)
	WebElement phoneNo;

	@FindBy(xpath = GENDER)
	WebElement gender;

	@FindBy(id = COUNTRY_NAME)
	WebElement countryName;

	@FindBy(xpath = PASSWORD)
	WebElement pwd;

	@FindBy(xpath = CONFIRM_PASSWORD)
	WebElement cpwd;

	@FindBy(xpath = SUBMIT_BUTTON)
	WebElement submitButton;
	
	@FindBy(xpath = EMAIL_SHOP)
	WebElement emailShop;
	@FindBy(xpath = PASSWORD_SHOP)
	WebElement passwordShop;
	@FindBy(xpath = RESITER_BUTTON)
	WebElement registerButton;
	@FindBy(xpath = MYACCOUNT)
	WebElement myAccount;

	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}

	public void register(String fname, String lastname, String adress, String emailAddress, String phoneNumber,
			String password, String confirmPassword) throws Exception {
		firstName.sendKeys(fname);
		lastName.sendKeys(lastname);
		address.sendKeys(adress);
		emailAdd.sendKeys(emailAddress);
		phoneNo.sendKeys(phoneNumber);
		if (!gender.isSelected()) {
			gender.click();
		}
		js.executeScript("window.scrollBy(0,250)");
		Select drpCountry = new Select(driver.findElement(By.id("countries")));
		drpCountry.selectByValue("India");
		Thread.sleep(3000);

		Select drpYear = new Select(driver.findElement(By.id("yearbox")));
		drpYear.selectByValue("1994");

		Select drpMonth = new Select(driver.findElement(By.xpath("//div//select[@ng-model='monthbox']")));
		drpMonth.selectByValue("August");

		Select drpDay = new Select(driver.findElement(By.id("daybox")));
		drpDay.selectByValue("18");
		js.executeScript("window.scrollBy(0,250)");
		pwd.sendKeys(password);
		cpwd.sendKeys(confirmPassword);
		submitButton.click();
	}
	
	public void registerShop(String email, String password) throws Exception {
		emailShop.sendKeys(email);
		passwordShop.sendKeys(password);
		registerButton.click();
		waitFor5Sec();
	}

	public void clickOnMyAccountMenu() throws Exception {
		myAccount.click();
		waitFor4Sec();
	}
}
