package org.selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class VaccineTask {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dines\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.cowin.gov.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement a=  driver.findElement(By.xpath("(//div[@role='tab'])[2]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",a);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("600089");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 WebElement b=  driver.findElement(By.xpath("//button[@class='searchBtn pin-search-btn accessibility-plugin-ac']"));	
	 JavascriptExecutor executo = (JavascriptExecutor)driver;
		executo.executeScript("arguments[0].click();",b);	
	
		 WebElement c=  driver.findElement(By.xpath("(//label[@class='accessibility-plugin-ac'])[2]"));	
		 JavascriptExecutor execut = (JavascriptExecutor)driver;
			execut.executeScript("arguments[0].click();",c);
			
			 WebElement d=  driver.findElement(By.xpath("(//label[@class='accessibility-plugin-ac'])[4]"));	
			 JavascriptExecutor execu = (JavascriptExecutor)driver;
				execu.executeScript("arguments[0].click();",d);	
			
		
				 WebElement e=  driver.findElement(By.xpath("(//label[@class='accessibility-plugin-ac'])[6]"));	
				 JavascriptExecutor xecuto = (JavascriptExecutor)driver;
					xecuto.executeScript("arguments[0].click();",e);
					
					
					 WebElement f=  driver.findElement(By.xpath("(//label[@class='accessibility-plugin-ac'])[10]"));	
					 JavascriptExecutor to = (JavascriptExecutor)driver;
						to.executeScript("arguments[0].click();",f);
						
						
						String m  =  driver.findElement(By.xpath("//p[@class='available-para']")).getText(); 
						 System.out.println(m);	
						 
						 WebElement h=  driver.findElement(By.xpath("(//label[@class='accessibility-plugin-ac'])[10]"));	
						 JavascriptExecutor tom = (JavascriptExecutor)driver;
							tom.executeScript("arguments[0].click();",h);	 
						 
						 WebElement g=  driver.findElement(By.xpath("(//label[@class='accessibility-plugin-ac'])[8]"));	
						 JavascriptExecutor too = (JavascriptExecutor)driver;
							too.executeScript("arguments[0].click();",g);	
							
							String mq  =  driver.findElement(By.xpath("//div[@class='main-slider-wrap col col-lg-3 col-md-3 col-sm-3 col-xs-12']")).getText(); 
							 System.out.println(mq);				
							 System.out.println("***********"); 
				 String mqm  =  driver.findElement(By.xpath("(//label[@class='accessibility-plugin-ac'])[2]")).getText(); 
			 System.out.println(mqm);
			 boolean da =mq.contains(mqm);
			 System.out.println(da);
			 System.out.println("***********"); 
			 
			 String shield  =  driver.findElement(By.xpath("(//p[@class='vaccine-details'])[1]")).getText(); 	
			 System.out.println(shield);
			 boolean s =mq.contains("COVISHIELD");
			 System.out.println(s);
			 System.out.println("***********"); 
			 String paid  =  driver.findElement(By.xpath("(//label[@class='accessibility-plugin-ac'])[6]")).getText(); 	
			 System.out.println(paid);
			 boolean w =mq.contains("PAID");
			 System.out.println(w);
			 System.out.println("***********"); 
			 String dose  =  driver.findElement(By.xpath("(//label[@class='accessibility-plugin-ac'])[4]")).getText(); 	
			 System.out.println(dose);
			 boolean wa =mq.contains("Dose: #2");
			 System.out.println(wa);
			 
			 
			 
	}

}
