package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.BloodBank_BloodDonors;
import com.medol1.pageobjects.Loginpage;

public class TC_BloodBank_BloodDonor_Modified extends Baseclass {
	@Test
	public void modifyBloodDonors() throws InterruptedException
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
		
		bd.clickOnEditBloodDonor();
		Thread.sleep(3000);
		
		bd.editBloodDonorName();
		Thread.sleep(2000);
		
		bd.editBloodDonorAge();
		Thread.sleep(2000);
		
		bd.editGender();
		
		bd.clickOnEditBloodGroup();
		
		
		
		bd.editBloodGroup_A();
		
		bd.clickOnEditDonationDate();
		
		
			
		//bd.selectEditYear();
		
		bd.selectEditDate();
		
		bd.clickOnEditSaveNewBloodDonor();

		
		
	}

}
