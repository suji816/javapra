package com.selenium;

import java.time.Duration;
import java.util.NoSuchElementException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Fluent {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\practrics\\driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement btncreate = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		btncreate.click();
		
		
		Wait<WebDriver> Wait = new FluentWait<WebDriver>(driver).
				withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		
		
		
       WebElement a = Wait.until(new Function<WebDriver,WebElement>(){

			@Override
			public WebElement apply(WebDriver arg0) {
			 
				return  driver.findElement(By.xpath("//input[@placeholder='First name']"));
			}});
	
		
		WebElement findElement = driver.findElement(By.xpath("//input[@placeholder='First name']"));
			

		
		
	
        
        
        a.sendKeys("sujith");
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
