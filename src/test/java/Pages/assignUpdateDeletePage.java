package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseTest;

public class assignUpdateDeletePage extends BaseTest {
	public void dealbtn2() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); // 10 seconds timeout

		// Wait for the element to be visible
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("button--container_rqMyrzFn3r_tdZhm")));

		//dealbtn press
		driver.findElement(By.xpath("/html/body/div[6]/div[4]/nav/div[4]/ul/li[3]/div[1]")).click();
		Thread.sleep(1000);
		//quotes buton press
		driver.findElement(By.xpath("/html/body/div[6]/div[4]/nav/div[4]/ul/li[3]/div[2]/div/div/ul/li[3]")).click();//ISSUE IS ID CHANGES
		Thread.sleep(8000);
	}
	public void selectone() throws InterruptedException {
		 WebElement checkbox = driver.findElement(By.name("checkbox_402000041914"));

	        // Check the checkbox if it is not already checked
	        if (!checkbox.isSelected()) {
	            checkbox.click();
	        }
	        Thread.sleep(1000);
	}
	public void Assignto()
	{
		driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[4]/div/div[2]/div/div/div[1]/div/span[1]/button")).click();
		driver.findElement(By.xpath("/html/body/div[6]/div[5]/div[2]/div/div/form/div[3]/button[2]")).click();
	}
	public void Updateto() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[4]/div/div[2]/div/div/div[1]/div/span[2]/button/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("ember-power-select-placeholder")).click();
		driver.findElement(By.className("ember-power-select-search-input")).sendKeys(Keys.DOWN,Keys.ENTER);
		List<WebElement> l1 = driver.findElements(By.className("ember-power-select-placeholder"));
		l1.get(1).click();
		driver.findElement(By.className("ember-power-select-search-input")).sendKeys("acme");
		Thread.sleep(2000);
		driver.findElement(By.className("ember-power-select-search-input")).sendKeys(Keys.DOWN,Keys.ENTER);
		//save
		driver.findElement(By.xpath("/html/body/div[6]/div[5]/div[2]/div/div/form/div[4]/button[2]")).click();
		Thread.sleep(2000);
	}
	
	public void delete() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[4]/div/div[2]/div/div/div[1]/div/span[3]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter value']")).sendKeys("4701");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[6]/div[5]/div[2]/div/div/div[3]/button[2]")).click();
		
	}
}
