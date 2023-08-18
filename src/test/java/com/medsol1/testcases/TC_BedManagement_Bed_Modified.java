package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.BedManagement_BedPage;
import com.medol1.pageobjects.Loginpage;
import com.medsol1.utilities.Readconfig;



public class TC_BedManagement_Bed_Modified extends Baseclass {
	
	Readconfig config= new Readconfig();
	public String bed=config.getbed();
	public String editdescription=config.geteditdescription();
	public String editbed=config.geteditbed();
	public String editbedtype=config.geteditbedtype();
	public String editstandardcharge=config.geteditstandardcharge();
	
	
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
	
	beds.setnameinsearchbox(bed);
	
	beds.clickoneditbutton();
	
	Thread.sleep(2000);
	
	beds.seteditBedName(editbed);
	beds.seteditselectbedType(editbedtype);
	
	Thread.sleep(2000);
	
	beds.seteditbedCharges(editstandardcharge);
	beds.seteditBedDescription(editdescription);
	beds.clickonbtnEditSave();
	
	Thread.sleep(2000);
	
	}
	}
