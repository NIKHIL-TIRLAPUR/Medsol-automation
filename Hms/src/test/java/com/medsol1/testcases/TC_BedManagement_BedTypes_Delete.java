package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.BedManagement_BedTypes;
import com.medol1.pageobjects.Loginpage;

public class TC_BedManagement_BedTypes_Delete extends Baseclass {
	@Test
	public void deleteBedTypes() throws InterruptedException
	{
		Thread.sleep(2000);
		Loginpage lp=new Loginpage(driver);
		lp.clickonlogin();
		lp.setemail(username);
		lp.setpassword(password);
		lp.clickonloginsubmit();
		Thread.sleep(3000);
		
		
		BedManagement_BedTypes bt=new BedManagement_BedTypes(driver);
		
		bt.clickOnBedManagement();
		
		bt.clickOnDelete();
		Thread.sleep(2000);
		bt.yesDelete();
	}

}
