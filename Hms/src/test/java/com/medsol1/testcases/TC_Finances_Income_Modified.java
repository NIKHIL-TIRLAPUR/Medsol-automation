package com.medsol1.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medol1.pageobjects.Finances_Income;
import com.medol1.pageobjects.Loginpage;

public class TC_Finances_Income_Modified extends Baseclass {
	@Test
	public void modifyFinanceIncome() throws InterruptedException, AWTException
	{

		Thread.sleep(5000);
		Loginpage lp=new Loginpage(driver);
		lp.clickonlogin();
		lp.setemail(username);
		lp.setpassword(password);
		lp.clickonloginsubmit();
		Thread.sleep(5000);
		
		
		Loginpage l=new Loginpage(driver);
		
		l.scrolldown1();
		Thread.sleep(2000);
		
		Finances_Income fi=new Finances_Income(driver);
		fi.clickOnFinances();
		Thread.sleep(2000);
		
		
		fi.clickOnEdit();
		Thread.sleep(2000);
		
		fi.clickOnEditIncomeHead();
		Thread.sleep(2000);
		
		fi.selectEditIncomeHead();
		Thread.sleep(2000);
		
		fi.clickOnEditName();
		Thread.sleep(2000);
		
		fi.clickOnEditDate();
		Thread.sleep(2000);
		
		fi.selectEditDate();
		Thread.sleep(2000);
		
		fi.clickOnEditInvoiceNumber();
		Thread.sleep(2000);
		
		fi.clickOnEditAmount();
		Thread.sleep(2000);
		
		//fi.clickOnAttachment();
		//Thread.sleep(2000);
		
		//l.setattachment("C:\\Users\\Acer\\Pictures\\Screenshots\\Screenshot (1).png");
		//Thread.sleep(2000);
		
		fi.clickOnEditDescription();
		Thread.sleep(2000);
		
		l.scrolldown();
		Thread.sleep(2000);
		
		fi.clickOnEditSave();
		Thread.sleep(2000);
		
		
	}

}
