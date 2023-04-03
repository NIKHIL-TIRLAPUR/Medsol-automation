package com.medsol.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.medsol.pageobject.Employeepayrollpage;
import com.medsol.pageobject.Loginpage;

public class TC_EmployeePayRollCreated extends Baseclass {
	Loginpage OBlogin;
	Employeepayrollpage OBEmpPayroll;
	public String SlNO = config.getEmployeePayrollSLNO();
	public String Role = config.getEmployeePayroll_Role();
	public String Mon = config.getEmployeePayroll_month();
	public String YY = config.getEmployeePayroll_year();
	public String BaseSal = config.getEmployeePayroll_BasicSalary();
	public String Allowance = config.getEmployeePayroll_Allowance();
	public String Deduc = config.getEmployeePayroll_Deduction();
	public String Status = config.getEmployeePayroll_Status();

	@Test
	public void bedCreated() throws InterruptedException {
		OBlogin = new Loginpage(driver);
		OBlogin.clickonlogin();
		OBlogin.setemail(username);
		OBlogin.setpassword(password);
		OBlogin.clickonloginsubmit();
		Assert.assertTrue(driver.findElement(By.xpath("(//a[@class='nav-link  d-flex align-items-center py-3'])[1]"))
				.isDisplayed());

		OBEmpPayroll = new Employeepayrollpage(driver);
		OBEmpPayroll.Billing();
		OBEmpPayroll.Epmloyeepayroll();
		OBEmpPayroll.NewemployeePayrollbtn();
		OBEmpPayroll.SL_NOTb(SlNO);
		OBEmpPayroll.rollDropDown();
		OBEmpPayroll.rollSearchbox(Role);
		OBEmpPayroll.EpmloyeeDropDown();
		//OBEmpPayroll.EmployeeSearchbox(Emp);
		OBEmpPayroll.MonthDropDown();
		OBEmpPayroll.MonthSearchBox(Mon);
		OBEmpPayroll.YearTb(YY);
		OBEmpPayroll.StatusDropDown();
		OBEmpPayroll.StatusSearch(Status);
		OBEmpPayroll.BAsicsalTB(BaseSal);
		OBEmpPayroll.AllowanceTB(Allowance);
		OBEmpPayroll.DeductionTB(Deduc);
		OBEmpPayroll.Save();

	}
}
