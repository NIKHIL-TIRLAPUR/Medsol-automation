package com.medsol.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.medsol.pageobject.Bedspage;
import com.medsol.pageobject.Loginpage;

public class TC_BulkbedCreated extends Baseclass {
	Loginpage OBlogin;
	Bedspage ObNewBed;
	public String bedname = config.getBulkbedname();
	public String charges = config.getBulkbedCharges();
	public String des = config.getBulkbedDescription();
	public String bedtype = config.getBulkbedtype();

	@Test
	public void NewBedCreated() throws InterruptedException {
		OBlogin = new Loginpage(driver);
		OBlogin.clickonlogin();
		OBlogin.setemail(username);
		OBlogin.setpassword(password);
		OBlogin.clickonloginsubmit();
		Assert.assertTrue(driver.findElement(By.xpath("(//a[@class='nav-link  d-flex align-items-center py-3'])[1]"))
				.isDisplayed());

		ObNewBed = new Bedspage(driver);
		ObNewBed.Bedmanagement();
		ObNewBed.Beds();
		ObNewBed.BedsAction();
		ObNewBed.NewBulkbed();
		ObNewBed.BulkBedname(bedname);
		ObNewBed.BedtypeDropDown();
		ObNewBed.BulkbedtypeSearchTB(bedtype);
		ObNewBed.bulkBedcharges(charges);
		ObNewBed.BulkbedDescription(des);
		// ObNewBed.BulkbedAdd();
		ObNewBed.Bilkbedsave();
		// ObNewBed.BulkbedDelete();

	}
}
