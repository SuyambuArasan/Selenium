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
import org.openqa.selenium.support.ui.Select;



public class Task2 {

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
		WebElement reenter = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[4]"));
		reenter.sendKeys("don@gmail.com");
		WebElement date = driver.findElement(By.id("day"));
		Select s = new Select (date);
		s.selectByIndex(6);
		WebElement month = driver.findElement(By.id("month"));
		Select sa = new Select (month);
		sa.selectByValue("8");
		WebElement year = driver.findElement(By.id("year"));
		Select san = new Select (year);
		san.selectByVisibleText("1995");
TakesScreenshot anew =(TakesScreenshot) driver;
		
		File bnew = anew.getScreenshotAs(OutputType.FILE);
		 File cnew= new File("C:\\Users\\dines\\eclipse-workspace\\Selenium\\Screenshots\\fb.png2");
		 FileUtils.copyFile(bnew, cnew);
		 
		
		
		
		
		
		
		
		
		
		
		
	}

}
