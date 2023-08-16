package com.medsol1.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.medol1.pageobjects.BloodBank_BloodDonors;
import com.medol1.pageobjects.Loginpage;

public class TC_BloodBank_BloodDonor_Create extends Baseclass {
	
	@Test
	public void createBloodDonors() throws InterruptedException
	{
		Thread.sleep(5000);
		Loginpage lp=new Loginpage(driver);
		lp.clickonlogin();
		lp.setemail(username);
		lp.setpassword(password);
		lp.clickonloginsubmit();
		Thread.sleep(5000);
		
		BloodBank_BloodDonors bd=new BloodBank_BloodDonors(driver);
		
		bd.clickOnBloodBank();
		Thread.sleep(2000);
		
		bd.clickOnBloodDonor();
		Thread.sleep(5000);
		
		bd.clickOnNewBloodDonor();
		Thread.sleep(5000);
		
		bd.enterBloodDonorName();
		Thread.sleep(2000);
		
		bd.enterBloodDonorAge();
		Thread.sleep(2000);
		
		bd.selectGenderFemale();;
		Thread.sleep(2000);
		
		bd.clickOnBloodGroup();
		Thread.sleep(2000);
		
		bd.bloodGroupA_Positive();
		Thread.sleep(2000);
		
		bd.clickOnDonationDate();
		Thread.sleep(2000);
		
		bd.selectMonth();
		
		 WebElement month = driver.findElement(By.className("flatpickr-monthDropdown-months"));
		 
		 Select s=new Select(month);
		 s.selectByValue("2");
		 
		 bd.selectYear();
		
		bd.selectDate();
		
		bd.clickOnSaveNewBloodDonor();
	
		
	}
	
	

}
