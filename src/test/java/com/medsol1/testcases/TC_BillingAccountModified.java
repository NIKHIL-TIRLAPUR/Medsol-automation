package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.BillingAccountPage;
import com.medol1.pageobjects.Loginpage;
import com.medsol1.utilities.Readconfig;



public class TC_BillingAccountModified extends Baseclass 
{
    Readconfig config= new Readconfig();
	
	public String changebillingname=config.getchangebillingname();
	public String changebillingdescription=config.getchangebillingdescription();
	
	
	@Test
	public void Billingsmodified() throws InterruptedException
	{
		Thread.sleep(3000);
		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);	
	
	BillingAccountPage bil= new BillingAccountPage(driver);
	bil.clickonbillings();
	Thread.sleep(2000);
	bil.clickoneidtbutton();
	bil.setchangedbillingname(changebillingname);
	bil.setchangedbillingdescription(changebillingdescription);
	
}
}