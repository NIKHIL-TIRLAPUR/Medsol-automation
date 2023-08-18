package com.medol1.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentPage {

	WebDriver ldriver;
	public DocumentPage (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//span[normalize-space()='Documents']")
    WebElement document;
	
	@FindBy(xpath="//a[normalize-space()='New Document']")
    WebElement newdocument;
	
	@FindBy(id="title")
    WebElement txttitle;
	
	@FindBy(id="editDocumentTitle")
    WebElement txtedittitle;
	
	@FindBy(xpath="//span[@id='select2-documentTypeId-container']")
    WebElement dropdowndocumenttype;
	
	@FindBy(xpath="//span[@id='select2-editDocumentTypeId-container']")
    WebElement dropdowneditdocumenttype;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement documentsearchbox;
	
	@FindBy(xpath="//span[@id='select2-documentPatientId-container']")
    WebElement selectpatient;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement patientsearchbox;
	
	@FindBy(xpath="//span[@title='Attachment']//label//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement txtattachment;
	
	@FindBy(xpath="//span[@title='Change Attachment']//label//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement txteditattachment;
	
	
	
	@FindBy(xpath="//textarea[@id='notes']")
    WebElement txtnotes;
	
	@FindBy(xpath="//textarea[@id='editDocumentNotes']")
    WebElement txteditnotes;
	
	
	@FindBy(id="documentSave")
    WebElement documentsave;
	
	@FindBy(id="editDocumentSave")
    WebElement editdocumentsave;
	
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/div[1]/a[3]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/div[1]/a[2]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	public void clickondocument()
	{
		document.click();
	}
	
	public void clickonnewdocument()
	{
		newdocument.click();
	}
	
	public void settitle(String tit)
	{
		txttitle.sendKeys(tit);
	}
	
	public void setedittitle(String etit)
	{
		txtedittitle.clear();
		txtedittitle.sendKeys(etit);
	}
	
	public void clickondocumenttype()
	{
		dropdowndocumenttype.click();
	}
	
	public void clickoneditdocumenttype()
	{
		dropdowneditdocumenttype.click();
	}
	
	public void setdocumenttype(String document)
	{
		documentsearchbox.sendKeys(document);
		documentsearchbox.sendKeys(Keys.ENTER);
	}
	
	public void clickonselectpatient()
	{
		selectpatient.click();
	}
	
	public void setpatient(String patient)
	{
		patientsearchbox.sendKeys(patient);
		patientsearchbox.sendKeys(Keys.ENTER);
	}
	
	public void clickontxtattachment()
	{
		txtattachment.click();
	}
	
	public void clickontxteditattachment()
	{
		txteditattachment.click();
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
	
	public void seteditattachment(String epath) throws AWTException
	{
		Robot rb= new Robot();
		rb.delay(2000);
		
		StringSelection ss= new StringSelection(epath);
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
	
	public void setnote(String fnote)
	{
		txtnotes.click();
		txtnotes.sendKeys(fnote);
		
	}
	
	public void seteditnotes(String lnote)
	{
		txteditnotes.click();
		txteditnotes.clear();
		txteditnotes.sendKeys(lnote);
		
	}
	
	public void clickondocumentsave()
	{
		documentsave.click();
		
	}
	
	public void clickoneditdocumentsave()
	{
		editdocumentsave.click();
		
	}
	
	
	
	public void clickondeletebutton()
	{
		deletebutton.click();
		
	}
	
	public void clickonyesdeletebutton()
	{
		yesdeletebutton.click();
		
	}
	
	public void clickoneditbutton()
	{
		editbutton.click();
		
	}
	}

