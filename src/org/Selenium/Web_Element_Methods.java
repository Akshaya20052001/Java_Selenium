package org.Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Element_Methods {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Akshaya");
		
		
//		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
//		
		
//		Thread.sleep(2000);
//		isDisplayed(); ---->Is this element displayed or not? This method avoids the problem of having to parse an element's "style" attribute.
//		isEnabled(); ---->Is the element currently enabled or not? This will generally return true for everything but disabled input elements.
//		isSelected(); --->Determine whether this element is selected or not.(Checkbox/Radio Buttons)
		
		
//		WebElement element = driver.findElement(By.xpath("//button[text()='Search']"));
//		System.out.println(element.isEnabled());

		
		driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
		male.click();
		
		WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));
		female.click();
		
		System.out.println(female.isSelected());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
