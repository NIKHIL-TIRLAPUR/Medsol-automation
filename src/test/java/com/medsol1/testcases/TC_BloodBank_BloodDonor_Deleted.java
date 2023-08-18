package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.BloodBank_BloodDonorPage;
import com.medol1.pageobjects.Loginpage;
import com.medsol1.utilities.Readconfig;



public class TC_BloodBank_BloodDonor_Deleted extends Baseclass {

	Readconfig config= new Readconfig();
	public String donortextsearchbox=config.getdonortextsearchbox();
	
	@Test
	public void BloodBank_BloodDonortest() throws InterruptedException  {
		

	Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);	
	
	BloodBank_BloodDonorPage BloodDonor= new BloodBank_BloodDonorPage(driver);
	BloodDonor.clickonBloodbank();
	Thread.sleep(2000);
	BloodDonor.clickonblooddonor();
	Thread.sleep(2000);
	BloodDonor.setnameinsearchbox(donortextsearchbox);
	Thread.sleep(2000);
	BloodDonor.clickondeletebutton();
	Thread.sleep(2000);
	BloodDonor.clickonyesdeletebutton();
	Thread.sleep(2000);
	
	}
}


