package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.BloodDonarPage;
import com.medol1.pageobjects.Loginpage;
import com.medsol1.utilities.Readconfig;

public class Tc_BloodDonar extends Baseclass {
Readconfig config= new Readconfig();
	
	public String changefirstname=config.getnameinsearchbox();
	public String changelastname=config.getnumeberforpagedropdown()	;

@Test
	public void BloodDonar() throws InterruptedException {
		
		
		
		Thread.sleep(3000);
		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	
	
	BloodDonarPage Bd = new BloodDonarPage(driver);
	  Bd.BloodBank();
	  Thread.sleep(3000);
      Bd.BloodDonar1();
      Bd.NewBloodDonar();
      Thread.sleep(3000);
      Bd.BloodDonarName();
      Bd.BloodDonarAge();
      Bd.DonarBloodGroup();
      Bd.LastDonationDate();
	}
}
          