package com.medol1.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver ldriver;

	public Loginpage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(xpath="//a[contains(@class,'btn btn-success me-2 mb-3 mb-xl-0')]")
	WebElement loginbutton;
	
	@FindBy(name="email")
	WebElement txtemail;
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(xpath="//button[contains(@class,'btn btn-primary')]")
	WebElement loginbuttonsubmit;
	
	@FindBy(xpath="//div[@class='dropdown d-flex align-items-center py-4']//button[@id='dropdownMenuButton1']//*[name()='svg']")
	WebElement logoutdropdown;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement logoutbutton;
	
	public void clickonlogin() {
		loginbutton.click();
	}
	
	public void setemail(String userid) {
		txtemail.sendKeys(userid);
		
	}
	
	public void setpassword(String pwd) {
		txtpassword.sendKeys(pwd);
		
	}
	
	public void clickonloginsubmit() {
		loginbuttonsubmit.click();
	}
	
	public void clickonlogoutdropdown() {
		logoutdropdown.click();
	}
	
	public void clickonlogoutbutton() {
		logoutbutton.click();
	}
	
	public void scrolldown()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(0,9000)", "");
	}
	
	public void scrolldown1()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(0,400)", "");
	}
	

	public void setattachment(String path) throws AWTException
	{
		Robot rb= new Robot();
		rb.delay(2000);
		
		StringSelection ss= new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
