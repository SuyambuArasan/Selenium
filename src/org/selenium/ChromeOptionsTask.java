package org.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsTask {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dines\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.addArguments("start-maximized");

		WebDriver driver = new ChromeDriver(options);	
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html?m=1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		List<WebElement> tablebody = driver.findElements(By.tagName("tbody"));
		
		for (int i=1; i<=tablebody.size();i--) {
			 {
			
				List<WebElement> trow= driver.findElements(By.tagName("tr"));	
				for (int j=7; j<=trow.size();j--) 
			
				{
				
				WebElement row = driver.findElement(By.xpath("//table//tbody["+i+"]//tr["+j+"]"));
				 System.out.println(row.getText());
			
				
			
			}
				
		
				
		}
		
		
		
		
		
		

	}

}}
