package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.AppointmentsPage;
import com.medol1.pageobjects.Loginpage;

public class TC_Appointments_NewAppointments_Create extends Baseclass {
	
	
	@Test
	public void NewAppointments() throws InterruptedException
	{
		Thread.sleep(5000);
		Loginpage lp=new Loginpage(driver);
		lp.clickonlogin();
		lp.setemail(username);
		lp.setpassword(password);
		lp.clickonloginsubmit();
		Thread.sleep(5000);
		
		AppointmentsPage app=new AppointmentsPage(driver);
		
		app.clickOnAppointments();
		Thread.sleep(2000);
		
		app.clickOnNewAppointments();
		Thread.sleep(2000);
		
		app.clickOnDocDept();
		Thread.sleep(2000);
		
		app.selectDocDept();
		Thread.sleep(2000);
		
		app.clickOnDoc();
		Thread.sleep(2000);
		
		app.selectYear();
		Thread.sleep(2000);
		
		app.clickOnMonth();
		Thread.sleep(2000);
		
		app.clickOnDate();
		Thread.sleep(2000);
		
		app.clickOnDescription();
		Thread.sleep(2000);
		
		app.clickOnSave();
		
	}

}
