package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.BloodBank_BloodDonorPage;
import com.medol1.pageobjects.Loginpage;
import com.medsol1.utilities.Readconfig;



public class TC_BloodBank_BloodDonor_Modified extends Baseclass{

	Readconfig config= new Readconfig();
	public String editdonorname=config.geteditdonorname();
	public String editdonorage=config.geteditdonorage();
	public String editbloodgroup=config.geteditbloodgroup();
	
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
	BloodDonor.clickonbloodDonoreditbutton();
	Thread.sleep(2000);
	
	BloodDonor.seteditblooddonorname(editdonorname);
	
	BloodDonor.seteditblooddonorage(editdonorage);
	BloodDonor.clickoneditblooddonorgender();
	BloodDonor.seteditbloodgroupofdonor(editbloodgroup);
	Thread.sleep(2000);
	BloodDonor.clickoneditbloodDonorSavebutton();
	Thread.sleep(2000);

	}
	
}

