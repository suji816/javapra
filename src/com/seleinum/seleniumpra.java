package com.seleinum;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa. selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class seleniumpra {
	

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\practrics\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtuser = driver.findElement(By.id("email"));
		
		Actions actions = new Actions(driver);
		
		actions.keyDown(Keys.SHIFT).sendKeys(txtuser,"sujith").keyUp(Keys.SHIFT).perform();
		
		
		Actions actions1 = new Actions(driver);
		
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		Thread.sleep(3000);
		
		actions1.keyDown(Keys.SHIFT).sendKeys(txtpass,"123456").keyUp(Keys.SHIFT).perform();
		
		
		
	}

	
	 
	
	

}
