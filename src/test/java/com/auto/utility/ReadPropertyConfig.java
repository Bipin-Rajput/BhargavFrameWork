package com.auto.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
/**
 * 
 * * Author : Bhargav Sathwara ***
 * 
 * */
public class ReadPropertyConfig {

	Properties configProperty;
	Properties dataProperty;

	public ReadPropertyConfig() {
		File src = new File("./Configuration/config.properties");
		File src1 = new File("./Configuration/testdata.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			configProperty = new Properties();
			configProperty.load(fis);

			FileInputStream fis1 = new FileInputStream(src1);
			dataProperty = new Properties();
			dataProperty.load(fis1);
		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}
	}

	//Registration Demo Get Property
	public String getBaseUrl() {
		String url = dataProperty.getProperty("BASE_URL");
		return url;
	}

	public String getFirstName() {
		String firstName = dataProperty.getProperty("FIRSTNAME");
		return firstName;
	}

	public String getLastName() {
		String lastName = dataProperty.getProperty("LASTNAME");
		return lastName;
	}

	public String getAddress() {
		String address = dataProperty.getProperty("ADDRESS");
		return address;
	}

	public String getEmail() {
		String emailID = dataProperty.getProperty("EMAIL");
		return emailID;
	}

	public String getPhoneNumber() {
		String phoneNo = dataProperty.getProperty("PHONE_NUMBER");
		return phoneNo;
	}

	public String getPassword() {
		String password = dataProperty.getProperty("PASSWORD");
		return password;
	}

	public String getConfirmPassword() {
		String cpassword = dataProperty.getProperty("CPASSWORD");
		return cpassword;
	}

	//Shop Registration get Property
		public String getSiteURL(){
			String siteURL = dataProperty.getProperty("SITE_URL");
			return siteURL;
		}
		
	//Driver get Property
	public String getChromeDriver() {
		String chromeDriver = configProperty.getProperty("CHROME_DRIVER");
		return chromeDriver;
	}

	public String getFirefoxDriver() {
		String firefoxDriver = configProperty.getProperty("FIREFOX_DRIVER");
		return firefoxDriver;
	}

	public String getIEDriver() {
		String ieDriver = configProperty.getProperty("IE_DRIVER");
		return ieDriver;
	}
}
