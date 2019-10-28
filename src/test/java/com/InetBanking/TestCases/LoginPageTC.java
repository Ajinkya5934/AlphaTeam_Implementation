package com.InetBanking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.InetBanking.PageObject.LoginPage;

public class LoginPageTC extends BaseClass{
	
	@Test
	public void loginTest(){
		driver.get(baseUrl);      
	        logger.info("url is opened");
	       LoginPage lp=new LoginPage(driver);
	       lp.setUserName(username);
	       logger.info("username is entered");
	       lp.setPassword(password);
	       logger.info("password is entered");
	     
	      lp.clickSubmit();
	      if (driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager HomePage")){
	      Assert.assertTrue(true);
	      logger.info("url is opened");
	      }
	      else{
	    	  Assert.assertFalse(false);
	      }
	}

	
	}
