package com.InetBanking.TestCases;

import java.util.logging.Logger;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeSuite;




public class BaseClass {
    

	
	public  String baseUrl="http://demo.guru99.com/V1/index.php";
	public  String username="mngr230303";
	public  String password="gYjYjAm";
	public static WebDriver driver;
	
	public static Logger logger;
	
	
	
	@BeforeSuite
	public void setup(){
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		logger=Logger.getLogger("ebanking");
		
	}
	
	
	@AfterClass
	public void teardown(){
		//driver.quit();
	}
}
