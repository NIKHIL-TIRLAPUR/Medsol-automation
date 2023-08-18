package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.DocumentPage;
import com.medol1.pageobjects.Loginpage;
import com.medsol1.utilities.Readconfig;


public class TC_Document_Delete extends Baseclass{

	Readconfig config= new Readconfig();
	
	 @Test
		public void Documenttest() throws InterruptedException  {

			Thread.sleep(3000);
		Loginpage lp=new Loginpage(driver);
		lp.clickonlogin();
		lp.setemail(username);
		lp.setpassword(password);
		lp.clickonloginsubmit();
		Thread.sleep(3000);
	
		DocumentPage doc= new DocumentPage(driver);
		doc.clickondocument();
		Thread.sleep(2000);
		//doc.clickoneditbutton();
		//Thread.sleep(2000);
       doc.clickondeletebutton();
       doc.clickonyesdeletebutton();
	 }
}

