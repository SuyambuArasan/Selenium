package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MiniProject1Continuation {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dines\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[4]")).click();
		driver.findElement(By.xpath("//img[@src='http://automationpractice."
				+ "com/img/p/1/0/10-home_default.jpg']")).click();
		Thread.sleep(2000);
		   WebElement m = driver.findElement(By.xpath("//a[@id='color_24']"));
		     Actions ab = new Actions(driver);
		     ab.moveToElement(m).build().perform();
		     ab.click().perform();
		 	Thread.sleep(3000);
		
		 	WebElement mvc = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		 	Actions ac = new Actions(driver);
		     ac.moveToElement(mvc).build().perform();
		     ac.click().perform();
		 	Thread.sleep(3000);
		 	Robot rc = new Robot();
		 	
		 	for(int i=0 ;i<=5;i++)
		 	{	rc.keyPress(KeyEvent.VK_ENTER);
		 	rc.keyRelease(KeyEvent.VK_ENTER);
		 	}
		 
		 	  TakesScreenshot anew =(TakesScreenshot) driver;
				
				File bnew = anew.getScreenshotAs(OutputType.FILE);
				 File cnew= new File("C:\\Users\\dines\\eclipse-workspace\\Selenium\\Screenshots\\web1.png");
				 FileUtils.copyFile(bnew, cnew);  	
				 Thread.sleep(3000);
				 driver.findElement(By.xpath("(//p[@class='buttons_bottom_block no-print'])[1]")).click();
				 Thread.sleep(3000);
					driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();
					 Thread.sleep(3000);
					driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();
					Thread.sleep(3000);
					WebElement emailaddress = driver.findElement(By.xpath("//input[@id='email']"));
					emailaddress.sendKeys("kdinesh@siminfosystems.com");
					WebElement pass = driver.findElement(By.xpath("//input[@id='passwd']"));
					pass.sendKeys("DineshDon@984262");
					 driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
					 Thread.sleep(3000);
					 driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
					 Thread.sleep(3000);
					 driver.findElement(By.xpath("//input[@id='cgv']")).click();
					 Thread.sleep(3000);
	 
					 driver.findElement(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']")).click();
					 Thread.sleep(3000);
					 driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
					 Thread.sleep(3000);
					 driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
					 Thread.sleep(3000);
					 

				 	  TakesScreenshot abnew =(TakesScreenshot) driver;
						
						File bbnew = abnew.getScreenshotAs(OutputType.FILE);
						 File cbnew= new File("C:\\Users\\dines\\eclipse-workspace\\Selenium\\Screenshots\\web2.png");
						 FileUtils.copyFile(bbnew, cbnew); 	 
					 
					 
					 
					 
					 
	}

}
