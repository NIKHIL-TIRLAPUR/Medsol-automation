package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.BloodBankPage;
import com.medol1.pageobjects.Loginpage;



public class TC_BloodBankDelete extends Baseclass {
	
	@Test
	public void Bloodbanktest() throws InterruptedException  {
		

	Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);	
	BloodBankPage bank = new BloodBankPage(driver);
	bank.clickonBloodbank();
	Thread.sleep(2000);
	bank.clickoneditbutton();
	Thread.sleep(2000);
	//bank.clickondeletebutton();
	//bank.clickonyesdeletebutton();
	}

}
