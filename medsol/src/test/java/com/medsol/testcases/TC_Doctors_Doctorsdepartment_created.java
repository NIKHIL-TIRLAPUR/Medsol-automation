package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Doctors_Doctorsdepartmentpage;
import com.medsol.pageobject.Loginpage;
import com.medsol.utilities.Readconfig;

public class TC_Doctors_Doctorsdepartment_created extends Baseclass {
	Readconfig config = new Readconfig();
	public String department = config.getDoctorDepartment();
	public String description = config.getdescription();

	@Test
	public void Doctors_Doctorsdepartmenttest() throws InterruptedException {

		Loginpage OBlogin = new Loginpage(driver);
		OBlogin.clickonlogin();
		OBlogin.setemail(username);
		OBlogin.setpassword(password);
		OBlogin.clickonloginsubmit();
		Thread.sleep(3000);

		Doctors_Doctorsdepartmentpage docdtp = new Doctors_Doctorsdepartmentpage(driver);

		docdtp.clickondoctors();
		Thread.sleep(2000);
		docdtp.clickondoctordepartments();
		Thread.sleep(2000);
		docdtp.clickonnewdoctordepartment();
		Thread.sleep(2000);
		docdtp.setdoctordepartment(department);
		docdtp.setdescription(description);
		docdtp.clickonsavebutton();
	}
}
