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

public class MouseOverActionAmazon {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dines\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1"
				+ "-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo="
				+ "&hvadid=486458706470&hvpos=&hvnetw=g&hvrand=15935140795457852964&hvqmt="
				+ "e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9075213&hvtargid=kwd-10573980&hydadcr="
				+ "14453_2154373&gclid=CjwKCAiAz--OBhBIEiwAG1rIOhtx0PyMmLMcD5W_"
				+ "zUGuTqJ6AfG4aUiW5wxmjgn8Opw71AR1w1SW9BoC2T4QAvD_BwE");
		Thread.sleep(3000);
     WebElement mv = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_1']"));
     Actions a = new Actions(driver);
     a.moveToElement(mv).build().perform();
     a.contextClick().perform();
 	Thread.sleep(3000);
 	Robot r = new Robot();
 	r.keyPress(KeyEvent.VK_DOWN);
 	r.keyRelease(KeyEvent.VK_DOWN);
 	r.keyPress(KeyEvent.VK_ENTER);
 	r.keyRelease(KeyEvent.VK_ENTER);
     driver.navigate().to("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1\"\r\n" + 
     		"				+ \"-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=\"\r\n" + 
     		"				+ \"&hvadid=486458706470&hvpos=&hvnetw=g&hvrand=15935140795457852964&hvqmt=\"\r\n" + 
     		"				+ \"e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9075213&hvtargid=kwd-10573980&hydadcr=\"\r\n" + 
     		"				+ \"14453_2154373&gclid=CjwKCAiAz--OBhBIEiwAG1rIOhtx0PyMmLMcD5W_\"\r\n" + 
     		"				+ \"zUGuTqJ6AfG4aUiW5wxmjgn8Opw71AR1w1SW9BoC2T4QAvD_BwE");
      
   
     
		Thread.sleep(3000);
	     WebElement m = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_4']"));
	     Actions ab = new Actions(driver);
	     ab.moveToElement(m).build().perform();
	     ab.contextClick().perform();
	 	Thread.sleep(3000);
	 	Robot ra = new Robot();
	 	ra.keyPress(KeyEvent.VK_DOWN);
	 	ra.keyRelease(KeyEvent.VK_DOWN);
	 	ra.keyPress(KeyEvent.VK_ENTER);
	 	ra.keyRelease(KeyEvent.VK_ENTER);
	     driver.navigate().to("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1\"\r\n" + 
	     		"				+ \"-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=\"\r\n" + 
	     		"				+ \"&hvadid=486458706470&hvpos=&hvnetw=g&hvrand=15935140795457852964&hvqmt=\"\r\n" + 
	     		"				+ \"e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9075213&hvtargid=kwd-10573980&hydadcr=\"\r\n" + 
	     		"				+ \"14453_2154373&gclid=CjwKCAiAz--OBhBIEiwAG1rIOhtx0PyMmLMcD5W_\"\r\n" + 
	     		"				+ \"zUGuTqJ6AfG4aUiW5wxmjgn8Opw71AR1w1SW9BoC2T4QAvD_BwE");
	      
   
	     
			Thread.sleep(3000);
		     WebElement mvc = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_gb']"));
		     Actions ac = new Actions(driver);
		     ac.moveToElement(mvc).build().perform();
		     ac.contextClick().perform();
		 	Thread.sleep(3000);
		 	Robot rc = new Robot();
		 	rc.keyPress(KeyEvent.VK_DOWN);
		 	rc.keyRelease(KeyEvent.VK_DOWN);
		 	rc.keyPress(KeyEvent.VK_ENTER);
		 	rc.keyRelease(KeyEvent.VK_ENTER);
		     driver.navigate().to("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1\"\r\n" + 
		     		"				+ \"-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=\"\r\n" + 
		     		"				+ \"&hvadid=486458706470&hvpos=&hvnetw=g&hvrand=15935140795457852964&hvqmt=\"\r\n" + 
		     		"				+ \"e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9075213&hvtargid=kwd-10573980&hydadcr=\"\r\n" + 
		     		"				+ \"14453_2154373&gclid=CjwKCAiAz--OBhBIEiwAG1rIOhtx0PyMmLMcD5W_\"\r\n" + 
		     		"				+ \"zUGuTqJ6AfG4aUiW5wxmjgn8Opw71AR1w1SW9BoC2T4QAvD_BwE");
		           
		     TakesScreenshot anew =(TakesScreenshot) driver;
			
				File bnew = anew.getScreenshotAs(OutputType.FILE);
				 File cnew= new File("C:\\Users\\dines\\eclipse-workspace\\Selenium\\Screenshots\\web.png");
				 FileUtils.copyFile(bnew, cnew);   
      
      
      
	}

}
