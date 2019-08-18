package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	
	HomePage homepage;
	ContactsPage contactspage;
	LoginPage loginpage;
	TestUtil testutil;
	
	String sheetName = "ContactData";
	
	
	public ContactsPageTest() {
		
	 super();	
		
	}
	
	@BeforeMethod

	public void SetUp() {
		
	initialisation();
	
	TestUtil testutil = new TestUtil();
	
	ContactsPage contactspage = new ContactsPage();
	
	LoginPage loginpage = new LoginPage();
	
	HomePage homepage = new HomePage();
	
	homepage = loginpage.Login(prop.getProperty("username"),prop.getProperty("password"));
	
	contactspage = homepage.ContactBtn();
	
	}
	
	@Test(priority = 1)
	
	public void ContactsLableTest() {
		
	ContactsPage contactspage = new ContactsPage();
	
	Boolean cl = contactspage.ContactLable();
	
	Assert.assertTrue(cl, "Contacts Lable is not displyed");	
	}
	
	@Test(priority = 2)
	
	public void CheckBox() {
	
	ContactsPage contactspage = new ContactsPage();
	
	contactspage.CheckBox();	
		
	}
	@Test(priority = 3)
	
	public void NewBtnTest() {
	
	ContactsPage contactspage = new ContactsPage();	
	
	contactspage.NewBtn();
		
	}
	
	@DataProvider
	
	public Object[][] getCRMTestData() {
		
	TestUtil testutil = new TestUtil();
	
    Object data[][] = 	testutil.getTestData(sheetName);
		
	return data;	
		
	}
	
	@Test(priority = 4,dataProvider="getCRMTestData")
	
	public void NewContactCreartionTest(String firstname,String lastname,String address) throws InterruptedException {
		
	ContactsPage contactspage = new ContactsPage();
	
	Thread.sleep(2000);
	
	contactspage.NewBtn();	
	
	Thread.sleep(2000);
	
	contactspage.NewContactCreation(firstname,lastname,address);	
	
	Thread.sleep(200);
	
	contactspage.SaveBtn();
	
	Thread.sleep(2000);
	}
//	@Test(priority = 5)
//    public void SaveBtnTest() {
//    	
//    contactspage.SaveBtn();	
//    }
	
	
	@AfterMethod
	
	public void tearDown() {
		
	driver.quit();	
		
	}
	}
