package com.InetBanking.TestCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.InetBanking.Utilities.ReadConfig;

public class BaseClass {
	ReadConfig readconfig=new ReadConfig();

	public  String baseUrl=readconfig.getApplicationUrl();
	public  String username=readconfig.getUserName();
	public  String password=readconfig.getPassword();
	public static WebDriver driver;
	
     public static Logger logger;
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br){
		if(br.equals("Chrome")){
		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		logger=Logger.getLogger("ebanking");
		PropertyConfigurator.configure(".//test-output//Log4j.properties");
		
	}
		}	
	@AfterClass
	public void teardown(){
		driver.quit();
	}
}

