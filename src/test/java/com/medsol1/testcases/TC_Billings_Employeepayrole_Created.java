package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.Billings_EmployeepayrolePage;
import com.medol1.pageobjects.Loginpage;
import com.medsol1.utilities.Readconfig;

public class TC_Billings_Employeepayrole_Created extends Baseclass{

Readconfig config= new Readconfig();
	
	public String amounttobepaid=config.getamounttobepaid();
	public String selectpatient=config.getselectpatient();
	public String role=config.getrole();
	public String sr_no=config.getsr_no();
	public String month=config.getmonth();
	public String year=config.getyear();
	public String payrollstatus=config.getpayrollstatus();
	public String deductions=config.getdeductions();
	public String basicsalary=config.getbasicsalary();
	public String allowance=config.getallowance();
	
	
	 @Test
		public void Billings_employeepayrollspagetest() throws InterruptedException  {

		Thread.sleep(3000);
		Loginpage lp=new Loginpage(driver);
		lp.clickonlogin();
		lp.setemail(username);
		lp.setpassword(password);
		lp.clickonloginsubmit();
		Thread.sleep(3000);
		
		Billings_EmployeepayrolePage empr=new Billings_EmployeepayrolePage(driver);
		
		empr.clickonbillings();
		Thread.sleep(2000);
		empr.clickonEmployeePayrolls();
		Thread.sleep(2000);
		empr.clickonNewEmployeePayroll();
		Thread.sleep(2000);
		empr.setsr_no(sr_no);
		empr.setselectrole(role);
		empr.setselectmonth(month);
		empr.setyear(year);
		empr.setstatus(payrollstatus);
		empr.setBasicSalary(basicsalary);
		empr.setallowance(allowance);
		empr.setdeductions(deductions);
		empr.clickonempPayrollSave();
		Thread.sleep(2000);
	 }
	}
