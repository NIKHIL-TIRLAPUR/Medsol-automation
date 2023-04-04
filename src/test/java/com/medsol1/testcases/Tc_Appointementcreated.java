package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.Appointementpage;
import com.medol1.pageobjects.Loginpage;

public class Tc_Appointementcreated  extends Baseclass {
	@Test
	public void Appointementtest() throws InterruptedException {
		
		
		
		Thread.sleep(3000);
		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
		
		
	
	Appointementpage ap= new Appointementpage(driver);
	 ap.Appointement();
	 Thread.sleep(3000);
     ap.newAppointement();
     Thread.sleep(3000);
	 
	 ap.Doctordepartement();
	 ap.selectpatient();
//	 ap.Doctor();
//	 ap.date("11", "March", "2024");
	 ap.Description();
	 ap.save();
	}
}
	


