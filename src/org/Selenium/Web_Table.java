package org.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v123.page.Page.GetAppIdResponse;

public class Web_Table {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://qavbox.github.io/demo/webtable/");
		driver.manage().window().maximize();
		

//		td- table data
		
		WebElement data = driver.findElement(By.xpath("//table[@id='table02']/tbody/tr[3]/td[3]"));
		System.out.println(data.getText());
       System.out.println("----------------");
       
       
//       WebElement row = driver.findElement(By.xpath("//table[@id='table02']/tbody/tr[2]/td"));
//       System.out.println(row.getText());
       
//		tr= table row
       
       List<WebElement> row = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr[2]/td"));
       for (WebElement element : row) {
    	   System.out.println(element.getText());
		
	}
       
//       total table values- //table[@id='table02']/tbody/tr/td
       
       
       List<WebElement> coloum = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td[3]"));
       for (WebElement element : coloum) {
    	   System.out.println(element.getText());
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
	}
	
	  
	
	
	
	
	}
}
