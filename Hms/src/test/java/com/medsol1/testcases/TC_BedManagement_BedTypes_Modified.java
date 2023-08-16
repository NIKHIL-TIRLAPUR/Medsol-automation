package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.BedManagement_BedTypes;
import com.medol1.pageobjects.Loginpage;

public class TC_BedManagement_BedTypes_Modified extends Baseclass {
	@Test
	public void modifyBedTypes() throws InterruptedException 
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
		
		bt.clickOnEdit();
		Thread.sleep(2000);
		bt.editBedType();
		Thread.sleep(2000);
		bt.editDescription();
		Thread.sleep(2000);
		bt.editSave();
	}

}
