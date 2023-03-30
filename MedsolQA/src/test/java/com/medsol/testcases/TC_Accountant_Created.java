package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobjects.AccountantsPage;
import com.medsol.pageobjects.LoginPage;
import com.medsol.utilities.Readconfig;

public class TC_Accountant_Created extends BaseClass {

	Readconfig config=new Readconfig();
	
	public String firstname=config.getFirstName();
	public String lastname=config.getLastName();
//	public String email=config.getEmail();
//	public String phonenumber=config.getPhoneNumber();
	public String bloodgroup=config.getBloodGroup();
	public String designation=config.getDesignation();
	public String qualification=config.getQualification();
	public String date=config.getDate();
	public String month=config.getMonth();
	public String year=config.getYear();
	public String password1=config.getPassword1();
	public String confirmPassword=config.getConfirmPassword();
	public String address1=config.getAddress1();
	public String address2=config.getAddress2();
	public String city=config.getCity();
	public String zip=config.getZipCode();
	
	
	@Test
	public void accountantTest() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.clickOnLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		Thread.sleep(2000);
		lp.clickOnLoginSubmit();
		
		
		AccountantsPage ap=new AccountantsPage(driver);
		Thread.sleep(3000);
		ap.clickOnAccountantsButton();
		Thread.sleep(1000);
		ap.clickOnNewAccountantButton();
		Thread.sleep(1000);
		ap.setFirstName(firstname);
		ap.setLastName(lastname);
		String email=randomString()+"@gmail.com";
		ap.setEmail(email);
		ap.clickOnCountryCode();
		ap.setCountryCode();
		String phone="99005"+randomNumber();
		ap.setPhoneNumber(phone);
		ap.clickOnBloodGroupDropDown();
		ap.setBloodGroup(bloodgroup);
		ap.setDesignation(designation);
		ap.setQualification(qualification);
		ap.setDob(year, month, date);
		ap.clickOnMaleGender();
		ap.setAccPassword(password1);
		ap.setConfirmPassword(confirmPassword);
		ap.setAddress1(address1);
		ap.setAddress2(address2);
		ap.setCity(city);
		ap.setZip(zip);
		ap.clickOnSaveButton();
		Thread.sleep(10000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
