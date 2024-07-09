  package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//web driver methods


public class Methods {
	
	
	public static void main(String[] args) {
//		syntax
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
//		String title = driver.getTitle();
//		System.out.println(title);
//		
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
		
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
		
//		driver.close();
//		System.out.println(driver);
		
//	driver.quit();
//	System.out.println(driver);
		
		
//		driver.navigate().to("https://www.amazon.in/");
//		driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();
		
		
//		Manage commands

		
//		driver.manage().window().maximize();
//		driver.manage().window().fullscreen();
//		Dimension size = driver.manage().window().getSize();
//		System.out.println(size);
		
		
//		Dimension r = new Dimension(1280, 720);
//		driver.manage().window().setSize(r);
				
		
		
		
	
	   WebElement element = driver.findElement(By.xpath(null));
	   element.sendKeys("akshayapandiyan");
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
