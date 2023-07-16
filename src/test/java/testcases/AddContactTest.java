package testcases;

import org.testng.annotations.Test;

import Pages.LoginPage;
import base.BaseTest;
import Pages.LoginPage;
import Pages.AddContactPage;


public class AddContactTest extends BaseTest {

    @Test
	public void addcontactest() throws InterruptedException {
    	
    	//code to login
    	LoginPage loginPage = new LoginPage(driver);
    	loginPage.email();
    	loginPage.password();
    	loginPage.signin();
    	//Thread.sleep(11000);
    	//steps to add contact card
    	AddContactPage ad = new AddContactPage(driver);
    	
    	ad.addcontactbtn();
    	ad.fillform();
    	ad.save();
    	Thread.sleep(8000);
    	
    }
	
	
}
