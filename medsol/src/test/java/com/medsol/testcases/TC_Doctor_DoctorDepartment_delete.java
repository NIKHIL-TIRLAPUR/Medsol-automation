package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Doctors_Doctorsdepartmentpage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Doctor_DoctorDepartment_delete extends Baseclass {

	Readconfig config = new Readconfig();
	public String department = config.getDoctorDepartment();
	public String department1 = config.geteditDoctorDepartment();

	@Test
	public void Doctors_Doctorsdepartmenttest() throws InterruptedException {

		Thread.sleep(3000);
		Loginpage lp = new Loginpage(driver);
		lp.clickonlogin();
		lp.setemail(username);
		lp.setpassword(password);
		lp.clickonloginsubmit();
		Thread.sleep(3000);

		Doctors_Doctorsdepartmentpage docdtp = new Doctors_Doctorsdepartmentpage(driver);

		docdtp.clickondoctors();
		docdtp.clickondoctordepartments();
		docdtp.setdoctordepartmentinsearchbox(department1);
		docdtp.clickondeletebutton();
		docdtp.clickonyesdeletebutton();
	}
}
