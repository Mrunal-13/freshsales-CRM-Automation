package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class LoginPage extends BaseTest {
	 public LoginPage(WebDriver driver) {
	        BaseTest.driver = driver;
	    }
	 public void email()
	 {
		 driver.findElement(By.name("username")).sendKeys(prop.getProperty("username1"));
		 
	 }
	 public void password() throws InterruptedException {
		 driver.findElement(By.name("password")).sendKeys(prop.getProperty("password1"));
		 Thread.sleep(3000);
	 }
	 public void signin() throws InterruptedException {
		 driver.findElement(By.className("css-o1ejds")).click();
		 System.out.println("enter captvha on page");
		 Thread.sleep(10000);
		
	 }

}
