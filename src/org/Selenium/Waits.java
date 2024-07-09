package org.Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//    1. Thread.sleep(0);	
		
	
		
		driver.get("https://booking-dev.hellolunajoy.com/?referal=website-insurance-validation");
		
		Thread.sleep(5000);
		
		WebElement Firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
		Firstname.sendKeys("Akshaya");
		
//		----------------------
		
		
/*  2.Implicit wait
	global Declare
    only find element &elements
    
    SYNTAX:
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.Seconds);
		
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    If the element does not find it will throw NoSuchElementException at run-time
		
	*/
		
//		driver.navigate().to("https://letcode.in/waits");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//button[@id='accept']")).click();
		
		
		
	/*	3. Explicit wait
		SYNTAX:
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.alertIsPresent());
		
	 If the element does not find it will throw Exceptions depends on given condition
		
		*/
		driver.navigate().to("https://letcode.in/waits"
				
				);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@id='accept']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		
		
		
		
	}
	
	

}
