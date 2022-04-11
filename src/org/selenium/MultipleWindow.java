package org.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MultipleWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dines\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebElement mvc = driver.findElement(By.partialLinkText("Multiple Windows"));
	     Actions ac = new Actions(driver);
	     ac.moveToElement(mvc).build().perform();
	     ac.doubleClick().perform();
	     WebElement mvcc = driver.findElement(By.partialLinkText("Click Here"));
	     Actions acc = new Actions(driver);
	     acc.moveToElement(mvcc).build().perform();
	     acc.click().perform();
	   
		 driver.navigate().to("https://the-internet.herokuapp.com/windows/new");
		 String c = driver.getTitle();
		 System.out.println(c);
		 
	}

}
