package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties loc = new Properties();
	public static FileReader fr1;
	public static FileReader fr2;
	
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		if (driver==null) {
			FileReader fr1 = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
			prop.load(fr1);
			FileReader fr2 = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\locators.properties");
			loc.load(fr2);
		}
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(prop.getProperty("testurl"));
			Thread.sleep(4000);
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("edgedriver")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(prop.getProperty("testurl"));
		}
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
		System.out.println("execution done");
	}

}
