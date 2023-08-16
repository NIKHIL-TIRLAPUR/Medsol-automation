package com.medsol1.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.medol1.pageobjects.Billing_Accountspage;
import com.medol1.pageobjects.Loginpage;

public class TC_Billing_Accounts_Create extends Baseclass{
	@Test
	public void createBillingAccount() throws InterruptedException
	{
		Thread.sleep(5000);
		Loginpage lp=new Loginpage(driver);
		lp.clickonlogin();
		lp.setemail(username);
		lp.setpassword(password);
		lp.clickonloginsubmit();
		Thread.sleep(5000);
		
		
		Billing_Accountspage ba=new Billing_Accountspage(driver);
		
		ba.clickonBilling();
		Thread.sleep(3000);
		
		ba.clickOnNewAccount();
		Thread.sleep(3000);
		
		
		ba.account();
		Thread.sleep(3000);
		
		ba.description();
		Thread.sleep(3000);
		
		ba.status();
		Thread.sleep(3000);
		
		ba.typeCredit();
		Thread.sleep(3000);
		
		ba.save();
		
		
	//	ba.billingStatus();
		
	
		
		
			
	}

}
