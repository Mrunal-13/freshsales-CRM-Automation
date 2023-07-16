package testcases;

import org.testng.annotations.Test;
import Pages.assignUpdateDeletePage;
import Pages.LoginPage;
import base.BaseTest;

public class assignUpdateDeleteTest extends BaseTest {
	@Test
	public void quotetest() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.email();
		loginPage.password();
		loginPage.signin();
		Thread.sleep(8000);
		
		assignUpdateDeletePage d = new assignUpdateDeletePage();
		d.dealbtn2();
		d.selectone();
		d.Assignto();
		d.selectone();
		d.Updateto();
		d.selectone();
		d.delete();
	}
}
