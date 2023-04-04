package com.medsol.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.medsol.pageobject.Bedspage;
import com.medsol.pageobject.Loginpage;

public class TC_BulkbedModified extends Baseclass {
	Loginpage OBlogin;
	Bedspage ObNewBed;
	public String bedname = config.getBulkbedname();
	public String bednameEdit = config.getBulkbednameEdit();
	public String bedtypeEdit = config.getBulkbedtypeEdit();
	public String chargesEdit = config.getBulkbedChargesEdit();
	public String desEdit = config.getBulkbedDescriptionEdit();

	@Test
	public void BulkbedEdited() throws InterruptedException {
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
		ObNewBed.SearchExistingBed(bedname);
		ObNewBed.EditExistingBeds();
		ObNewBed.BulkbednameEdit(bednameEdit);
		ObNewBed.BulkbedtypeEdit(bedtypeEdit);
		ObNewBed.BulkbedChargesEdit(chargesEdit);
		ObNewBed.BulkbedDescriptionEdit(desEdit);
		ObNewBed.BulkbedEditSave();
		// ObNewBed.BulkbedEditCancel();

	}

}
