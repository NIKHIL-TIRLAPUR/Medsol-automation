package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.BloodBank_BloodDonationPage;
import com.medol1.pageobjects.Loginpage;
import com.medsol1.utilities.Readconfig;



public class TC_BloodBank_BloodDonation_Modified  extends Baseclass{
	
	Readconfig config= new Readconfig();
	public String editdonorname=config.geteditdonorname();
	public String editbloodbags=config.geteditbloodbags();
	
	@Test
	public void Bloodbank_BloodDonationstest() throws InterruptedException  {
		

	Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);	
	
	BloodBank_BloodDonationPage BDonations= new BloodBank_BloodDonationPage(driver);
	BDonations.clickonBloodbank();
	Thread.sleep(2000);
	BDonations.clickonBlooddonations();
	Thread.sleep(2000);
	BDonations.clickonedit();
	Thread.sleep(2000);
	BDonations.seteditdonorname(editdonorname);
	BDonations.seteditnumberofbloodbagdonated(editbloodbags);
	BDonations.clickoneditsave();
	Thread.sleep(2000);
	}
}
