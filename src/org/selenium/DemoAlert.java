package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAlert {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dines\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='header-text'])[3]")).click();	
		driver.findElement(By.xpath("(//li[@id='item-1'])[2]")).click();
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		org.openqa.selenium.Alert s = driver.switchTo().alert();
	       String text =s.getText();
			System.out.println(text);
	       s.sendKeys("DineshK");
	       s.accept();
	       TakesScreenshot anew =(TakesScreenshot) driver;
			
			File bnew = anew.getScreenshotAs(OutputType.FILE);
			 File cnew= new File("C:\\Users\\dines\\eclipse-workspace\\Selenium\\Screenshots\\web.png");
			 FileUtils.copyFile(bnew, cnew);
	       
	}

}
