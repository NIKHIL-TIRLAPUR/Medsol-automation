package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Doctors_Doctorsdepartmentpage{
	WebDriver ldriver;

	public  Doctors_Doctorsdepartmentpage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[3]/ul[1]/li[9]/a[1]")
    WebElement doctors;
	
	@FindBy(xpath="(//li[@class='nav-item position-relative mx-xl-3 mb-3 mb-xl-0 '])[2]")
    WebElement doctordepartments;
	
	@FindBy(xpath="//a[normalize-space()='New Doctor Department']")
    WebElement newdoctordepartment;
	
	@FindBy(xpath="//input[@id='title']")
    WebElement txtdoctordepartment;
	
	@FindBy(xpath="//textarea[@id='description']")
    WebElement txtdescription;
	

	@FindBy(xpath="//button[@id='doctorDepartmentSave']")
    WebElement doctorDepartmentSavebutton;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/a[1]/*[name()='svg'][1]")
    WebElement doctorDepartmenteditbutton;
	
	@FindBy(xpath="//input[@id='editDoctorDepartmentTitle']")
    WebElement txteditdoctordepartment;
	
	@FindBy(xpath="//textarea[@id='editDoctorDepartmentDescription']")
    WebElement txteditdescription;
	
	@FindBy(xpath="//button[@id='editDoctorDepartmentSave']")
    WebElement doctorDepartmenteditSavebutton;
	
	@FindBy(xpath="//tbody/tr[1]/td[2]/div[1]/a[2]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	@FindBy(xpath="//input[@name='search']")
    WebElement txtdepartmentsearchbox;
	
	public void clickondoctors()
	{
		doctors.click();
	}
	
	public void clickondoctordepartments()
	{
		doctordepartments.click();
	}
	
	public void clickonnewdoctordepartment()
	{
		newdoctordepartment.click();
	}
	
	public void setdoctordepartment(String dept)
	{
		txtdoctordepartment.sendKeys(dept);
	}
	
	public void setdescription(String des)
	{
		txtdescription.click();
		txtdescription.sendKeys(des);
	}
	
	public void clickonsavebutton()
	{
		doctorDepartmentSavebutton.submit();
	}
	
	public void clickoneditbutton()
	{
		doctorDepartmenteditbutton.click();
	}
	
	public void seteditdoctordepartment(String edept)
	{
		txteditdoctordepartment.clear();
		txteditdoctordepartment.sendKeys(edept);
	}
	
	public void seteditdescription(String edes)
	{
		txteditdescription.click();
		txteditdescription.clear();
		txteditdescription.sendKeys(edes);
	}
	
	public void clickoneditsavebutton()
	{
		doctorDepartmenteditSavebutton.submit();
	}
	
	public void clickondeletebutton()
	{
		deletebutton.click();
	}
	
	public void clickonyesdeletebutton()
	{
		yesdeletebutton.click();
	}
	
	public void setdoctordepartmentinsearchbox(String dept)
	{
		txtdepartmentsearchbox.clear();
		txtdepartmentsearchbox.sendKeys(dept);
		txtdepartmentsearchbox.sendKeys(Keys.ENTER);
	}
	
	

}
