package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dines\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement Firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		Firstname.sendKeys("Dinesh");
		WebElement Lastname = driver.findElement(By.id("lastName"));
		Lastname.sendKeys("k");
		WebElement mail = driver.findElement(By.id("userEmail"));
		mail.sendKeys("Dinesh@yahoo.com");
		WebElement gender = driver.findElement(By.xpath("//div[@class='"
				+ "custom-control custom-radio custom-control-inline']"));
		gender.click();
		WebElement m = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
	m.sendKeys("987654321");
	
//WebElement l = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
	//l.sendKeys("3 jan 1995");

	WebElement g = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
	g.sendKeys("selenium");
	//Thread.sleep(9000);
	//WebElement gen = driver.findElement(By.xpath("//input[@type='checkbox'][@id='hobbie"
		//	+ "s-checkbox-1'][@class='custom-control-input'][@value='1']"));
	//gen.click();
	}

}
