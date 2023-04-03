package com.medsol.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.medsol.pageobject.Bedspage;
import com.medsol.pageobject.Loginpage;

public class TC_Bedmodified extends Baseclass {
	Loginpage OBlogin;
	Bedspage ObNewBed;
	public String bedname= config.getBedmanagementBedName();
	public String editbedname= config.getBedmanagementBedEditBedname();
	public String editBedtype = config.getBedmanagementBedEditbedtype();
	public String editdes = config.getBedmanagementBedEditdescription();
	public String editCharge= config.getBedmanagementBedEditcharges();
	
	@Test
	public void bedCreated() throws InterruptedException {
		OBlogin = new Loginpage(driver);
		OBlogin.clickonlogin();
		OBlogin.setemail(username);
		OBlogin.setpassword(password);
		OBlogin.clickonloginsubmit();
		Assert.assertTrue(driver.findElement(By.xpath("(//a[@class='nav-link  d-flex align-items-center py-3'])[1]"))
				.isDisplayed());

		ObNewBed=new Bedspage(driver);
		ObNewBed.Bedmanagement();
		ObNewBed.Beds();
		Thread.sleep(10);
		ObNewBed.SearchExistingBed(bedname);
		ObNewBed.EditExistingBeds();
		ObNewBed.Bednameedit(editbedname);
		ObNewBed.dropdowntoeditbedtype(editBedtype);
		ObNewBed.EditCharges(editCharge);
		ObNewBed.EditDiscription(editdes);
		ObNewBed.editSave();
		
	}
}
