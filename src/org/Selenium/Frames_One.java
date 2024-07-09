package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_One {
	
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		
		
//		WebElement scrolldown = driver.findElement(By.xpath("//a[text()='Home']"));
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView()",scrolldown );
		
//		parent
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='parentframe']"));
		driver.switchTo().frame(frame2);
		
	
//		Single
//		child
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(frame);
		driver.switchTo().parentFrame();		
		WebElement innertext = driver.findElement(By.xpath("//input[@type='text']"));
		innertext.sendKeys("Mera Brother RK");
		
	}

}
