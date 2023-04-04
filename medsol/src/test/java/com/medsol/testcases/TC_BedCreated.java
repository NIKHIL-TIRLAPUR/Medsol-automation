package com.medsol.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.medsol.pageobject.Bedspage;
import com.medsol.pageobject.Loginpage;

public class TC_BedCreated extends Baseclass {
	Loginpage OBlogin;
	Bedspage ObNewBed;
	public String bedname= config.getBedmanagementBedName();
	public String charges = config.getBedmanagementCharge();
	public String des = config.getBedmanagementDescription();
	public String bedtype= config.getBedmanagementBedtype();
	
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
		ObNewBed.BedsAction();
		ObNewBed.newBed();
		ObNewBed.NewBedName(bedname);
		Thread.sleep(100);;
		ObNewBed.Searchbedtype(bedtype);
		Thread.sleep(100);
		ObNewBed.charges(charges);
		Thread.sleep(100);
		ObNewBed.description(des);
		Thread.sleep(100);
		ObNewBed.save();
	}		
}
