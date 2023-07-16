package Pages;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import base.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AddContactPage extends BaseTest{
	
	public AddContactPage(WebDriver driver) {
        BaseTest.driver = driver;
    }
	
	public void addcontactbtn() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); // 10 seconds timeout

		// Wait for the element to be visible
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("button--container_rqMyrzFn3r_tdZhm")));

		// Perform actions on the element after it becomes visible
		element.click();
//		driver.findElement(By.className("button--container_rqMyrzFn3r_tdZhm")).click();
		Thread.sleep(8000);
	}
	
	
	public void fillform() throws InterruptedException {
 		driver.findElement(By.xpath("//*[contains(@id, 'firstName')]")).sendKeys(prop.getProperty("peoplef"));////*[@id="ember4292_firstName"]
		
		driver.findElement(By.xpath("//*[contains(@id, 'lastName')]")).sendKeys(prop.getProperty("peoplel"));
		
		List<WebElement> l1 = driver.findElements(By.className("ember-power-select-placeholder"));
		//o select account
		l1.get(0).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("ember-power-select-search-input")).sendKeys(prop.getProperty("accounts"));
		Thread.sleep(2000);
		driver.findElement(By.className("ember-power-select-search-input")).sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER);
		Thread.sleep(2000);
		///email
		driver.findElement(By.name("fragments/email-address[value]")).sendKeys(prop.getProperty("peoplef")+"@gmail.com");
		
		
		//label
		l1.get(1);
		l1.get(1).click();//label
		Thread.sleep(2000);
		driver.findElement(By.className("ember-power-select-search-input")).sendKeys(Keys.DOWN,Keys.ENTER);
		
		//mobile and work
		driver.findElement(By.xpath("//*[contains(@id, 'mobileNumber')]")).sendKeys(prop.getProperty("number"));
		
		driver.findElement(By.xpath("//*[contains(@id, 'workNumber')]")).sendKeys("5869");
		
		//
        l1.get(2).click();//sucscripion
		
        driver.findElement(By.className("ember-power-select-search-input")).sendKeys(Keys.ENTER);
		
		l1.get(3).click();//
		driver.findElement(By.className("ember-power-select-search-input")).sendKeys(Keys.ENTER);
		
        l1.get(4).click();//wtsapp subscription
		
        driver.findElement(By.className("ember-power-select-search-input")).sendKeys(Keys.ENTER);
		
        l1.get(5).click();//sms subscription
		
        driver.findElement(By.className("ember-power-select-search-input")).sendKeys(Keys.ENTER);
		
		
		//driver.findElement(By.id("ember4709")).click();
		
		
	}
	
	public void save()
	{
		
		driver.findElement(By.xpath("/html/body/div[6]/div[5]/div[2]/div/div/div[4]/span[2]/button/span")).click();
	}
}
