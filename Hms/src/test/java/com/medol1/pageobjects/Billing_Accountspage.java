package com.medol1.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Billing_Accountspage {
	
	WebDriver ldriver;

	public Billing_Accountspage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"sidebar\"]/div[3]/ul/li[5]/a")
	WebElement Billing;
	
	@FindBy(xpath="//a[.='New Account']")
	WebElement Billing_New_Account;
	
	@FindBy(xpath="//input[@name='search']")
	WebElement Billing_Search;
	
	@FindBy(xpath="//button[@id='accountantFilterBtn']")
	WebElement Billing_Filter;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement New_Account_Account;
	

	@FindBy(xpath="//textarea[@id='description']")
	WebElement New_Account_Decription;
	
	@FindBy(xpath="//input[@id='allowmarketing']")
	WebElement New_Account_Status;
	
	@FindBy(xpath="//input[@id='createDebitAccount']")
	WebElement New_Account_Type_Debit;
	
	@FindBy(xpath="//input[@id='createCreditAccount']")
	WebElement New_Account_Type_Credit;
	
	@FindBy(xpath="//button[@id='btnSave']")
	WebElement New_Account_Save;
	
	@FindBy(xpath="(//button[.='Cancel'])[1]")
	WebElement New_Account_Cancel;
	
	
	
	@FindBy(xpath="(//span[.='All'])[1]")
	WebElement Filter_Status_All;
	
	@FindBy(xpath="//li[.='Active']")
	WebElement Filter_Status_Active;
	
	@FindBy(xpath="//li[.='Deactive']")
	WebElement Filter_Status_Deactive;
	
	@FindBy(xpath="//li[.='All']")
	WebElement Filter_Type_All;
	
	@FindBy(xpath="//li[.='Debit']")
	WebElement Filter_Type_Debit;
	
	@FindBy(xpath="//li[.='Credit']")
	WebElement Filter_Type_Credit;
	
	@FindBy(xpath="//button[.='Reset']")
	WebElement Filter_Reset;
	
	
	
	
	
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	WebElement Billing_Accounts_Status;
	
	@FindBy(xpath="(//a[@title='Edit'])[1]")
	WebElement Billing_Accounts_Edit;
	
	@FindBy(xpath="//input[@id='editName']")
	WebElement Edit_Name;
	
	@FindBy(xpath="//textarea[@id='editDescription']")
	WebElement Edit_Description;
	
	@FindBy(xpath="//input[@id='editIsActive']")
	WebElement Edit_Status;
	
	@FindBy(xpath="//input[@id='editDebit']")
	WebElement Edit_Debit;
	
	@FindBy(xpath="//input[@id='editCredit']")
	WebElement Edit_Credit;
	
	@FindBy(xpath="//button[@id='editAccountSave']")
	WebElement Edit_Save;
	
	@FindBy(xpath="(//button[.='Cancel'])[2]")
	WebElement Edit_Cancel;
	
	
	@FindBy(xpath="(//a[@title='Delete'])[1]")
	WebElement Billing_Accounts_Delete;
	
	@FindBy(xpath="//button[.='Yes, Delete']")
	WebElement Delete_Yes;
	
	@FindBy(xpath="//button[.='No, Cancel']")
	WebElement Delete_Cancel;

	
	
	public void clickonBilling()
	{
		Billing.click();
	}
	
	public void clickOnNewAccount()
	{
		Billing_New_Account.click();
	}

	public void search()
	{
		Billing_Search.click();
		Billing_Search.sendKeys("joker");
	}
	
	public void filter()
	{
		Billing_Filter.click();
	}
	
	public void account()
	{
		New_Account_Account.sendKeys("56789898");
	}
	
	public void description()
	{
		New_Account_Decription.sendKeys("No Description");
	}
	
	public void status()
	{
		New_Account_Status.click();
	}
	
	public void typeDebit()
	{
		New_Account_Type_Debit.click();
	}
	
	public void typeCredit()
	{
		New_Account_Type_Credit.click();
	}
	
	public void save()
	{
		New_Account_Save.click();
	}
	
	public void cancel()
	{
		New_Account_Cancel.click();
	}

	
	
	
	
	
	public void filterStatusAll()
	{
		Filter_Status_All.click();
	}
	
	public void filterStatusActive()
	{
		Filter_Status_Active.click();
	}
	
	public void filterStatusDeactive()
	{
		Filter_Status_Deactive.click();
	}
	
	public void filterTypeAll()
	{
		Filter_Type_All.click();
	}
	
	public void filterTypeDebit()
	{
		Filter_Type_Debit.click();
	}
	
	public void filterTypeCredit()
	{
		Filter_Type_Credit.click();
	}
	
	public void filterReset()
	{
		Filter_Reset.click();
	}
	
	
	
	
	
	public void billingStatus()
	{
		 Billing_Accounts_Status.click();
	}
	
	public void billingEdit()
	{
		Billing_Accounts_Edit.click();
	}
	
	public void editAccountName()
	{
		Edit_Name.clear();
		Edit_Name.sendKeys("7898767");
	}

	public void editAccountDescription()
	{
		Edit_Description.clear();
		Edit_Description.sendKeys("NO DESCRIPTION");
	}
	
	public void editStatus()
	{
		Edit_Status.click();
	}
	
	public void editDebit()
	{
		Edit_Debit.click();
	}
	
	public void editCredit()
	{
		Edit_Credit.click();
	}

	public void editSave()
	{
		Edit_Save.click();
	}

	public void editCancel()
	{
		Edit_Cancel.click();
	}
	
	
	
	
	
	public void billingAccountDelete()
	{
		Billing_Accounts_Delete.click();
	}
	
	public void deleteYes()
	{
		Delete_Yes.click();
	}

	public void deleteCancel()
	{
		Delete_Cancel.click();
	}
	
	
	
	
	
	
	
}
