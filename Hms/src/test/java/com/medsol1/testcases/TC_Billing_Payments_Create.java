package com.medsol1.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.medol1.pageobjects.Billing_Paymentspage;
import com.medol1.pageobjects.Loginpage;

public class TC_Billing_Payments_Create extends Baseclass {
	@Test
	public void createBillingPayments() throws InterruptedException 
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
		Thread.sleep(2000);
		
		
		bp.clickOnPayments();
		
		bp.clickOnActions();
		
		bp.clickOnNewPayments();
		
		bp.clickOnNewPaymentsAccounts();
		
		bp.selectAccountNumber();
		
		bp.clickOnAccountDate();
		
		
		
		bp.clickOnAccountsDate();
		
		bp.clickOnPayTo();
		
		bp.clickOnAmount();
		
		bp.clickOnDescription();
		
		bp.clickOnSave();
	
		
	}


}
