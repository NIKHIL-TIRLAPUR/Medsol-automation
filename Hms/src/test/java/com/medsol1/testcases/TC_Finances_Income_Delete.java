package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.Finances_Income;
import com.medol1.pageobjects.Loginpage;

public class TC_Finances_Income_Delete extends Baseclass {
	@Test
	public void deleteFinanceIncome() throws InterruptedException 
	{

		Thread.sleep(5000);
		Loginpage lp=new Loginpage(driver);
		lp.clickonlogin();
		lp.setemail(username);
		lp.setpassword(password);
		lp.clickonloginsubmit();
		Thread.sleep(5000);
		
		
		Loginpage l=new Loginpage(driver);
		
		l.scrolldown1();
		Thread.sleep(2000);
		
		Finances_Income fi=new Finances_Income(driver);
		fi.clickOnFinances();
		Thread.sleep(2000);
		
		fi.clickOnDelete();
		Thread.sleep(2000);
		
		fi.clickOnYesDelete();
		Thread.sleep(2000);
	}

}
