package com.medsol1.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medol1.pageobjects.Finances_Income;
import com.medol1.pageobjects.Loginpage;

public class TC_Finances_Income_Create extends Baseclass {
	@Test
	public void createFinanceIncome() throws InterruptedException, AWTException
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
		fi.clickOnFinancesActions();
		Thread.sleep(2000);
		
		fi.clickOnActions_NewIncome();
		Thread.sleep(2000);
		
		
		fi.clickOnIncomeHead();
		Thread.sleep(2000);
		fi.selectIncomeHead();
		Thread.sleep(2000);
		
		fi.clickOnName();
		Thread.sleep(2000);
		
		fi.clickOnDate();
		Thread.sleep(2000);
		
		fi.selectDate();
		Thread.sleep(2000);
		
		fi.clickOnInvoiceNumber();
		Thread.sleep(2000);
		
		fi.clickOnAmount();
		Thread.sleep(2000);
		
		fi.clickOnAttachment();
		Thread.sleep(2000);
		
		
		
		l.setattachment("C:\\Users\\Acer\\Pictures\\Screenshots\\Screenshot (1).png");
		
		Thread.sleep(2000);
		
		fi.clickOnDescription();
		Thread.sleep(2000);
		
		l.scrolldown();
		Thread.sleep(2000);
		
		fi.clickOnSave();
		Thread.sleep(2000);
		

		
	}

}
