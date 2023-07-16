package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseTest;

public class groupAndSortPage extends BaseTest {
	public groupAndSortPage(WebDriver driver) {
        BaseTest.driver = driver;
    }
	
	public void group() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); // 10 seconds timeout

		// Wait for the element to be visible
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("title_aJku8VkYyWj6wuiM")));
		element.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[16]/div/div/div/div[2]/ul/li[3]")).click();
		//sorting
		
		driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[4]/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/div/div[1]/button[3]/button")).click();//sortby
		Thread.sleep(2000);
		//asec drodown
		driver.findElement(By.xpath("/html/body/div[18]/div/div/div/div/div[2]/div[2]/button/div/span[3]")).click();//problem with elements chnging//
		Thread.sleep(2000);//asec value
		driver.findElement(By.xpath("/html/body/div[19]/div/div/div/ul/li[1]")).click();
		
	}
}
