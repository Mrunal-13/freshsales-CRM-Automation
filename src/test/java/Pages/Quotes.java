package Pages;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseTest;

public class Quotes extends BaseTest {
	public Quotes(WebDriver driver) {
        BaseTest.driver = driver;
    }
	
	public void dealbtn() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); // 10 seconds timeout

		// Wait for the element to be visible
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("button--container_rqMyrzFn3r_tdZhm")));

		//dealbtn press
		driver.findElement(By.xpath("/html/body/div[6]/div[4]/nav/div[4]/ul/li[3]/div[1]")).click();
		Thread.sleep(1000);
		//quotes buton press
		driver.findElement(By.xpath("/html/body/div[6]/div[4]/nav/div[4]/ul/li[3]/div[2]/div/div/ul/li[3]")).click();//ISSUE IS ID CHANGES
		Thread.sleep(8000);
		//add quote btn
		driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[3]/div[3]/div/div[2]/button")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0, 500)");
		
		//
		
	}
	public void fillquote() throws InterruptedException
	{
		driver.findElement(By.name("cpq-document[displayName]")).sendKeys("good mornng");
		List<WebElement> l2 = driver.findElements(By.className("ember-power-select-placeholder"));
		l2.get(0).click();//quoe templete
		driver.findElement(By.className("ember-power-select-search-input")).sendKeys(Keys.DOWN,Keys.ENTER);
		
		l2.get(1).click();//deal
		driver.findElement(By.className("ember-power-select-search-input")).sendKeys("Acme");
		Thread.sleep(2000);
		
		driver.findElement(By.className("ember-power-select-search-input")).sendKeys(Keys.DOWN,Keys.ENTER);
		
		
		
		
		
	}
	
	public void savebtn1() throws InterruptedException {
		try {
			driver.findElement(By.xpath("//*[@id=\"ember5265\"]")).click();
		}
		catch(Exception e)
		{
			Thread.sleep(2000);
			System.out.println("id changed");
		}
		
	}
	
	public void selectall() throws InterruptedException {
		 WebElement checkbox = driver.findElement(By.name("allChecked"));

	        // Check the checkbox if it is not already checked
	        if (!checkbox.isSelected()) {
	            checkbox.click();
	        }
	        Thread.sleep(1000);
	}
	
	public void editcolmn() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[3]/div[3]/div/div[4]/button")).click();
		Thread.sleep(2000);
		//sve btn for edit column but id changes
		driver.findElement(By.xpath("/html/body/div[6]/div[5]/div[2]/div/div/form/div[3]/button[2]")).click();
	}

}
