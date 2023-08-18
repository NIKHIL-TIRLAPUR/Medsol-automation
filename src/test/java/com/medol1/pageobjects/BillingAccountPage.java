package com.medol1.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingAccountPage {
WebDriver ldriver;
	
	public BillingAccountPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[3]/ul[1]/li[5]/a[1]")
    WebElement billings;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
    WebElement newaccount;
	
	@FindBy(xpath="//input[@id='name']")
    WebElement txtaccount;
	
	@FindBy(xpath="//textarea[@id='description']")
    WebElement txtdescription;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement status;
	
	@FindBy(xpath="//input[@id='createDebitAccount']")
    WebElement accounttype;
	
	@FindBy(xpath="//button[@id='btnSave']")
    WebElement savebutton1;
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/a[2]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[@class='swal-button swal-button--confirm']")
    WebElement yesdeletebutton;
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/a[1]//*[name()='svg']")
    WebElement editbutton;
	
	@FindBy(xpath="//textarea[@id='editName']")
    WebElement editname;
	
	@FindBy(xpath="//textarea[@id='editDescription']")
    WebElement editdescription;
		

	
	public void clickonbillings()
	{
		billings.click();
	}
	
	public void clickonnewaccount()
	{
		newaccount.click();
	}
	
	public void setaccount(String name)
	{
		txtaccount.sendKeys(name);
	}
	
	public void setdescription(String des)
	{
		txtdescription.sendKeys(des);
	}
	
	public void setstatus()
	{
		status.click();
	}
	
	public void setaccounttype()
	{
		accounttype.click();
	}
	
	public void clickonsavebutton()
	{
		savebutton1.click();
	}	
	
	public void clickondeletebutton()
	{
		deletebutton.click();
	}	
	
	public void clickonyesdeletebutton()
	{
		yesdeletebutton.click();
	}	
	
	public void clickoneidtbutton()
	{
		editbutton.click();
	}	
	
	public void setchangedbillingname(String changedbillingname)
	{
		editname.clear();
		editname.sendKeys("changedbillingname");
	}	

	public void setchangedbillingdescription(String changedbillingdescription)
	{
		editdescription.clear();
		editdescription.sendKeys("changedbillingdescription");
	}		
}
