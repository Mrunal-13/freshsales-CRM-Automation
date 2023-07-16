package testcases;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.Quotes;
import Pages.groupAndSortPage;
import base.BaseTest;

public class QuoteTest extends BaseTest{
	@Test
	public void quotetest() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.email();
		loginPage.password();
		loginPage.signin();
		Thread.sleep(8000);
		Quotes p = new Quotes(driver);
		
		p.dealbtn();
		p.fillquote();
		p.savebtn1();
		Thread.sleep(1000);
		
		p.selectall();
		Thread.sleep(1000);
		p.editcolmn();
		Thread.sleep(1000);
	}
	
	
}
