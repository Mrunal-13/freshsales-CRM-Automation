package testcases;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.groupAndSortPage;
import base.BaseTest;

public class GroupTest extends BaseTest{
	
	@Test
	public void grouptest() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.email();
		loginPage.password();
		loginPage.signin();
		
		groupAndSortPage p = new groupAndSortPage(driver);
		p.group();
		
	}
	
}
