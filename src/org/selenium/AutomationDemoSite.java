package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationDemoSite {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dines\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebElement mvc = driver.findElement(By.partialLinkText("Practice Site"));
	     Actions ac = new Actions(driver);
	     ac.moveToElement(mvc).build().perform();
	     ac.click().perform();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.navigate().back();
	     WebElement mvcc = driver.findElement(By.partialLinkText("Practice Site"));
	     Actions acc = new Actions(driver);
	     acc.moveToElement(mvcc).build().perform();
	     acc.click().perform();
	     driver.findElement(By.xpath("//a[@data-product_id='165']")).click();
	     driver.findElement(By.xpath("//a[@class='wpmenucart-contents']")).click();
	     driver.findElement(By.xpath("//input[@min='0']")).clear();
	     driver.findElement(By.xpath("//input[@min='0']")).sendKeys("0");
	     driver.findElement(By.xpath("(//input[@class='button'])[2]")).click();
	     driver.navigate().back();
	     driver.findElement(By.xpath("//a[@data-product_id='165']")).click();
	     
	     String a = driver.findElement(By.xpath("//a[@class='wpmenucart-contents']")).getText();
		 System.out.println(a);
		 String b = driver.findElement(By.xpath("(//span[@class='woocommerce-Price-amount amount'])[4]")).getText();
		 System.out.println(b);	 
		 boolean d=a.contains(b);
		 System.out.println(d);
		 driver.findElement(By.xpath("//a[@class='wpmenucart-contents']")).click();
		 driver.findElement(By.xpath("//input[@min='0']")).clear();
		 driver.findElement(By.xpath("//input[@min='0']")).sendKeys("4");
		  driver.findElement(By.xpath("(//input[@class='button'])[2]")).click();
			Thread.sleep(5000);
		  driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']")).click();
		  String ab = driver.findElement(By.xpath("//span[@class='amount']")).getText();
			 System.out.println(ab);
			 String bt= driver.findElement(By.xpath("(//span[@class='woocommerce-Price-amount amount'])[1]")).getText();
			 System.out.println(bt);	 
			 boolean da=ab.equals(bt);
			 System.out.println(da);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//b[@role='presentation'])[2]")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			WebElement mv = 	driver.findElement(By.xpath("//div[@class='select2-result-label']"));
			Thread.sleep(3000);
			for(int i=0 ;i<=4;i++)
			{
		 	Robot r = new Robot();
		 	r.keyPress(KeyEvent.VK_DOWN);
		 	r.keyRelease(KeyEvent.VK_DOWN);
		 	r.keyPress(KeyEvent.VK_ENTER);
		 	r.keyRelease(KeyEvent.VK_ENTER);}
			Actions abb = new Actions(driver);
		    
		     abb.click().perform();
			
		 	driver.findElement(By.xpath("(//b[@role='presentation'])[1]")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			WebElement mvm = 	driver.findElement(By.xpath("//div[@class='select2-result-label']"));
			Thread.sleep(3000);
			for(int i=0 ;i<=4;i++)
			{
		 	Robot re = new Robot();
		 	re.keyPress(KeyEvent.VK_DOWN);
		 	re.keyRelease(KeyEvent.VK_DOWN);
		 	re.keyPress(KeyEvent.VK_ENTER);
		 	re.keyRelease(KeyEvent.VK_ENTER);}
			Actions abbc = new Actions(driver);
		    
		     abbc.click().perform();
			
			
			
			
	}

}
