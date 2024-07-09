package org.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		WebElement Js = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		Js.click();
		
//		accept----> ok
//		Dismiss ----> cancel
		
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());	
		Thread.sleep(2000);
		alert.sendKeys("Hello");
		alert.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
