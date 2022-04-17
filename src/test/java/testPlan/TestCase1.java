package testPlan;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	public static WebDriver driver;
	//public WebElement googleSearch = (WebElement) By.xpath("//*[@name='id']");

	@Test
	public void launchBrowser() throws  IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://google.co.in");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Rajesh Thangavelu");
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		//googleSearch.sendKeys("Rajesh Thangavelu");
		
		File srcshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desshot = new File("C:\\Users\\NilavezhilRajesh\\eclipse-workspace\\POM\\src\\test\\resources\\screenshot\\test.png");
		FileUtils.copyFile(srcshot, desshot);
		 
		 

		// *[@name='id']
		//Thread.sleep(1000);
		//driver.quit();
		driver.quit();
        
	}

	 
		 
	

}
