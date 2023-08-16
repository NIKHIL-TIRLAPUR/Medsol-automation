package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.Billing_Paymentspage;
import com.medol1.pageobjects.Loginpage;

public class TC_Billing_Payments_Delete extends Baseclass {
	@Test
	public void deleteBillingPayments() throws InterruptedException
	{

		Thread.sleep(2000);
		Loginpage lp=new Loginpage(driver);
		lp.clickonlogin();
		lp.setemail(username);
		lp.setpassword(password);
		lp.clickonloginsubmit();
		Thread.sleep(3000);
		

		Billing_Paymentspage bp=new Billing_Paymentspage(driver);
		
		bp.cliclOnBilling();
		
		bp.clickOnDelete();
		bp.clickOnDeleteYes();
	}

}
