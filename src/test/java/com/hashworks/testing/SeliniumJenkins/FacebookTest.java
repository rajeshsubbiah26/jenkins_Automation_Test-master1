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
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class FacebookTest {
	
	HtmlUnitDriver driver;
	
	@BeforeTest
	public void testStart() {
		
		 //ChromeOptions options = new ChromeOptions();
         //options.addArguments("headless");
        // options.addArguments("window-size=1200x600");
		// driver = new FirefoxDriver();

		//driver = new ChromeDriver(options);
		//WebDriver driver = new ChromeDriver(options);
		driver = new HtmlUnitDriver();
	}
	@Test
	public void testFacebook() {
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("Title of the page is : "+driver.getTitle());
		System.out.println("Browser in use : "+driver.getBrowserVersion());
		driver.findElement(By.id("email")).sendKeys("abc");
		driver.findElement(By.id("pass")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		//driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
	
		
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}
}
