package com.medol1.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Finances_Income {
	
	WebDriver ldriver;

	public Finances_Income(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[.='Finances']")
	WebElement Finances;
	
	@FindBy(xpath="//a[@id='dropdownMenuButton']")
	WebElement Finances_Incomes_Actions;
	
	@FindBy(xpath="//a[.='New Income']")
	WebElement Actions_NewIncome;
	
	
	@FindBy(xpath="//span[@id='select2-incomeId-container']")
	WebElement NewIncome_IncomeHead;
	
	@FindBy(xpath="(//li[@class='select2-results__option select2-results__option--selectable'])[1]")
	WebElement IncomeHead_Select;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement NewIncome_Name;
	
	@FindBy(xpath="//*[@id=\"incomeDate\"]")
	WebElement NewIncome_Date;
	
	@FindBy(xpath="(//span[.='4'])[1]")
	WebElement Date_Date;
	
	@FindBy(xpath="//input[@id='invoice_number']")
	WebElement NewIncome_InvoiceNumber;
	
	@FindBy(xpath="//input[@id='incomeAmount']")
	WebElement NewIncome_Amount;
	
	@FindBy(xpath="(//*[@id=\"profileImageIcon\"])[1]")
	WebElement NewIncome_Attachment;
	
	@FindBy(xpath="//textarea[@id='description']")
	WebElement NewIncome_Description;
	
	@FindBy(xpath="//button[@id='incomeSave']")
	WebElement NewIncome_Save;
	
	
	
	
	@FindBy(xpath="(//a[@title='Edit'])[1]")
	WebElement NewIncome_Edit;
	
	@FindBy(xpath="//*[@id=\"select2-editIncomeHeadId-container\"]")
	WebElement NewIncome_EditIncomeHead;
	
	@FindBy(xpath="//li[.='Hospital Charges']")
	WebElement IncomeHead_EditSelect;
	
	@FindBy(xpath="//input[@id='editIncomeName']")
	WebElement NewIncome_EditName;
	
	@FindBy(xpath="//input[@id='editIncomeDate']")
	WebElement NewIncome_EditDate;
	
	@FindBy(xpath="(//span[.='10'])[3]")
	WebElement Date_EditDate;
	
	@FindBy(xpath="//input[@id='editIncomeInvoiceNumber']")
	WebElement NewIncome_EditInvoiceNumber;
	
	@FindBy(xpath="//input[@id='editIncomeAmount']")
	WebElement NewIncome_EditAmount;
	
	@FindBy(xpath="(//span[@class='picker-edit rounded-circle text-gray-500 fs-small'])[3]")
	WebElement NewIncome_EditAttachment;
	
	@FindBy(xpath="//textarea[@id='editIncomeDescription']")
	WebElement NewIncome_EditDescription;
	
	
	@FindBy(xpath="//button[@id='editIncomeSave']")
	WebElement NewIncome_EditSave;
	
	
	
	@FindBy(xpath="(//a[@title='Delete'])[1]")
	WebElement NewIncome_Delete;
	
	@FindBy(xpath="//button[.='Yes, Delete']")
	WebElement NewIncome_YesDelete;
	
	@FindBy(xpath="//button[.='No, Cancel']")
	WebElement NewIncome_CancelDelete;
	
	
	
	
	
	public void clickOnFinances()
	{
		Finances.click();
	}
	

	public void clickOnFinancesActions()
	{
		Finances_Incomes_Actions.click();
	}
	

	public void clickOnActions_NewIncome()
	{
		Actions_NewIncome.click();
	}
	

	public void clickOnIncomeHead()
	{
		NewIncome_IncomeHead.click();
	}
	
	public void selectIncomeHead()
	{
		IncomeHead_Select.click();
	}
	

	public void clickOnName()
	{
		NewIncome_Name.sendKeys("ghajini");
	}
	

	public void clickOnDate()
	{
		NewIncome_Date.click();
	}
	
	public void selectDate()
	{
		Date_Date.click();
	}
	
	public void clickOnInvoiceNumber()
	{
		NewIncome_InvoiceNumber.sendKeys("678");
	}
	
	
	
	public void clickOnAmount()
	{
		NewIncome_Amount.sendKeys("5500");
	}

	
	
	public void clickOnAttachment()
	{
		NewIncome_Attachment.click();
	}
	
	public void clickOnDescription()
	{
		NewIncome_Description.sendKeys("n/a");
	}
	
	public void clickOnSave()
	{
		NewIncome_Save.click();
	}

	public void clickOnEdit()
	{
		NewIncome_Edit.click();
	}
	
	public void  clickOnEditIncomeHead()
	{
		NewIncome_EditIncomeHead.click();
	}
	
	public void selectEditIncomeHead()
	{
		IncomeHead_EditSelect.click();
	}
	
	public void clickOnEditName()
	{
		NewIncome_EditName.clear();
		NewIncome_EditName.sendKeys("orange");
	}
	
	public void clickOnEditDate()
	{
		NewIncome_EditDate.click();
	}
	
	public void selectEditDate()
	{
		Date_EditDate.click();
	}
	
	public void clickOnEditInvoiceNumber()
	{
		NewIncome_EditInvoiceNumber.clear();
		NewIncome_EditInvoiceNumber.sendKeys("678");
	}
	
	
	public void clickOnEditAmount()
	{
		NewIncome_EditAmount.clear();
		NewIncome_EditAmount.sendKeys("77000");
	}
	
	public void clickOnEditAttachment()
	{
		NewIncome_EditAttachment.click();
	}
	
	public void clickOnEditDescription()
	{
		NewIncome_EditDescription.clear();
		NewIncome_EditDescription.sendKeys("no description");
	}
	
	public void clickOnEditSave()
	{
		NewIncome_EditSave.click();
	}
	
	
	public void clickOnDelete()
	{
		NewIncome_Delete.click();
	}
	
	public void clickOnYesDelete()
	{
		NewIncome_YesDelete.click();
	}
	
	public void clickOnCancelDelete()
	{
		NewIncome_CancelDelete.click();
	}
}
