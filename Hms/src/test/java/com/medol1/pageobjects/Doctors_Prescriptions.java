package com.medol1.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Doctors_Prescriptions {
	
	WebDriver ldriver;

	public Doctors_Prescriptions(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[.='Doctors']")
	WebElement Doctors;
	
	@FindBy(xpath="(//li[@class='nav-item position-relative mx-xl-3 mb-3 mb-xl-0 '])[4]")
	WebElement Doctors_Prescriptions;
	
	@FindBy(xpath="//a[.='New Prescription']")
	WebElement NewPrescriptions;
	
	
	
	
	@FindBy(xpath="//span[@id='select2-prescriptionPatientId-container']")
	WebElement NewPrescription_PatientName;
	
	@FindBy(xpath="(//li[@class='select2-results__option select2-results__option--selectable'])[1]")
	WebElement NewPrescription_SelectPatientName;

	@FindBy(xpath="//span[@id='select2-prescriptionDoctorId-container']")
	WebElement NewPrescription_Doctors;

	@FindBy(xpath="//input[@id='health_insurance']")
	WebElement NewPrescription_HealthInsurance;

	@FindBy(xpath="//input[@id='low_income']")
	WebElement NewPrescription_LowIncome;

	@FindBy(xpath="//input[@id='reference']")
	WebElement NewPrescription_Reference;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement NewPrescription_Status;
	
	
	
	
	
	@FindBy(xpath="//input[@id='high_blood_pressure']")
	WebElement NewPrescription_PhysicalInformationBP;
	
	@FindBy(xpath="//input[@id='food_allergies']")
	WebElement NewPrescription_PhysicalInformation_FoodAllergies;
	
	@FindBy(xpath="//input[@id='tendency_bleed']")
	WebElement NewPrescription_PhysicalInformation_TendencyBleed;
	
	@FindBy(xpath="//input[@id='heart_disease']")
	WebElement NewPrescription_PhysicalInformation_HeartDisease;
	
	@FindBy(xpath="//input[@id='diabetic']")
	WebElement NewPrescription_PhysicalInformation_Diabetic;
	
	@FindBy(xpath="//input[@id='medical_history']")
	WebElement NewPrescription_PhysicalInformation_MedicalHistory;
	
	@FindBy(xpath="//input[@id='female_pregnancy']")
	WebElement NewPrescription_PhysicalInformation_FemalePregnancy;
	
	@FindBy(xpath="//input[@id='breast_feeding']")
	WebElement NewPrescription_PhysicalInformation_BreastFeeding;
	
	@FindBy(xpath="//input[@id='current_medication']")
	WebElement NewPrescription_PhysicalInformation_CurrentMedication;
	
	@FindBy(xpath="//input[@id='surgery']")
	WebElement NewPrescription_PhysicalInformation_Surgery;
	
	@FindBy(xpath="//input[@id='accident']")
	WebElement NewPrescription_PhysicalInformation_Accident;
	
	@FindBy(xpath="//input[@id='others']")
	WebElement NewPrescription_PhysicalInformation_Others;
	
	@FindBy(xpath="//input[@id='plus_rate']")
	WebElement NewPrescription_PhysicalInformation_PulseRate;
	
	@FindBy(xpath="//input[@id='temperature']")
	WebElement NewPrescription_PhysicalInformation_Temperature;
	
	@FindBy(xpath="//textarea[@id='problem_description']")
	WebElement NewPrescription_PhysicalInformation_ProblemDescription;
	
	
	
	
	
	
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement NewPrescription_NewMedicines_NewMedicines;
	
	@FindBy(xpath="//input[@id='medicineNameId']")
	WebElement NewPrescription_NewMedicines_Medicines;
	
	@FindBy(xpath="(//span[@class='select2-selection select2-selection--single'])[6]")
	WebElement NewPrescription_NewMedicines_Category;
	
	@FindBy(xpath="//li[@id='select2-prescriptionMedicineCategoryId-result-z0v1-1']")
	WebElement NewPrescription_NewMedicines_SelectCategory;

	@FindBy(xpath="//span[@id='select2-prescriptionMedicineBrandId-container']")
	WebElement NewPrescription_NewMedicines_Brand;

	@FindBy(xpath="//li[@id='select2-prescriptionMedicineCategoryId-result-m8lt-2']")
	WebElement NewPrescription_NewMedicines_SelectBrand;
	
	@FindBy(xpath="//input[@id='salt_composition']")
	WebElement NewPrescription_NewMedicines_SaltComposition;
	
	@FindBy(xpath="//input[@id='buying_price']")
	WebElement NewPrescription_NewMedicines_BuyingPrice;
	
	@FindBy(xpath="//input[@id='selling_price']")
	WebElement NewPrescription_NewMedicines_SellingPrice;
	
	@FindBy(xpath="//textarea[@id='side_effects']")
	WebElement NewPrescription_NewMedicines_SideEffects;
	
	@FindBy(xpath="//textarea[@id='description']")
	WebElement NewPrescription_NewMedicines_Description;
	
	@FindBy(xpath="//button[@id='prescriptionMedicineSave']")
	WebElement NewPrescription_NewMedicines_Save;
	
	@FindBy(xpath="(//button[.='Cancel'])[1]")
	WebElement NewPrescription_NewMedicines_Cancel;
	
	
	
	@FindBy(xpath="//a[@id='addPrescriptionMedicineBtn']")
	WebElement NewPrescription_Medicines_Add;
	
	@FindBy(xpath="//span[@id='select2-medicine-hs-container']")
	WebElement NewPrescription_Medicines_Medicine;
	
	@FindBy(xpath="//li[@id='select2-medicine-hs-result-m7qu-4']")
	WebElement NewPrescription_SelectMedicines;
	
	@FindBy(xpath="//input[@id='prescriptionMedicineNameId']")
	WebElement NewPrescription_Medicines_Dosage;
	
	@FindBy(xpath="//input[@id='prescriptionMedicineDayId']")
	WebElement NewPrescription_Medicines_Day;
	
	@FindBy(xpath="//span[@id='select2-time-x3-container']")
	WebElement NewPrescription_Medicines_Time;
	
	@FindBy(xpath="//li[.='After Meal']")
	WebElement NewPrescription_Medicines_SelectTime;
	
	@FindBy(xpath="NewPrescription_Medicines_SelectTime")
	WebElement NewPrescription_Medicines_Comment;
	
	@FindBy(xpath="(//a[@class='delete-prescription-medicine-item btn px-1 text-danger fs-3 pe-0'])[1]")
	WebElement NewPrescription_Medicines_Delete;
	
	
	
	
	
	
	@FindBy(xpath="//textarea[@id='test']")
	WebElement NewPrescription_Test;
	
	@FindBy(xpath="//textarea[@id='advice']")
	WebElement NewPrescription_Advice;
	
	@FindBy(xpath="//input[@type='number']")
	WebElement NewPrescription_NextVisit;
	
	@FindBy(xpath="//span[@id='select2-prescriptionTime-container']")
	WebElement NewPrescription_NextVisitInDaysMonthsYear;
	
	@FindBy(xpath="//span[@title='Days']")
	WebElement NewPrescription_SelectNextVisitInDaysMonthsYear;
	
	@FindBy(xpath="//button[@class='btn btn-primary me-2 btnPrescriptionSave']")
	WebElement NewPrescription_Save;
	
	@FindBy(xpath="//a[.='Cancel']")
	WebElement NewPrescription_Cancel;
	
	
	
	
	
	
	
	public void clickOnDoctors()
	{
		Doctors.click();
	}

	public void clickOnPrescription()
	{
		Doctors_Prescriptions.click();
	}
	
	public void clickOnNewPrescription()
	{
		NewPrescriptions.click();
	}
	
	
	
	
	
	
	
	
	public void clickOnPatient()
	{
		NewPrescription_PatientName.click();
	}
	
	public void selectpatient()
	{
		NewPrescription_SelectPatientName.click();
	}
	
	public void clickOnNewPrescriptionDoctor()
	{
		NewPrescription_Doctors.click();
	}
	
	public void clickOnHealthInsurance()
	{
		NewPrescription_HealthInsurance.sendKeys("N/a");
	}
	
	public void clickOnLowIncome()
	{
		NewPrescription_LowIncome.sendKeys("N/A");
	}
	
	public void clickOnReference()
	{
		NewPrescription_Reference.sendKeys("N/A");
	}
	
	public void clickOnStatus()
	{
		NewPrescription_Status.click();
	}
	
	
	
	
	

	
	public void clickOnBP()
	{
		NewPrescription_PhysicalInformationBP.sendKeys("120/80");
	}
	
	public void clickOnFoodAllergies()
	{
		NewPrescription_PhysicalInformation_FoodAllergies.sendKeys("N/A");
	}
	
	public void clickOnTendencyBleed()
	{
		NewPrescription_PhysicalInformation_TendencyBleed.sendKeys("N/A");
	}
	
	public void clickOnHeartDisease()
	{
		NewPrescription_PhysicalInformation_HeartDisease.sendKeys("N/A");
	}
	
	public void clickOnDiabetic()
	{
		NewPrescription_PhysicalInformation_Diabetic.sendKeys("N/A");
	}
	
	public void clickOnMedicalHistory()
	{
		NewPrescription_PhysicalInformation_MedicalHistory.sendKeys("N/A");
	}
	
	public void clickOnFemalePregnancy()
	{
		NewPrescription_PhysicalInformation_FemalePregnancy.sendKeys("N/A");
	}
	
	public void clickOnBreastFeeding()
	{
		NewPrescription_PhysicalInformation_BreastFeeding.sendKeys("N/A");
	}
	
	public void clickOnCurrentMedication()
	{
		NewPrescription_PhysicalInformation_CurrentMedication.sendKeys("N/A");
	}
	
	public void clickOnSurgery()
	{
		NewPrescription_PhysicalInformation_Surgery.sendKeys("N/A");
	}
	
	public void clickOnAccident()
	{
		NewPrescription_PhysicalInformation_Accident.sendKeys("N/A");
	}
	
	public void clickOnOthers()
	{
		NewPrescription_PhysicalInformation_Others.sendKeys("N/A");
	}
	
	public void clickOnPulseRate()
	{
		NewPrescription_PhysicalInformation_PulseRate.sendKeys("N/A");
	}
	
	public void clickOnTemperature()
	{
		NewPrescription_PhysicalInformation_Temperature.sendKeys("N/A");
	}
	public void clickOnProblemDescription()
	{
		NewPrescription_PhysicalInformation_ProblemDescription.sendKeys("N/A");
	}
	
	
	
	
	
	
	
	public void clickOnMedicineNewMedicines()
	{
		NewPrescription_NewMedicines_NewMedicines.click();
	}
	
	public void clickOnNewMedicines_Medicines()
	{
		NewPrescription_NewMedicines_Medicines.sendKeys("azitro");
	}
	
	public void clickOnNewMedicines_Category()
	{
		NewPrescription_NewMedicines_Category.click();
	}
	
	public void selectNewMedicineCategory()
	{
		NewPrescription_NewMedicines_SelectCategory.click();
	}
	
	public void clickOnNewMedicineBrand()
	{
		NewPrescription_NewMedicines_Brand.click();
	}
	
	public void selectNewMedicinesBrand()
	{
		NewPrescription_NewMedicines_SelectBrand.click();
	}
	
	public void clickOnMedicineSaltComposition()
	{
		NewPrescription_NewMedicines_SaltComposition.sendKeys("N/A");
	}
	
	public void clickOnNewMedicineBuyingPrice()
	{
		NewPrescription_NewMedicines_BuyingPrice.sendKeys("42");
	}
	
	public void clickOnNewMedicineSellingPrice()
	{
		NewPrescription_NewMedicines_SellingPrice.sendKeys("50");
	}
	
	public void clickOnNewMedicineSideEffects()
	{
		NewPrescription_NewMedicines_SideEffects.sendKeys("N/A");
	}
	
	public void clickOnNewMedicineDescription()
	{
		NewPrescription_NewMedicines_Description.sendKeys("N/A");
	}
	
	public void clickOnNewMedicineSave()
	{
		NewPrescription_NewMedicines_Save.click();
	}
	
	public void clickOnNewMedicineCancel()
	{
		NewPrescription_NewMedicines_Cancel.click();
	}
	
	
	
	
	
	public void clickOnAdd()
	{
		NewPrescription_Medicines_Add.click();
	}
	
	public void clickOnMedicines()
	{
		NewPrescription_Medicines_Medicine.click();
	}
	
	public void selectMedicines()
	{
		NewPrescription_SelectMedicines.click();
	}
	
	public void clickOnDosage()
	{
		NewPrescription_Medicines_Dosage.sendKeys("55");
	}
	
	public void clickOnDays()
	{
		NewPrescription_Medicines_Day.sendKeys("one per day");
	}
	
	public void clickOnTime()
	{
		NewPrescription_Medicines_Time.click();
	}
	
	public void selectTime()
	{
		NewPrescription_Medicines_SelectTime.click();
	}
	
	public void clickOnComments()
	{
		NewPrescription_Medicines_Comment.sendKeys("N/A");
	}
	
	public void clickOnDelete()
	{
		NewPrescription_Medicines_Delete.click();
	}

	
	
	
	
	public void clickOnText()
	{
		NewPrescription_Test.sendKeys("N/A");
	}
	
	public void clickOnAdvice()
	{
		NewPrescription_Advice.sendKeys("N/A");
	}
	
	public void clickOnNextVisit()
	{
		NewPrescription_NextVisit.sendKeys("11");
	}
	
	public void clickOnNextVisitDays()
	{
		NewPrescription_NextVisitInDaysMonthsYear.click();
	}
	
	public void selectNextVisitDays()
	{
		NewPrescription_SelectNextVisitInDaysMonthsYear.click();
	}
	
	public void clickOnNewprescriptionSave()
	{
		NewPrescription_Save.click();
	}
	
	public void clickOnNewPrescriptionCancel()
	{
		NewPrescription_Cancel.click();
	}
}
