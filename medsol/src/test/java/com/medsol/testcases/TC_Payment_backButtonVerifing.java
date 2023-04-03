package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.PaymentsPage;

public class TC_Payment_backButtonVerifing  extends Baseclass {
	Loginpage OBlogin;
	PaymentsPage ObPayment;

	@Test
	public void PaymentCreated() {
		OBlogin = new Loginpage(driver);
		OBlogin.clickonlogin();
		OBlogin.setemail(username);
		OBlogin.setpassword(password);
		OBlogin.clickonloginsubmit();

		ObPayment = new PaymentsPage(driver);
		ObPayment.billing();
		ObPayment.payment();
		ObPayment.action();
		ObPayment.newpayment();
		ObPayment.back();
	}


}
