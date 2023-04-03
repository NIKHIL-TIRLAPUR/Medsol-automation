package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.PaymentsPage;

public class TC_PaymentDeleting  extends Baseclass{
	Loginpage OBlogin;
	PaymentsPage ObPayment;
	public String Account = config.getPayments_selectAccount();
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
	ObPayment.SearchingPaymentAccount(Account);
	try {
		ObPayment.delete();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}
}



