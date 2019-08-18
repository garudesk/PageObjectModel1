package com.crm.qa.testcases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	
	
	 LoginPage loginpage;
	 HomePage homepage;
	 ContactsPage contactspage;
	
	public HomePageTest() {
	
	super();
	
	}
	
	@BeforeMethod
	public void SetUp() {
		
		initialisation();
		
		LoginPage loginpage = new LoginPage();
		
		loginpage.Login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	@Test(priority = 1)
	
	public void  HomePageTitleTest() {
    
	HomePage homepage = new HomePage();
	
	String title1 = homepage.HomePageTitle();
		
	Assert.assertEquals(title1, "CRM","Wrong title");	
		
	}
	
	@Test(priority = 2)
	

	public void HomePageLogoTest() {
		
	HomePage homepage = new HomePage();
	
	Boolean Logo = homepage.HomePageLogo();	
		
	Assert.assertTrue(Logo);

	
	}
	
	@Test(priority = 3)
	
	public void ContactBtnTest() {
		
	HomePage homepage = new HomePage();
	
    contactspage = 	homepage.ContactBtn();

	}
	
 @AfterMethod
 
 public void tearDown() {
	 
	driver.quit(); 
	 
 }
 }


