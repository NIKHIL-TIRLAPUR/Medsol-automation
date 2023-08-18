package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.BedManagement_BedPage;
import com.medol1.pageobjects.Loginpage;
import com.medsol1.utilities.Readconfig;



public class TC_BedManagement_Bed_created extends Baseclass {

	Readconfig config= new Readconfig();
	public String bedtype=config.getbedtype();
	public String description=config.getdescription();
	public String bed=config.getbed();
	public String standardcharge=config.getstandardcharge();
	
	
	@Test
	public void Bedmanagementtest() throws InterruptedException {
		
	
    Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);	
	
	
	
	BedManagement_BedPage beds=new BedManagement_BedPage(driver);
	
	beds.clickonbedmanagement();
	Thread.sleep(2000);
	beds.clickonBeds();
	Thread.sleep(2000);
	beds.clickondropdownMenuButton();
	Thread.sleep(2000);
	beds.clickonNewBed();
	Thread.sleep(2000);
	beds.setBedName(bed);
	beds.setselectbedType(bedtype);
	beds.setbedCharges(standardcharge);
	beds.setBedDescription(description);
	beds.clickonBedSaveBtn();
	Thread.sleep(2000);
}
}
