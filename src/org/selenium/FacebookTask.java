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

public class FacebookTask {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dines\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Thread.sleep(3000);
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		Thread.sleep(3000);
		WebElement firstname = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
		firstname.sendKeys("don");
		WebElement name = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]"));
		name.sendKeys("don don");
		WebElement na = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]"));
		na.sendKeys("don@gmail.com");
		WebElement nam = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]"));
		nam.sendKeys("don@639874");
		WebElement cre = driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
		cre.click();
		TakesScreenshot a =(TakesScreenshot) driver;
		
		File b = a.getScreenshotAs(OutputType.FILE);
		 File c= new File("C:\\Users\\dines\\eclipse-workspace\\Selenium\\Screenshots\\fb.png");
		 FileUtils.copyFile(b, c);
		 
		

	}

}
