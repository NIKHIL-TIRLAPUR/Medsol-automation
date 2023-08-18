package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.BloodBank_BloodDonorPage;
import com.medol1.pageobjects.Loginpage;
import com.medsol1.utilities.Readconfig;


public class TC_BloodBank_BloodDonor_Created extends Baseclass {

	
	Readconfig config= new Readconfig();
	public String donorname=config.getdonorname();
	public String donorage=config.getdonorage();
	public String bloodgroup=config.getbloodgroup();
	public String year=config.getyear();
	public String month=config.getmonth();
	public String date=config.getdate();
	
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
	BloodDonor.clickonnewblooddonor();
	Thread.sleep(2000);
	BloodDonor.setblooddonorname(donorname);
	BloodDonor.setblooddonorage(donorage);
	BloodDonor.clickonblooddonorgender();
	BloodDonor.setbloodgroupofdonor(bloodgroup);
	Thread.sleep(2000);
	BloodDonor.setlastblooddonationdate(month, date);
	Thread.sleep(2000);
	BloodDonor.clickonbloodDonorSavebutton();
	Thread.sleep(2000);
	}
}

