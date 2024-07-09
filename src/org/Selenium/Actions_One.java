package org.Selenium;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_One {
	
	
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com.au/");
		driver.manage().window().maximize();
//		synax
		Actions ac = new Actions(driver);
//		
//		WebElement motor = driver.findElement(By.xpath("//li[@class='vl-flyout-nav__js-tab']//a[contains(text(),'Motors')]"));
//		ac.moveToElement(motor).perform();
		
//		ac.click(motor).perform();
		
//		ac.contextClick(motor).perform();
//		
//		WebElement Search = driver.findElement(By.xpath("//input[@id='gh-ac']"));
//		Search.sendKeys("Akshaya");
//		ac.doubleClick(Search).perform();
		
		driver.navigate().to("https://demo.automationtesting.in/Static.html");
		
		
		WebElement Home = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", Home);
		
		WebElement source = driver.findElement(By.xpath("//img[@id='mongo']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droparea']"));
		
		ac.dragAndDrop(source, target).perform();
			
	}
	
	
	
	
	
	

}
