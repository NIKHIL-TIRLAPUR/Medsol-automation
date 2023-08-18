package com.medol1.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol1.testcases.Baseclass;

public class Billings_EmployeepayrolePage extends Baseclass{
	
WebDriver ldriver;
	
	public Billings_EmployeepayrolePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[5]/a[1]/span[2]")
    WebElement billings;
	
	@FindBy(xpath="//a[normalize-space()='Employee Payrolls']")
    WebElement EmployeePayrolls;
	
	@FindBy(xpath="//a[normalize-space()='New Employee Payroll']")
    WebElement NewEmployeePayroll;
	
	@FindBy(xpath="//input[@id='sr_no']")
    WebElement sr_no;
	
	@FindBy(xpath="//span[@id='select2-type-container']")
    WebElement selectrole;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement searchbox;
	
	@FindBy(xpath="//span[@id='select2-month-container']")
    WebElement selectmonth;
	
	@FindBy(xpath="//input[@id='year']")
    WebElement year;
	
	@FindBy(xpath="//span[@id='select2-status-container']")
    WebElement status;
	
	@FindBy(xpath="//input[@id='editBasicSalary']")
    WebElement BasicSalary;
	
	@FindBy(xpath="//input[@id='allowance']")
    WebElement allowance;
	
	@FindBy(xpath="//input[@id='deductions']")
    WebElement deductions;
	
	@FindBy(xpath="//input[@id='empPayrollSave']")
    WebElement empPayrollSave;
	
	public void clickonbillings()
	{
		billings.click();
	}
	
	public void clickonEmployeePayrolls()
	{
		EmployeePayrolls.click();
	}
	
	public void clickonNewEmployeePayroll()
	{
		NewEmployeePayroll.click();
	}
	
	
	public void setsr_no(String pass)
	{
		sr_no.click();
		sr_no.clear();
		sr_no.sendKeys(pass);
	}
	
	
	public void setselectrole(String group)
	{
		selectrole.click();
		searchbox.click();
		searchbox.sendKeys(group);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void setselectmonth(String group)
	{
		selectmonth.click();
		searchbox.click();
		searchbox.sendKeys(group);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void setyear(String pass)
	{
		year.click();
		year.sendKeys(pass);
	}
	
	public void setstatus(String group)
	{
		status.click();
		searchbox.click();
		searchbox.sendKeys(group);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void setBasicSalary(String pass)
	{
		BasicSalary.click();
		BasicSalary.sendKeys(pass);
	}
	
	public void setallowance(String pass)
	{
		allowance.click();
		allowance.sendKeys(pass);
	}
	
	public void setdeductions(String pass)
	{
		deductions.click();
		deductions.sendKeys(pass);
	}
	
	public void clickonempPayrollSave()
	{
		empPayrollSave.click();
	}
	}

