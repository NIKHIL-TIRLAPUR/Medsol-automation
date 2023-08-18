package com.medol1.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BedManagement_BedPage {

	
    WebDriver ldriver;
	
	public BedManagement_BedPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Bed Management']")
    WebElement Bedmanagementbutton;
	

	@FindBy(xpath="//a[normalize-space()='Beds']")
	WebElement Beds;
	

	@FindBy(xpath="//div[@class='dropdown']//button[@id='dropdownMenuButton1']")//button[@id='dropdownMenuButton1']
    WebElement dropdownMenuButton;
	
	@FindBy(xpath="//a[normalize-space()='New Bed']")
    WebElement NewBed;
	

	@FindBy(xpath="//input[@id='BedName']")
    WebElement BedName;
	

	@FindBy(xpath="//span[@id='select2-bedType-container']")
    WebElement selectbedType;
	
	@FindBy(xpath="//input[@role='searchbox']")//input[@role='searchbox']
    WebElement searchbox;
	
	@FindBy(xpath="//input[@class='select2-search__field']")//input[@role='searchbox']
    WebElement searchbox1;
	
	
	@FindBy(xpath="//input[@id='bedCharges']")
    WebElement bedCharges;
	

	@FindBy(xpath="//textarea[@id='BedDescription']")
    WebElement BedDescription;
	
	@FindBy(xpath="//button[@id='BedSaveBtn']")
    WebElement BedSaveBtn;
	
	@FindBy(xpath="//a[@title='Edit']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	@FindBy(xpath="//input[@id='editBedName']")
    WebElement editBedName;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/span[2]/span[1]/span[1]/span[1]")
    WebElement editBedType;
	
	@FindBy(xpath="//input[@id='editBedCharge']")
    WebElement editBedCharge;
	
	@FindBy(xpath="//textarea[@id='editBedDescription']")
    WebElement editBedDescription;
	
	@FindBy(xpath="//button[@id='btnEditSave']")
    WebElement btnEditSave;
	
	@FindBy(xpath="//input[@name='search']")
    WebElement searchfordeleteandedit;
	
	//span[@id='select2-bed_filter_status-container']
	
	
	public void clickonbedmanagement()
	{
		Bedmanagementbutton.click();
	}
	
	public void clickonBeds()
	{
		Beds.click();
	}
	
	public void clickondropdownMenuButton()
	{
		dropdownMenuButton.click();
	}
	
	public void clickonNewBed()
	{
		NewBed.click();
	}
	
	public void setBedName(String bname)
	{
		BedName.clear();
		BedName.sendKeys(bname);
	}
	
	public void setselectbedType(String group)
	{
		selectbedType.click();
		searchbox.click();
		searchbox.sendKeys(group);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void setbedCharges(String bname)
	{
		bedCharges.clear();
		bedCharges.sendKeys(bname);
	}
	
	
	public void setBedDescription(String bname)
	{
		BedDescription.clear();
		BedDescription.sendKeys(bname);
	}
	
	public void clickonBedSaveBtn()
	{
		BedSaveBtn.click();
	}
	
	public void clickoneditbutton()
	{
		editbutton.click();
	}
	
	public void setnameinsearchbox(String group)
	{
		searchfordeleteandedit.click();
		searchfordeleteandedit.sendKeys(group);
		searchfordeleteandedit.sendKeys(Keys.ENTER);
		
	}
	
	public void seteditBedName(String bname)
	{
		editBedName.click();
		editBedName.clear();
		editBedName.sendKeys(bname);
	}
	
	public void seteditselectbedType(String group) throws InterruptedException
	{
		editBedType.click();
		Thread.sleep(2000);
		searchbox1.click();
		searchbox1.sendKeys(group);
		searchbox1.sendKeys(Keys.ENTER);
		
	}
	
	public void seteditbedCharges(String bname)
	{
		editBedCharge.click();
		editBedCharge.clear();
		editBedCharge.sendKeys(bname);
	}
	
	public void seteditBedDescription(String bname)
	{
		editBedDescription.click();
		editBedDescription.clear();
		editBedDescription.sendKeys(bname);
	}
	
	public void clickonbtnEditSave()
	{
		btnEditSave.click();
	}
	
	}

