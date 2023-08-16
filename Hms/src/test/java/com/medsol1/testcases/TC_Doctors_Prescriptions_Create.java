package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.Doctors_Prescriptions;
import com.medol1.pageobjects.Loginpage;

public class TC_Doctors_Prescriptions_Create extends Baseclass {
	
	@Test
	public void prescription() throws InterruptedException 
	{
		Thread.sleep(5000);
		Loginpage lp=new Loginpage(driver);
		lp.clickonlogin();
		lp.setemail(username);
		lp.setpassword(password);
		lp.clickonloginsubmit();
		Thread.sleep(5000);
		
		Doctors_Prescriptions dp=new Doctors_Prescriptions(driver);
		
		
		dp.clickOnDoctors();
		
	Thread.sleep(2000);
		
		dp.clickOnPrescription();
		Thread.sleep(2000);
		
		dp.clickOnNewPrescription();
		Thread.sleep(2000);
		
		dp.selectpatient();
		Thread.sleep(2000);
		
		dp.clickOnNewPrescriptionDoctor();
		Thread.sleep(2000);
		
		dp.clickOnHealthInsurance();
		
		dp.clickOnLowIncome();
		
		dp.clickOnReference();
		
		dp.clickOnStatus();
		
		
		
		Loginpage l=new Loginpage(driver);
		l.scrolldown();
		
		dp.clickOnBP();
		
		dp.clickOnFoodAllergies();
		
		dp.clickOnTendencyBleed();
		
		dp.clickOnHeartDisease();
		
		dp.clickOnDiabetic();
		
		dp.clickOnMedicalHistory();
		
		dp.clickOnFemalePregnancy();
		
		dp.clickOnBreastFeeding();
		
		dp.clickOnCurrentMedication();
		
		dp.clickOnSurgery();
		
		dp.clickOnAccident();
		
		dp.clickOnOthers();
		
		l.scrolldown();
		
		dp.clickOnPulseRate();
		
		dp.clickOnTemperature();
		
		dp.clickOnProblemDescription();
		
		l.scrolldown();
		
		
		
	
		
		dp.clickOnMedicineNewMedicines();
		
		dp.clickOnNewMedicines_Medicines();
		
		dp.clickOnNewMedicines_Category();
		
		dp.selectNewMedicineCategory();
		
		dp.clickOnNewMedicineBrand();
		
		dp.selectNewMedicinesBrand();
		
		dp.clickOnMedicineSaltComposition();
		
		dp.clickOnNewMedicineBuyingPrice();
		
		dp.clickOnNewMedicineSellingPrice();
		
		dp.clickOnNewMedicineSideEffects();
		l.scrolldown();
		
		dp.clickOnNewMedicineDescription();
		
		dp.clickOnNewMedicineSave();
		
		
		
		dp.clickOnMedicines();
		
		dp.selectMedicines();
		
		dp.clickOnDosage();
		
		dp.clickOnDays();
		
		dp.clickOnTime();
		
		dp.selectTime();
		
		dp.clickOnComments();
		
		dp.clickOnDelete();
		
		l.scrolldown();
		
		
		dp.clickOnText();
		
		
		dp.clickOnAdvice();
		l.scrolldown();
		
		dp.clickOnNextVisit();
		
		dp.clickOnNextVisitDays();
		
		dp.selectNextVisitDays();
		
		dp.clickOnNewprescriptionSave();
	}

}
