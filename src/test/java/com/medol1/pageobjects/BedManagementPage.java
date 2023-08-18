package com.medol1.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BedManagementPage {
WebDriver ldriver;
	
	public BedManagementPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Bed Management']")
    WebElement Bedmanagementbutton;
	

	@FindBy(xpath="//a[normalize-space()='New Bed Type']")
    WebElement newbedtype;
	

	@FindBy(id="BedTypeTitle")
    WebElement txtbedtypetitle;
	
	@FindBy(id="BedTypeDescription")
    WebElement txtbedtypedescription;
	
	@FindBy(id="BedTypesBtnSave")
    WebElement bedtypebuttonsave;
	
	public void clickonbedmanagement()
	{
		Bedmanagementbutton.click();
	}
	
	public void clickonnewbedtype()
	{
		newbedtype.click();
	}
	
	public void setbedtype(String bed)
	{
		txtbedtypetitle.sendKeys(bed);;
	}
	
	
	public void setbeddescription(String description)
	{
		txtbedtypedescription.sendKeys(description);;
	}
	
	public void clickonsave()
	{
		bedtypebuttonsave.click();
	}
	}

