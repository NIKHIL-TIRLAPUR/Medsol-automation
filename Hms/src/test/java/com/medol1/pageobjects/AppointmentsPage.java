package com.medol1.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AppointmentsPage {
	
	WebDriver ldriver;

	public AppointmentsPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[.='Appointments']")
	WebElement Appointments;
	
	@FindBy(xpath="//a[.='New Appointment']")
	WebElement NewAppointments;
	
	@FindBy(xpath="//li[.='M 1']")
	WebElement NewAppointments_PatientName;
	

	
	
	@FindBy(xpath="//span[@id='select2-appointmentDepartmentId-container']")
	WebElement NewAppointments_DocDept;

	@FindBy(xpath="//li[.='Cardiology']")
	WebElement NewAppointments_DocDept1;

	@FindBy(xpath="//span[@id='select2-appointmentDoctorId-container']")
	WebElement NewAppointments_Doc;
	
	
	@FindBy(xpath="//input[@id='appointmentOpdDate']")
	WebElement NewAppointments_Date;
	
	@FindBy(xpath="//span[@class='arrowDown']")
	WebElement NewAppointments_Year;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div/div/select")
	WebElement NewAppointments_Month;
	
	@FindBy(xpath="//textarea[@id='problem']")
	WebElement NewAppointments_Description;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement NewAppointments_Satus;
	
	@FindBy(xpath="//input[@id='saveAppointment']")
	WebElement NewAppointments_Save;
	
	@FindBy(xpath="//a[.='Cancel']")
	WebElement NewAppointments_Cancel;
	
	public void clickOnAppointments()
	{
		 Appointments.click();
	}
	
	public void clickOnNewAppointments()
	{
		NewAppointments.click();
	}
	
	public void clickOnPatientName()
	{
		NewAppointments_PatientName.click();
	}
	
	
	
	public void clickOnDocDept()
	{
		NewAppointments_DocDept.click();
	}
	
	public void selectDocDept()
	{
		NewAppointments_DocDept1.click();
	}
	
	public void clickOnDoc()
	{
		NewAppointments_Doc.click();
	}
	
	public void clickOnDate()
	{
		NewAppointments_Date.click();
	}
	
	public void selectYear()
	{
		NewAppointments_Year.click();
	}
	
	public void clickOnMonth()
	{
		NewAppointments_Month.click();
	}
	
	public void clickOnDescription()
	{
		NewAppointments_Description.sendKeys("appointment is done");
	}
	
	public void clickOnStatus()
	{
		NewAppointments_Satus.click();
	}
	
	public void clickOnSave()
	{
		NewAppointments_Save.click();
	}

	
}
