package com.medol1.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Billing_Paymentspage {
	
	WebDriver ldriver;

	public Billing_Paymentspage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

	@FindBy(xpath="//*[@id=\"sidebar\"]/div[3]/ul/li[5]/a")
	WebElement Billing;
	
	@FindBy(xpath="//*[@id=\"nav-header\"]/div/div/ul/li[11]/a")
	WebElement Billings_Payments;
	
	
	
	@FindBy(xpath="//a[@id='dropdownMenuButton']")
	WebElement Payments_Actions;
	
	@FindBy(xpath="//a[.='New Payment']")
	WebElement Actions_NewPayment;
	
	
	
	@FindBy(xpath="//*[@id=\"select2-accountId-container\"]")
	WebElement NewPayment_Accounts;
	
	@FindBy(xpath="//li[.='3342619884']")
	WebElement NewPayment_SelectAccounts;
	
	@FindBy(xpath="//input[@id='paymentDate']")
	WebElement NewPayment_PaymentDate;
	

	@FindBy(xpath="//span[@class='arrowUp']")
	WebElement PaymentDate_Year;
	
	@FindBy(xpath="//select[@class='flatpickr-monthDropdown-months']")
	WebElement PaymentDate_Month;
	
	@FindBy(xpath="(//span[.='3'])[1]")
	WebElement PaymentDate_Date;

	
	@FindBy(xpath="//input[@id='pay_to']")
	WebElement NewPayment_PayTo;
	
	@FindBy(xpath="//input[@id='amount']")
	WebElement NewPayment_Amount;
	
	@FindBy(xpath="//textarea[@id='description']")
	WebElement NewPayment_Description;
	
	@FindBy(xpath="//input[@id='btnPaymentSave']")
	WebElement NewPayments_Save;
	
	@FindBy(xpath="//a[.='Cancel']")
	WebElement NewPayments_Cancel;
	
	
	
	
	@FindBy(xpath="(//a[@title='View'])[1]")
	WebElement Payments_View;
	
	@FindBy(xpath="//*[@id=\"showPayment\"]/div/div/div[1]/button")
	WebElement View_Close;
	
	
	
	
	
	@FindBy(xpath="(//a[@title='Edit'])[1]")
	WebElement Payments_Edit;
	
	@FindBy(xpath="//input[@id='pay_to']")
	WebElement Edit_PayTo;
	
	@FindBy(xpath="//input[@id='btnPaymentSave']")
	WebElement Edit_Save;
	
	
	@FindBy(xpath="(//a[@title='Delete'])[1]")
	WebElement Payments_Delete;
	
	@FindBy(xpath="//button[.='Yes, Delete']")
	WebElement Payments_DeleteYes;
	
	@FindBy(xpath="//button[.='No, Cancel']")
	WebElement Payments_DeleteCancel;
	
	
	
	public void cliclOnBilling()
	{
		Billing.click();
	}
	
	public void clickOnPayments()
	{
		Billings_Payments.click();
	}

	public void clickOnActions()
	{
		Payments_Actions.click();
	}

	public void clickOnNewPayments()
	{
		Actions_NewPayment.click();
	}

	public void clickOnNewPaymentsAccounts()
	{
		NewPayment_Accounts.click();
	}

	public void selectAccountNumber()
	{
		NewPayment_SelectAccounts.click();
	}

	public void clickOnAccountDate()
	{
		NewPayment_PaymentDate.click();
	}

	public void clickOnAccountsYear()
	{
		PaymentDate_Year.click();
	}

	public void clickOnAccountsMonth()
	{
		PaymentDate_Month.click();
	}

	public void clickOnAccountsDate()
	{
		PaymentDate_Date.click();
	}

	public void clickOnPayTo()
	{
		NewPayment_PayTo.sendKeys("Joker");
	}

	public void clickOnAmount()
	{
		NewPayment_Amount.sendKeys("3500");
	}

	public void clickOnDescription()
	{
		NewPayment_Description.sendKeys("Payment Done");
	}

	public void clickOnSave()
	{
		NewPayments_Save.click();
	}
	
	
	
	
	public void clickOnView()
	{
		Payments_View.click();
	}
	
	public void clickOnViewClose()
		{
		View_Close.click();
		}
	
	
	public void clickOnEdit()
	{
		Payments_Edit.click();	
	}
	

	public void clickOnEditPayTo()
	{
		Edit_PayTo.clear();
		Edit_PayTo.sendKeys("DarkLord");
	}
	
	public void clickOnEditSave()
		{
			Edit_Save.click();
		}
	
	
	public void clickOnDelete()
	{
		Payments_Delete.click();
	}
	
	public void clickOnDeleteYes()
	{
		Payments_DeleteYes.click();
	}
	
}

