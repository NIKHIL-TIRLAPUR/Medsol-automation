package com.medol1.pageobjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.medsol1.testcases.Baseclass;

public class BloodBank_BloodDonorPage extends Baseclass{

WebDriver ldriver;
	
	public BloodBank_BloodDonorPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//a[normalize-space()='Blood Donors']")
    WebElement blooddonor;
	
	@FindBy(xpath="//span[normalize-space()='Blood Banks']")
    WebElement Bloodbankbutton;
	
	@FindBy(xpath="//a[normalize-space()='New Blood Donor']")
    WebElement newblooddonor;

	
	@FindBy(xpath="//input[@id='bloodDonorName']")
    WebElement txtblooddonorname;
	
	@FindBy(xpath="//input[@id='editBloodDonorName']")
    WebElement txteditblooddonorname;
	
	@FindBy(xpath="//input[@id='bloodDonorAge']")
    WebElement txtblooddonorage;
	
	@FindBy(xpath="//input[@id='editBloodDonorAge']")
    WebElement txteditblooddonorage;
	
	@FindBy(xpath="//input[@id='bloodDonorFemale']")
    WebElement blooddonorgender;
	
	@FindBy(xpath="//input[@id='editBloodDonorMale']")
    WebElement editblooddonorgender;
	
	@FindBy(xpath="//span[@id='select2-donorBloodGroup-container']")
    WebElement bloodgroupdropdown;
	
	@FindBy(xpath="//span[@id='select2-editDonorBloodGroup-container']")
    WebElement editbloodgroupdropdown;
	
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement txtbloodgroupsearchbox;
	
	@FindBy(xpath="//input[@id='lastDonationDate']")
    WebElement lastdonationdate;
	
	
	
	@FindBy(xpath="//input[@aria-label='Year']")//input[@aria-label='Year']
    WebElement txtlastdonationyear;
	
	@FindBy(xpath="//div[@class='numInputWrapper']")//input[@aria-label='Year']
    WebElement txtdonationyear;
	
	@FindBy(xpath="//span[@class='arrowDown']")//span[@class='arrowDown']
    WebElement yeardownarrow;
	
	@FindBy(xpath="//select[@aria-label='Month']")//select[@aria-label='Month']
    WebElement txtlastdonationmonth;
	
	@FindBy(xpath="//div[@class='dayContainer']/span")//div[@class='dayContainer']/span
    List<WebElement>  txtlastdonationdate;
	
	@FindBy(xpath="//button[@id='bloodDonorSave']")
    WebElement bloodDonorSavebutton;
	
	@FindBy(xpath="//button[@id='editBloodDonorSave']")
    WebElement editbloodDonorSavebutton;
	
	@FindBy(xpath="//tbody/tr[1]/td[6]/a[1]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement bloodDonoreditbutton;
	
	@FindBy(xpath="//tbody/tr[1]/td[6]/a[2]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	
	@FindBy(xpath="//input[@name='search']")
    WebElement searchbox;
	
	
	public void clickonBloodbank()
	{
		Bloodbankbutton.click();
	}
	
	
	public void clickonblooddonor()
	{
		blooddonor.click();
	}
	
	public void clickonnewblooddonor()
	{
		newblooddonor.click();
	}
	
	public void setblooddonorname(String donor)
	{
		txtblooddonorname.sendKeys(donor);
	}
	
	public void seteditblooddonorname(String edonor)
	{
		txteditblooddonorname.clear();
		txteditblooddonorname.sendKeys(edonor);
	}
	
	
	public void setblooddonorage(String age)
	{
		txtblooddonorage.sendKeys(age);
	}
	
	public void seteditblooddonorage(String eage)
	{
		txteditblooddonorage.click();
		txteditblooddonorage.clear();
		txteditblooddonorage.sendKeys(eage);
	}
	
	
	
	public void clickonblooddonorgender()
	{
		blooddonorgender.click();
	}
	
	public void clickoneditblooddonorgender()
	{
		editblooddonorgender.click();
	}
	
	
	
	public void setbloodgroupofdonor(String dblood)
	{
		bloodgroupdropdown.click();
		txtbloodgroupsearchbox.click();
		txtbloodgroupsearchbox.sendKeys(dblood);
		txtbloodgroupsearchbox.sendKeys(Keys.ENTER);

	}
	
	
	public void seteditbloodgroupofdonor(String edblood)
	{
		editbloodgroupdropdown.click();
		txtbloodgroupsearchbox.click();
		txtbloodgroupsearchbox.sendKeys(edblood);
		txtbloodgroupsearchbox.sendKeys(Keys.ENTER);

	}
	
	
	public void setlastblooddonationdate(String month,String date)
	{
		lastdonationdate.click();
		//txtlastdonationyear.click();
		yeardownarrow.click();
		//txtyearindob.sendKeys(year);
		/*while(true)

        {

                      String year1= txtdonationyear.getText();

                     

                      if(year.equals(year1))

                                    break;

                      else

                    	  yeardownarrow.click();

        }*/
		 Select month_drp= new Select(txtlastdonationmonth);
         month_drp.selectByVisibleText(month);
         List<WebElement> alldate= txtlastdonationdate;
       
         for(WebElement ele:alldate)

         {

                       String dt= ele.getText();

                       if(dt.equals(date))

                       {

                                     ele.click();

                                     break;

                       }

         }
	}
	
	
	public void clickonbloodDonoreditbutton()
	{
		bloodDonoreditbutton.click();
	}
	
	
	public void clickonbloodDonorSavebutton()
	{
		bloodDonorSavebutton.click();
	}
	
	public void clickoneditbloodDonorSavebutton()
	{
		editbloodDonorSavebutton.click();
	}
	
	public void clickondeletebutton()
	{
		deletebutton.click();
	}
	
	public void clickonyesdeletebutton()
	{
		yesdeletebutton.click();
	}
	
	public void setnameinsearchbox(String name)
	{
		searchbox.click();
		
		searchbox.sendKeys(name);
		searchbox.sendKeys(Keys.ENTER);

	}
	
	}

