package com.seleinum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\practrics\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		WebElement txtuser = driver.findElement(By.id("email"));
		//txtuser.sendKeys("sujith");
		
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		executor.executeScript("arguments[0].setAttribute('value','sujith kumar')", txtuser);
		
		Object name = executor.executeScript("return arguments[0].getAttribute('value')", txtuser);
		
		System.out.println(name);
		
		
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		
		executor.executeScript("arguments[0].setAttribute('value','123456')", txtpass);
		
		Object pass = executor.executeScript("return arguments[0].getAttribute('value')", txtpass);
		
		
		System.out.println(pass);
		
		WebElement btnlogin = driver.findElement(By.name("login"));
		executor.executeScript("arguments[0].click()", btnlogin);
		
		
		
		
		
		
	}

}
