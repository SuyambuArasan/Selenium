package org.selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTask {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dines\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		Thread.sleep(3000);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Surya");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("Kumar");
		//Thread.sleep(8000);
		//WebElement sex = driver.findElement(By.xpath("//input[@value='Male']"));
		//sex.click();
		WebElement exp = driver.findElement(By.xpath("//input[@value='7']"));
		exp.click();
		WebElement date = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		date.sendKeys("7jan2022");
		WebElement pro = driver.findElement(By.xpath("//input[@value='Automation Tester']"));
		pro.click();
		WebElement fav = driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
		fav.click();
		WebElement con = driver.findElement(By.name("continents"));
		Select cont = new Select (con);
		cont.selectByIndex(6);
		List<WebElement> l = cont.getOptions();
		for (int i=0; i<l.size();i++) {
		System.out.println(l.get(i).getText())	;
		}
TakesScreenshot anew =(TakesScreenshot) driver;
		
		File bnew = anew.getScreenshotAs(OutputType.FILE);
		 File cnew= new File("C:\\Users\\dines\\eclipse-workspace\\Selenium\\Screenshots\\web.png");
		 FileUtils.copyFile(bnew, cnew);
		
			
		
		
		
	}

}
