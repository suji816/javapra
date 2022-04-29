package com.seleinum;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwebdrive {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\practrics\\driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement btncreate = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		btncreate.click();
		
		
		//implicit
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		
		//explicit
		WebDriverWait driverwait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
	     WebElement txtname = driverwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']")));
				
		
	    WebElement findElement = driver.findElement(By.xpath("//input[@placeholder='First name']"));
		
		txtname.sendKeys("sujith");
		
		
		
		
		
		
	}

}
