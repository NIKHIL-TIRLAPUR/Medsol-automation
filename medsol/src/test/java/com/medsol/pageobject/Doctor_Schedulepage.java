package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Doctor_Schedulepage {
	WebDriver ldriver;

	public Doctor_Schedulepage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[3]/ul[1]/li[9]/a[1]")
	WebElement doctors;

	@FindBy(xpath = "(//li[@class='nav-item position-relative mx-xl-3 mb-3 mb-xl-0 '])[3]")
	WebElement doctorSchedule;

	@FindBy(xpath = "//input[@data-datatable-filter='search']")
	WebElement SearchBox;

	@FindBy(xpath = "//a[text()='New Schedule']")
	WebElement NewShceduleBtn;

	@FindBy(xpath = "//span[@aria-labelledby='select2-doctorId-container']")
	WebElement doctorNameDropDown;

	@FindBy(xpath = "//input[@aria-controls='select2-doctorId-results']")
	WebElement SearchboxofDoctorname;

	@FindBy(xpath = "//input[@id='perPatientTime']")
	WebElement PerPatenttime;

	@FindBy(xpath = "//input[@class='numInput flatpickr-hour']")
	WebElement Hour;

	@FindBy(xpath = "//input[@class='numInput flatpickr-minute']")
	WebElement minute;

	@FindBy(xpath = "//input[@id='scheduleSave']")
	WebElement save;

	@FindBy(xpath = "//a[text()='Cancel']")
	WebElement Cancel;

	@FindBy(xpath = "//a[text()='Back']")
	WebElement Back;

	public void clickondoctors() {
		doctors.click();
	}

	public void clickondoctorSchedule() {
		doctorSchedule.click();
	}
	
	public void SetSearchBox(String doctor) {
		SearchBox.click();
		SearchBox.sendKeys(doctor);
		SearchBox.sendKeys(Keys.ENTER);
	}
	
	public void clickonNewScheduleBtn() {
		NewShceduleBtn.click();
	}
	
	public void clickondoctorNameDropDown() {
		doctorNameDropDown.click();
	}
	
	public void clickonSearchboxofDoctorname(String doctor) {
		SearchboxofDoctorname.sendKeys(doctor);
		SearchboxofDoctorname.sendKeys(Keys.ENTER);
	}
	
	public void clickonPerPatenttime() {
		PerPatenttime.click();
	}
	
	public void SetHour(String hour) {
		Hour.sendKeys(hour);
	}
	
	public void SetMunite(String min) {
		minute.sendKeys(min);
		minute.sendKeys(Keys.ENTER);
	}
	
	public void clickonsave() {
		save.submit();
	}
	
	public void clickonCancel() {
		Cancel.click();
	}
	
	public void clickonBack() {
		Back.click();
	}
	
	
	
	
}
