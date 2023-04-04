package com.medol1.pageobjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Appointementpage {
	WebDriver ldriver;

	public Appointementpage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(xpath = "//span[normalize-space()='Appointments']")
	WebElement Appointement;

	@FindBy(xpath = "//a[normalize-space()='New Appointment']")
	WebElement NewAppointement;

	@FindBy(xpath = "//label[normalize-space()='Patient:']")
	WebElement Newpatient;
	
	@FindBy(xpath = "//input[@role='searchbox']")
	WebElement sarchbox;

	@FindBy(xpath = "//label[normalize-space()='Doctor:']")
	WebElement Doctor;
	@FindBy(xpath = "//textarea[@id='problem']")
	WebElement Description;
	@FindBy(xpath = "//span[@id='select2-appointmentDepartmentId-container']")
	WebElement DoctorDepartment;

	@FindBy(xpath = "//label[normalize-space()='Date:']")
	WebElement date;
	
	@FindBy(xpath = "//span[@id='select2-appointmentPatientId-container']")
	WebElement Searchboxpatient;

	@FindBy(xpath = "//select[@aria-label='Month']")
	WebElement tbselectmonth;

	@FindBy(xpath = "//input[@aria-label='Year']")
	WebElement tbselectyear;

	@FindBy(xpath = "//span[@class='arrowUp']")
	WebElement ArrowUp;

	@FindBy(xpath = "//span[@class='arrowDown']")
	WebElement ArrowDown;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[1]")
	List<WebElement> tbselectdate;

	public void date(String MM, String YYYY, String DD) {
		this.date.click();
		boolean flag = true;
		while (flag) {
			String currentYear = tbselectyear.getText();
			String expectedYear = YYYY;
			if (currentYear.contentEquals(expectedYear)) {
				this.ArrowUp.click();
			} else {
				flag = false;
			}
		}

		Select monthDropdown = new Select(tbselectmonth);
		monthDropdown.selectByVisibleText(MM);

		for (WebElement el : tbselectdate) {
			String Date = el.getText();
			if (Date.equals(DD)) {
				el.click();
				break;
			}
		}
	}


@FindBy(xpath = "//label[normalize-space()='Date:']")
WebElement searchDoctor;

@FindBy(xpath = "//input[@id='saveAppointment']")
WebElement save;

@FindBy(xpath = "//input[@role='searchbox']")
WebElement searchDoctorDepartment;


public void Appointement() {
	this.Appointement.click();
	}

public void newAppointement() {
	this.NewAppointement.click();
}

public void selectpatient() {
	this.Searchboxpatient.click();
	this.sarchbox.click();
	this.sarchbox.sendKeys("M11");
this.sarchbox.sendKeys(Keys.ENTER);
}
public void Doctordepartement() {
	this.DoctorDepartment.click();
	this.searchDoctorDepartment.click();
	this.searchDoctorDepartment.sendKeys("General");
this.searchDoctorDepartment.sendKeys(Keys.ENTER);

}
public void Doctor() {
	this.Doctor.click();
	this.searchDoctor.sendKeys();
this.searchDoctor.sendKeys(Keys.ENTER);
}

public void Description() {
	this.Description.click();
	this.Description.sendKeys("abc");
	
}
public void save() {
	this.save.submit();
	}
	




}


	
