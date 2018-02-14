package com.hashworks.testing.SeliniumJenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void testStart() {
		
		 ChromeOptions options = new ChromeOptions();
         options.addArguments("headless");
         options.addArguments("window-size=1200x600");
		// driver = new FirefoxDriver();

		driver = new ChromeDriver(options);
		//WebDriver driver = new ChromeDriver(options);
	}
	@Test
	public void testFacebook() {
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("abc");
		driver.findElement(By.id("pass")).sendKeys("abc");
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
		//*[@id="u_0_2"]
		
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}
}
