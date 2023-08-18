package com.medsol1.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medol1.pageobjects.DocumentPage;
import com.medol1.pageobjects.Loginpage;
import com.medsol1.utilities.Readconfig;


public class TC_Document_Modified extends Baseclass {

	Readconfig config= new Readconfig();
	public String editselectdocument=config.geteditselectdocument();
	public String edittitle=config.getedittitle();
	public String epath=config.getepath();
	public String editnote=config.geteditnote();
	
	 @Test
		public void Documenttest() throws InterruptedException, AWTException  {

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
		doc.clickoneditbutton();
		Thread.sleep(2000);
		doc.setedittitle(edittitle);
		Thread.sleep(3000);
		doc.clickoneditdocumenttype();
		doc.setdocumenttype(editselectdocument);
		Thread.sleep(3000);
		doc.clickontxteditattachment();
		Thread.sleep(3000);
		doc.seteditattachment(epath);
		Thread.sleep(3000);
		doc.seteditnotes(editnote);
		doc.clickoneditdocumentsave();
		 }
}

