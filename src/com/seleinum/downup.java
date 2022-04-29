package com.seleinum;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class downup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\practrics\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement down = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		executor.executeScript("arguments[0][1].scrollIntoView(true)", down);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
