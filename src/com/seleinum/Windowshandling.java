package com.seleinum;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandling {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\practrics\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		
	    driver.manage().window().maximize();
	     
	    WebElement txtsearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    
	    txtsearch.sendKeys("iphone",Keys.ENTER);
	    
	    WebElement btnclick = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]"));
		
	    btnclick.click();
	    
	    String patwinid = driver.getWindowHandle();
	    System.out.println(btnclick);
		
	    Set<String> allwinid = driver.getWindowHandles();
		System.out.println(allwinid);
		
		for (String win : allwinid) {
			
			if (!(patwinid.equals(win))) {
				
				driver.switchTo().window(win);
				
			}
			
		}
		WebElement btnclick1 = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		
		btnclick1.click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
