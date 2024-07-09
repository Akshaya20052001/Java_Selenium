package org.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_One {
	
	
	
	public static void main(String[] args) throws AWTException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement switchto = driver.findElement(By.xpath("//a[normalize-space()='SwitchTo']"));
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(switchto).perform();
		
		ac.click(switchto).perform();
		
		Robot rc = new Robot();
		
		
		
		//https://retail.onlinesbi.sbi/retail/login.htm
		
		rc.keyPress(KeyEvent.VK_DOWN);
		rc.keyRelease(KeyEvent.VK_DOWN);
		
		rc.keyPress(KeyEvent.VK_DOWN);
		rc.keyRelease(KeyEvent.VK_DOWN);
		rc.keyPress(KeyEvent.VK_DOWN);
		rc.keyRelease(KeyEvent.VK_DOWN);
		
		WebElement frames = driver.findElement(By.xpath("//a[normalize-space()='Frames']"));
		
		ac.contextClick(frames).perform();
		
		
		rc.keyPress(KeyEvent.VK_DOWN);
		rc.keyRelease(KeyEvent.VK_DOWN);
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
		
//	                  windows handling 	
		
//		Single Window ----> with the help of get window handle() ------> SwitchTO()
		
//	
//     Set<String> windowHandles = driver.getWindowHandles(); // To avoid Duplicates 
//		
//		for(String windowHandle:windowHandles) {
//			driver.switchTo().window(windowHandle);	
//		}
		
		
//		Mupliple of windows -----> with the help of get window handles()-----> switch to 
			
		
		Set<String> windowHandles = driver.getWindowHandles(); //random order
		
		ArrayList<String> windows = new ArrayList<String>(windowHandles); //interstion order
		driver.switchTo().window(windows.get(1));
		
		
		
	
		
		
		
		
	
		
	
		
		
	}
	
	

}
