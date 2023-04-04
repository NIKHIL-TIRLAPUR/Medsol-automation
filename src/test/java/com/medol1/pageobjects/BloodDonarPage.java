package com.medol1.pageobjects;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.medsol1.testcases.Baseclass;

public class BloodDonarPage extends Baseclass {
      WebDriver ldriver;
    public BloodDonarPage(WebDriver rdriver) {
    	ldriver = rdriver;
    	PageFactory.initElements(rdriver, this);
    }

		@FindBy(xpath = "//span[normalize-space()='Blood Banks']")
		WebElement BloodBank;

		@FindBy(xpath = "//a[normalize-space()='Blood Donors']")
		 WebElement BloodDonar;
		

		@FindBy(xpath = "//a[normalize-space()='New Blood Donor']")
		WebElement NewBloodDonar;

		@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")
		WebElement Blooddonarname;

		
		@FindBy(xpath = "(//input[@id='bloodDonorAge'])[1]")
		WebElement BloodDonarAge;
		
		@FindBy(xpath = "(//span[@role='combobox'])[1]")
		WebElement Selectbloodgroup;
		
		
		
		

		@FindBy(xpath = "//select[@aria-label='Month']")
		WebElement tbselectmonth;

		@FindBy(xpath = "//input[@aria-label='Year']")
		WebElement tbselectyear;

		@FindBy(xpath = "//span[@class='arrowDown']")
		WebElement ArrowDownyear;

		@FindBy(xpath = "//span[@class='arrowDown']")
		WebElement ArrowDownMonth;

		@FindBy(xpath = "//span[@aria-label='March 3, 2020']")
		List<WebElement> tbselectdate;
		@FindBy(xpath = "(//div[@class='flatpickr-calendar animate arrowBottom arrowLeft open'])[1]")
        WebElement LastDonationdate;
		@FindBy(xpath="//button[@id='bloodDonorSave']")
		   WebElement save;

		private Object GenderBloodDonar;

		private Object date;

		private Object ArrowDown;
		public void date(String MM, String YYYY, String DD) {
			((WebElement) this.date).click();
			boolean flag = true;
			while (flag) {
				String currentYear = tbselectyear.getText();
				String expectedYear = YYYY;
				if (currentYear.contentEquals(expectedYear)) {
					((WebElement) this.ArrowDown).click();
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

		private Object DonaBloodGroup;

	private Object BloodDonarAge1;
public void BloodBank() {
	this.BloodBank.click();
}
public  void BloodDonar1() {
	this.BloodDonar.click();
}
public void NewBloodDonar () {
	this.NewBloodDonar.click();
	}


public void GenderBloodDonar() {
	this.GenderBloodDonar.equals("male") ;
	}
	public void BloodDonarAge () {
	this.BloodDonarAge.equals("23");
	}


	

public void BloodDonarName() {
 this.Blooddonarname.click();
	
}
public void LastDonationDate() {
	this.LastDonationdate.click();

}	
public void DonarBloodGroup() {
this.DonaBloodGroup.equals("A+");
	
}
public void save() {
	this.save.submit();
	}	
}	

