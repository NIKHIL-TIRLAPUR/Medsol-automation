package com.medol1.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BedManagement_BedTypes {
	
	WebDriver ldriver;

	public BedManagement_BedTypes(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	    @FindBy(xpath="//span[.='Bed Management']")
	    WebElement Bed_Management;
	    
	    @FindBy(xpath="//input[@name='search']")
	    WebElement Bed_Management_Search;
	    
	    @FindBy(xpath="//a[.='New Bed Type']")
	    WebElement Bed_Management_NewBedType;
	    
	    
	    
	    
	    @FindBy(xpath="//input[@id='BedTypeTitle']")
	    WebElement NewBedType_BedType;
	    
	    @FindBy(xpath="//textarea[@id='BedTypeDescription']")
	    WebElement NewBedType_Description;
	    
	    @FindBy(xpath="//button[@id='BedTypesBtnSave']")
	    WebElement NewBedType_Save;
	    
	    @FindBy(xpath="(//button[.='Cancel'])[1]")
	    WebElement NewBedType_Cancel;
	    
	    
	    
	    
	    @FindBy(xpath="(//a[@title='Edit'])[1]")
	    WebElement Bed_Management_Edit;
	    
	    @FindBy(xpath="//input[@id='BedTypeEditTitle']")
	    WebElement Edit_BedType;
	    
	    @FindBy(xpath="//textarea[@id='BedTypeEditDescription']")
	    WebElement Edit_Description;
	    
	    @FindBy(xpath="//button[@id='BedTyeBtnEditSave']")
	    WebElement Edit_Save;
	    
	    @FindBy(xpath="(//button[.='Cancel'])[2]")
	    WebElement Edit_Cancel;
	    
	    

	    @FindBy(xpath="(//a[@title='Delete'])[1]")
	    WebElement Bed_Management_Delete;
	    
	    @FindBy(xpath="//button[.='Yes, Delete']")
	    WebElement Delete_Yes;
	    
	    @FindBy(xpath="//button[.='No, Cancel']")
	    WebElement Delete_Cancel;
	    
	    
	    
	    
	    
	    
	    public void clickOnBedManagement()
	    {
	    	Bed_Management.click();
	    }
	    
	    public void clickOnSearch()
	    {
	    	Bed_Management_Search.click();
	    	Bed_Management_Search.sendKeys("General Ward Bed");
	    }
	    
	    public void clickOnNewBedType()
	    {
	    	 Bed_Management_NewBedType.click();
	    }
	    
	    
	    
	    
	    
	    public void enterBedType()
	    {
	    	 NewBedType_BedType.sendKeys("semi electric");
	    }
	    
	    public void enterDescription()
	    {
	    	NewBedType_Description.sendKeys("Patient is Serious");
	    }
	    
	    public void clickOnNewBedTypeSave()
	    {
	    	NewBedType_Save.click();
	    }
	    
	    public void clickOnNewBedTypeCancel()
	    {
	    	NewBedType_Cancel.click();
	    }
	    
	    
	    
	    public void clickOnEdit()
	    {
	    Bed_Management_Edit.click();
	    }
	    
	    public void editBedType()
	    {
	    	Edit_BedType.clear();
	    	Edit_BedType.sendKeys("General ward Bed");
	    }
	    
	    public void editDescription()
	    {
	    	Edit_Description.clear();
	    	Edit_Description.sendKeys("Patient out of danger - Not Serious");
	    }
	    
	    public void editSave()
	    {
	    	Edit_Save.click();
	    }
	    
	    public void editCancel()
	    {
	    	Edit_Cancel.click();
	    }
	    
	    
	    
	    
	    
	    public void clickOnDelete()
	    {
	    	Bed_Management_Delete.click();
	    }
	    
	    public void yesDelete()
	    {
	    	Delete_Yes.click();
	    }
	    
	    public void cancelDelete()
	    {
	    	Delete_Cancel.click();
	    }
}
