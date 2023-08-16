package com.medol1.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BloodBank_BloodDonors {
	
	WebDriver ldriver;

	public BloodBank_BloodDonors(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[.='Blood Banks']")
	WebElement Blood_Bank;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[3]/div[1]/header/nav/div/div/ul/li[19]/a")
	WebElement BloodBank_BloodDonor;
	
	@FindBy(xpath="//input[@name='search']")
	WebElement BloodBank_Search;
	
	@FindBy(xpath="//a[.='New Blood Donor']")
	WebElement BloodBank_NewBloodDonor;
	
	
	
	@FindBy(xpath="//input[@id='bloodDonorName']")
	WebElement NewBloodDonor_Name;
	
	@FindBy(xpath="//input[@id='bloodDonorAge']")
	WebElement NewBloodDonor_Age;
	
	@FindBy(xpath="//input[@id='bloodDonorMale']")
	WebElement NewBloodDonor_Gender_Male;
	
	@FindBy(xpath="//input[@id='bloodDonorFemale']")
	WebElement NewBloodDonor_Gender_Female;
	
	@FindBy(xpath="(//span[@title='Select Blood Group'])[1]")
	WebElement NewBloodDonor_BloodGroup;
	
	@FindBy(xpath="//li[.='5']")
	WebElement BloodGroup_5;
	
	@FindBy(xpath="//li[.='A']")
	WebElement BloodGroup_A;
	
	@FindBy(xpath="//li[.='A+']")
	WebElement BloodGroup_APositive;
	
	@FindBy(xpath="//li[.='AB-']")
	WebElement BloodGroup_ABNegative;
	
	@FindBy(xpath="//li[.='AB+']")
	WebElement BloodGroup_ABPositive;
	
	@FindBy(xpath="//li[.='B-']")
	WebElement BloodGroup_BNegative;
	
	@FindBy(xpath="//li[.='b+']")
	WebElement BloodGroup_bPositive;
	
	@FindBy(xpath="//li[.='o']")
	WebElement BloodGroup_O;
	
	@FindBy(xpath="//li[.='o-']")
	WebElement BloodGroup_oNegative;
	
	@FindBy(xpath="//li[.='O+']")
	WebElement BloodGroup_oPositive;
	
	
	
	@FindBy(xpath="//input[@id='lastDonationDate']")
	WebElement NewBloodDonor_DonationDate;
	
	@FindBy(xpath="(//span[.='27'])[2]")
	WebElement Donation_Date;
	
	
	@FindBy(xpath="//span[@class='arrowDown']")
	WebElement Donation_Year;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div/div/select")
	WebElement Donation_Month;
	
	@FindBy(xpath="//*[@id=\"bloodDonorSave\"]")
	WebElement NewBloodDonor_save;
	
	@FindBy(xpath="(//button[.='Cancel'])[1]")
	WebElement NewBloodDonor_Cancel;
	
	
	
	
	@FindBy(xpath="(//a[@title='Edit'])[1]")
	WebElement BloodBank_BloodDonor_Edit;
	
	@FindBy(xpath="//input[@id='editBloodDonorName']")
	WebElement EditBloodDonor_Name;
	
	@FindBy(xpath="//input[@id='editBloodDonorAge']")
	WebElement EditBloodDonor_Age;
	
	@FindBy(xpath="//input[@id='editBloodDonorMale']")
	WebElement EditBloodDonor_Gender_Male;
	
	@FindBy(xpath="//input[@id='editBloodDonorFemale']")
	WebElement EditBloodDonor_Gender_Female;
	
	@FindBy(xpath="//span[@id='select2-editDonorBloodGroup-container']")
	WebElement EditBloodDonor_BloodGroup;
	
	@FindBy(xpath="//li[@id='select2-editDonorBloodGroup-result-ze2x-A']")
	WebElement EditBloodGroup_5;
	  
	@FindBy(xpath="//li[.='A']")
	WebElement EditBloodGroup_A;
	
	@FindBy(xpath="//li[@id='select2-editDonorBloodGroup-result-kbup-A+']")
	WebElement EditBloodGroup_APlus;
	
	@FindBy(xpath="//li[@id='select2-editDonorBloodGroup-result-mzb4-AB-']")
	WebElement EditBloodGroup_ABNegative;
	
	@FindBy(xpath="//li[@id='select2-editDonorBloodGroup-result-wwgw-AB+']")
	WebElement EditBloodGroup_ABPositive;
	
	@FindBy(xpath="select2-editDonorBloodGroup-result-drmb-B-")
	WebElement EditBloodGroup_BNegative;
	
	@FindBy(xpath="//*[@id=\"select2-editDonorBloodGroup-result-aewu-b+\"]")
	WebElement EditBloodGroup_bPositive;
	
	@FindBy(xpath="//li[@id='select2-editDonorBloodGroup-result-2it8-o']")
	WebElement EditBloodGroup_O;
	
	@FindBy(xpath="//li[@id='select2-editDonorBloodGroup-result-oy2c-o-']")
	WebElement EditBloodGroup_oNegative;
	
	@FindBy(xpath="//li[@id='select2-editDonorBloodGroup-result-kzri-O+']")
	WebElement EditBloodGroup_oPositive;
	
	
	
	@FindBy(xpath="//input[@id='editLastDonationDate']")
	WebElement EditBloodDonor_DonationDate;
	
	@FindBy(xpath="(//span[@class='arrowDown'])[2]")
	WebElement EditDonation_Year;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div/div/select")
	WebElement EditDonation_Month;
	
	@FindBy(xpath="//span[@class='flatpickr-day selected']")
	WebElement EditDonation_Date;
	
	@FindBy(xpath="//button[@id='editBloodDonorSave']")
	WebElement EditBloodDonor_save;
	
	@FindBy(xpath="(//button[.='Cancel'])[2]")
	WebElement EditBloodDonor_Cancel;
	
	
	
	@FindBy(xpath="(//a[@title='Delete'])[1]")
	WebElement BloodBank_BloodDonor_Delete;
	
	@FindBy(xpath="//button[.='Yes, Delete']")
	WebElement BloodDonor_YesDelete;
	
	@FindBy(xpath="//button[.='No, Cancel']")
	WebElement BloodDonor_CancelDelete;
	
	
	public void clickOnBloodBank()
	{
		Blood_Bank.click();
	}
	
	
	
	public void clickOnBloodDonor()
	{
		BloodBank_BloodDonor.click();
	}
	
	public void bloodBank_Search()
	{
		BloodBank_Search.click();
		BloodBank_Search.sendKeys("orange");
	}
	
	public void clickOnNewBloodDonor()
	{
		BloodBank_NewBloodDonor.click();
	}
	
	public void enterBloodDonorName()
	{
		NewBloodDonor_Name.sendKeys("orange");
	}
	
	public void enterBloodDonorAge()
	{
		NewBloodDonor_Age.sendKeys("44");
	}
	
	public void selectGenderMale()
	{
		NewBloodDonor_Gender_Male.click();
	}
	
	public void selectGenderFemale()
	{
		NewBloodDonor_Gender_Female.click();
	}
	
	public void clickOnBloodGroup()
	{
		NewBloodDonor_BloodGroup.click();
	}
	
	public void bloodGroup5()
	{
		BloodGroup_5.click();
	}
	
	public void bloodGroupA()
	{
		BloodGroup_A.click();
	}
	
	public void bloodGroupA_Positive()
	{
		BloodGroup_APositive.click();
	}
	
	public void bloodGroupAB_Negative()
	{
		BloodGroup_ABNegative.click();
	}
	
	public void bloodGroupAB_Positive()
	{
		BloodGroup_ABPositive.click();
	}
	
	
	
	public void bloodGroupB_Negative()
	{
		BloodGroup_BNegative.click();
	}
	
	
	
	public void bloodGroupB_Positive()
	{
		BloodGroup_bPositive.click();
	}
	
	public void bloodGroup_O()
	{
		BloodGroup_O.click();
	}
	
	public void bloodGroupO_Negative()
	{
		BloodGroup_oNegative.click();
	}
	
	public void bloodGroupO_Positive()
	{
		BloodGroup_oPositive.click();
	}
	
	public void clickOnDonationDate()
	{
		 NewBloodDonor_DonationDate.click();
	}
	
	public void selectDate()
	{
		Donation_Date.click();
	}
	
	public void selectYear()
	{
		Donation_Year.click();
	}
	
	public void selectMonth()
	{
		Donation_Month.click();
	}
	
	public void clickOnSaveNewBloodDonor()
	{
		NewBloodDonor_save.click();
	}
	
	public void clickOnCancelNewBloodDonor()
	{
		NewBloodDonor_Cancel.click();
	}
	
	
	
	
	
	
	public void clickOnEditBloodDonor()
	{
		 BloodBank_BloodDonor_Edit.click();
	}
	
	public void editBloodDonorName()
	{
		EditBloodDonor_Name.clear();
		EditBloodDonor_Name.sendKeys("apple");
	}
	
	public void editBloodDonorAge()
	{
		EditBloodDonor_Age.clear();
		EditBloodDonor_Age.sendKeys("26");
	}
	
	public void editGender()
	{
		 EditBloodDonor_Gender_Male.click();
	}
	
	public void clickOnEditBloodGroup()
	{
		EditBloodDonor_BloodGroup.click();
	}
	
	public void editBloodGroup_A()
	{
		EditBloodGroup_A.click();
	}
	
	
	
	public void clickOnEditDonationDate()
	{
		EditBloodDonor_DonationDate.click();
	}
	
	public void selectEditDate()
	{
		EditDonation_Date.click();
	}
	
	public void selectEditYear()
	{
		EditDonation_Year.click();
	}
	
	public void selectEditMonth()
	{
		EditDonation_Month.click();
	}
	
	public void clickOnEditSaveNewBloodDonor()
	{
		EditBloodDonor_save.click();
	}
	
	public void clickOnEditCancelNewBloodDonor()
	{
		NewBloodDonor_Cancel.click();
	}
	
	
	
	public void clickOnDelete()
	{
		BloodBank_BloodDonor_Delete.click();
	}
	
	public void clickOnYesDelete()
	{
		BloodDonor_YesDelete.click();
	}
	
	public void clickOnCancelDelete()
	{
		BloodDonor_CancelDelete.click();
	}

	
	
	
	
	
	
	

}
