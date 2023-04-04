package com.medol1.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class Bloodbankpage {
WebDriver ldriver;
	
	public Bloodbankpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
@FindBy(xpath="(//a[contains(@class,'d-flex align-items-center py-3')])[7]")
 WebElement Bloodbank;


@FindBy(xpath="//a[normalize-space()='New Blood Group']")
 WebElement NewBloodbank;

@FindBy(xpath="//input[@id='bloodGroup']")
  WebElement  textBloogroup;

@FindBy(xpath="//input[@id='bloodBankRemainedBags']")
 WebElement textRemainingbloodbags;

@FindBy(xpath = "//button[@id='bloodBankSave']")
WebElement save;

public  Bloodbankpage () {
 this. Bloodbank.click();
}
	
	public  void NewBloodbank() {
	 this.NewBloodbank.click();
		}
	
		public void BloodGroup(String  Bgroup) {
			textBloogroup.sendKeys("A");
		}
			
		public void Remainingbags(String string) {
			textRemainingbloodbags.sendKeys("3");
			
			}
public void save() {
	this.save.submit();
	}

public void Bloodbankpage1() {
	this.Bloodbank.click();
	
}

	
}
	
	

	


	



