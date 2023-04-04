package com.medsol.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.medsol.pageobject.Bedtypepage;
import com.medsol.pageobject.Loginpage;

public class TC_BedtypeCancelButtonVerifing  extends Baseclass {

	Loginpage OBlogin;
	Bedtypepage Obbedtype;
	public String BedType = config.getBedType();
	public String BedTypeDescription = config.getBedTypeDescription();

	@Test
	public void BedTypeCreated(){
		OBlogin = new Loginpage(driver);
		OBlogin.clickonlogin();
		OBlogin.setemail(username);
		OBlogin.setpassword(password);
		OBlogin.clickonloginsubmit();
		Assert.assertTrue(driver.findElement(By.xpath("(//a[@class='nav-link  d-flex align-items-center py-3'])[1]"))
				.isDisplayed());

		Obbedtype = new Bedtypepage(driver);
		Obbedtype.Bedmanagement();
		Obbedtype.NewBedType();
		Obbedtype.Enterbedtype(BedType);
		Obbedtype.Descreption(BedTypeDescription);
		Obbedtype.Cancel();

	}
}
