package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeTask {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dines\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		WebElement na = driver.findElement(By.xpath("//input[@id='search']"));
		na.sendKeys("Selenium");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		String a = driver.getCurrentUrl();
		System.out.println(a);
		Thread.sleep(9000);
		driver.findElement(By.xpath("//h3[@title='Selenium 6 Hours"
				+ " Training from Zero to Advance Concepts']")).click();
		Thread.sleep(9000);	
		String b = driver.getTitle();
		System.out.println(b);
	       TakesScreenshot anew =(TakesScreenshot) driver;
		File bnew = anew.getScreenshotAs(OutputType.FILE);
		 File cnew= new File("C:\\Users\\dines\\eclipse-workspace\\Selenium\\Screenshots\\web.png");
		 FileUtils.copyFile(bnew, cnew);
		
		
		

	}

}
