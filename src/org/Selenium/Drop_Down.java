
package org.Selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		
		WebElement country = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		country.click();
		
		
//		Syntax :
//
//			Select s = new Select(WebElement);
		
		
		Select sc = new Select(country);
		
//		1.find no of options
		
	
		
		List<WebElement> options = sc.getOptions();
		System.out.println(options.size());
		
		
//		2.capture all the option
		
//		for (WebElement alloptions : options) {
//			System.out.println(alloptions.getText());
//			
//		}
		
		
//		3. selectby index
		
		
		sc.selectByIndex(5);
		
		Thread.sleep(2000);
		
//		4. select by value
		sc.selectByValue("BLR");
		Thread.sleep(2000);
		
		
//		5.select by visible text
		sc.selectByVisibleText("Australia");
		
		
		
		
//		Screenshot
		
//		chidclass name ref = new(ChildCLassName)  Parent class
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\DELL\\eclipse-workspace\\First_Project\\NewScreenshot\\"+"demo.png");
		FileUtils.copyFile(source, destination);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
