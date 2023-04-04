package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.Bloodbankpage;
import com.medol1.pageobjects.Loginpage;
import com.medsol1.utilities.Readconfig;

public class Tc_Bloodbank extends Baseclass{
	
	Readconfig config= new Readconfig();
	public String Bloodgroup1 =config.getBloodgroup1();
	public String Remainingbags1=config.getRemainingbags1();	;
	
	
	
	
	
	@Test
	public void Bloodbank() throws InterruptedException {
		
		
		
		Thread.sleep(2000);
		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	
Bloodbankpage mb = new Bloodbankpage(driver);
mb.Bloodbankpage1();
Thread.sleep(3000);
mb.NewBloodbank();
Thread.sleep(3000);
mb.BloodGroup("BloodGroup");
mb.Remainingbags("Remainingbags");
mb.save();
}
}












