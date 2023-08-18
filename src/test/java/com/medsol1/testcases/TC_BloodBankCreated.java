package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.BloodBankPage;
import com.medol1.pageobjects.Loginpage;
import com.medsol1.utilities.Readconfig;



public class TC_BloodBankCreated extends Baseclass {

	Readconfig config= new Readconfig();
	public String bloodgroupinbloodbank=config.getbloodgroupinbloodbank();
	public String remainingbag=config.getremainingbag();
	
	@Test
	public void BloodBankCreated() throws InterruptedException  {
		

    Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);	
	
	BloodBankPage bank = new BloodBankPage(driver);
	bank.clickonBloodbank();
	Thread.sleep(2000);
	bank.clickonNewbloodgroup();
	Thread.sleep(2000);
	bank.setbloodgroup(bloodgroupinbloodbank);
	bank.setremainingbloodbag(remainingbag);	
	bank.clickonsave();	
	}
	}

