package com.medsol.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.PaymentsPage;

public class TC_paymenCreated  extends Baseclass {
	Loginpage OBlogin;
	PaymentsPage ObPayment;
	public String Account = config.getPayments_selectAccount();
	public String MM = config.getPayments_PaymentDate_month();
	public String YYYY = config.getPayments_PaymentDate_year();
	public String DD = config.getPayments_date();
	public String Amount = config.getPayments_Amount();
	public String Description = config.getPayments_Description();
	public String payto = config.getpayment_payto();
	
	
	
	@Test
	public void PaymentCreated() {
		OBlogin = new Loginpage(driver);
		OBlogin.clickonlogin();
		OBlogin.setemail(username);
		OBlogin.setpassword(password);
		OBlogin.clickonloginsubmit();

		Assert.assertTrue(driver.findElement(By.xpath("(//a[@class='nav-link  d-flex align-items-center py-3'])[1]")).isDisplayed());
		
		ObPayment = new PaymentsPage(driver);
		ObPayment.billing();
		ObPayment.payment();
		ObPayment.action();
		ObPayment.newpayment();
		ObPayment.selectaccount(Account);
		ObPayment.date(MM,YYYY,DD);
		ObPayment.payto(payto);
		ObPayment.amount(Amount);
		ObPayment.description(Description);
		ObPayment.save();
	}


}
