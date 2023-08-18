package com.medol1.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol1.testcases.Baseclass;

public class BloodBank_BloodDonationPage extends Baseclass 
{

	WebDriver ldriver;
	public BloodBank_BloodDonationPage(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//span[normalize-space()='Blood Banks']")
    WebElement Bloodbankbutton;
	
	@FindBy(xpath="//a[normalize-space()='Blood Donations']")
    WebElement Blooddonations;
	
	@FindBy(xpath="//a[normalize-space()='New Blood Donation']")
    WebElement NewBlooddonation;
	
	@FindBy(xpath="//span[@id='select2-donationDonorName-container']")
    WebElement selectdonorname;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement txtsearchbox;
	
	
	
	@FindBy(xpath="//input[@id='donationBags']")
    WebElement txtbloodbags;
	
	@FindBy(xpath="//button[@id='bloodDonationSave']")
    WebElement savebutton;
	
	@FindBy(xpath="//a[@title='Edit']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	@FindBy(xpath="//span[@id='select2-editDonationDonorName-container']")
    WebElement editselectdonorname;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement txteditsearchbox;
	
	@FindBy(xpath="//input[@id='editDonationBags']")
    WebElement txteditbloodbags;
	
	@FindBy(xpath="//button[@id='editBloodDonationSave']")
    WebElement editsavebutton;
	
	@FindBy(xpath="//input[@name='search']")
    WebElement txtsearchboxfordelete;
	
	@FindBy(xpath="//a[@title='Delete']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	
	public void clickonBloodbank()
	{
		Bloodbankbutton.click();
	}
	
	public void clickonBlooddonations()
	{
		Blooddonations.click();
	}
	
	public void clickonNewBlooddonation()
	{
		NewBlooddonation.click();
	}
	
	public void setdonorname(String name)
	{
		selectdonorname.click();
		txtsearchbox.click();
		txtsearchbox.sendKeys(name);
		txtsearchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void setnumberofbloodbagdonated(String bag)
	{
		txtbloodbags.clear();
		txtbloodbags.sendKeys(bag);
		
	}
	
	public void clickonsave()
	{
		savebutton.click();
	}
	
	public void clickonedit()
	{
		editbutton.click();
	}
	
	public void clickoneditBlooddonations()
	{
		editbutton.click();
	}
	
	public void seteditdonorname(String ename)
	{
		editselectdonorname.click();
		txteditsearchbox.click();
		txteditsearchbox.sendKeys(ename);
		txteditsearchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void seteditnumberofbloodbagdonated(String bag)
	{
		txteditbloodbags.clear();
		txteditbloodbags.sendKeys(bag);
		
	}
	
	public void clickoneditsave()
	{
		editsavebutton.click();
	}
	
	public void setnameinthesearchboxfordelete(String dname)
	{
		txtsearchboxfordelete.click();
		
		txtsearchboxfordelete.sendKeys(dname);
		txtsearchboxfordelete.sendKeys(Keys.ENTER);
	}
	
	public void clickondeletebutton()
	{
		deletebutton.click();
	}
	
	public void clickonyesdeletebutton()
	{
		yesdeletebutton.click();
	}
	}
