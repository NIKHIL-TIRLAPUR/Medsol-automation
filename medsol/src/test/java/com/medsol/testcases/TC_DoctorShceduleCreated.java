package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Doctor_Schedulepage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_DoctorShceduleCreated extends Baseclass {
	Readconfig config = new Readconfig();

	@Test
	public void Doctors_Doctorsdepartmenttest() throws InterruptedException {

		Loginpage OBlogin = new Loginpage(driver);
		OBlogin.clickonlogin();
		OBlogin.setemail(username);
		OBlogin.setpassword(password);
		OBlogin.clickonloginsubmit();

		Doctor_Schedulepage ObSchedule = new Doctor_Schedulepage(driver);

		ObSchedule.clickondoctors();
		ObSchedule.clickondoctorSchedule();
		ObSchedule.clickonNewScheduleBtn();

	}
}
