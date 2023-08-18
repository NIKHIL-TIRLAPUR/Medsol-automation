package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.BillingAccountPage;
import com.medol1.pageobjects.Loginpage;
import com.medsol1.utilities.Readconfig;



public class TC_BillingAccountCreated extends Baseclass{

	Readconfig config= new Readconfig();
	public String firstname=config.getfirstname();
	public String description=config.getdescription();
	
    @Test
	public void Billingstest() throws InterruptedException 
    {
		
		Thread.sleep(3000);
		Loginpage lp = new Loginpage(driver);
		lp.clickonlogin();
		Logger.info("clicked on login button");
		lp.setemail(username);
		Logger.info("entered user name");
		lp.setpassword(password);
		Logger.info("entered user password");
		lp.clickonloginsubmit();
		Logger.info("clicked on login button sumit");
		Thread.sleep(3000);

		BillingAccountPage bil= new BillingAccountPage(driver);
		bil.clickonbillings();
		Logger.info("clicked on billings button");
		Thread.sleep(2000);
		bil.clickonnewaccount();
		Logger.info("clicked on new account button");
		Thread.sleep(2000);
		bil.setaccount(firstname);
		Logger.info("entered account name");
		bil.setdescription(description);
		Logger.info("entered description");
		bil.setstatus();
		Logger.info("clicked on status");
		bil.setaccounttype();
		Logger.info("selected type of account");
		bil.clickonsavebutton();
		Thread.sleep(3000); 
		
	}
}

