package com.medsol.testcases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.medsol.utilities.Readconfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	Readconfig config=new Readconfig();
	public String baseurl=config.getApplicationURL();
	public String username=config.getUserName();
	public String password=config.getPassword();
	
	
	public static WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) throws InterruptedException {
		if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", config.getChromePath());
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(c);
		}
		
		else if(br.equals("firefox")) {
			System.setProperty("webdriver.firefox.driver", config.getFirefoxPath());
			driver=new FirefoxDriver();
		}
		
		else if(br.equals("ie")) {
			System.setProperty("webdriver.ie.driver", config.getIEPath());
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(baseurl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		//Thread.sleep(3000);
		}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	public String randomString() {
		String generatedString= RandomStringUtils.randomAlphabetic(8);
		return generatedString;
	}
	
	public String randomNumber() {
		String generatedNumber=RandomStringUtils.randomNumeric(5);
		return generatedNumber;
	}
	
	
	
	
	
	
	
	
}
