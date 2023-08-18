package com.medol1.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BedManagement_BedTypePage {

WebDriver ldriver;
	
	public BedManagement_BedTypePage(WebDriver rdriver)
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
	

	@FindBy(id="BedTypeEditTitle")
    WebElement txtBedTypeEditTitle;
	
	
	@FindBy(id="BedTypeDescription")
    WebElement txtbedtypedescription;
	
	@FindBy(id="BedTypeEditDescription")
    WebElement txtBedTypeEditDescription;
	
	
	@FindBy(id="BedTypesBtnSave")
    WebElement bedtypebuttonsave;
	
	@FindBy(id="BedTyeBtnEditSave")
    WebElement bedtypeeditbuttonsave;
	
	@FindBy(xpath="//tbody/tr[1]/td[2]/div[1]/a[2]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	@FindBy(xpath="//tbody/tr[1]/td[2]/div[1]/a[1]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	
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
		txtbedtypetitle.sendKeys(bed);
	}
	
	
	public void setbeddescription(String description)
	{
		txtbedtypedescription.sendKeys(description);;
	}
	
	public void clickonsave()
	{
		bedtypebuttonsave.click();
	}
	
	public void clickoneditsave()
	{
		bedtypeeditbuttonsave.click();
	}
	
	public void clickondeletebutton()
	{
		deletebutton.click();
	}
	
	public void clickonyesdeletebutton()
	{
		yesdeletebutton.click();
	}
	
	public void clickoneditbutton()
	{
		editbutton.click();
	}
	
	public void seteditbedtype(String editbed)
	{
		txtBedTypeEditTitle.clear();
		txtBedTypeEditTitle.sendKeys(editbed);
	}
	
	public void seteditbeddescription(String editdescription)
	{
		txtBedTypeEditDescription.clear();
		txtBedTypeEditDescription.sendKeys(editdescription);;
	}
	}

