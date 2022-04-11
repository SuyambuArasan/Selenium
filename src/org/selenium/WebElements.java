package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dines\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.facebook.com/");
		 
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("java@gmail.com");
		username.clear();
		username.sendKeys("mava@gmail.com");
		username.isDisplayed();
		boolean a= username.isDisplayed();
		System.out.println(a);
		
		WebElement password = driver.findElement(By.name("pass"));
		String c = password.getAttribute("placeholder");
		System.out.println(c);
		password.sendKeys("9874qwerty");
		boolean b= password.isEnabled();
		System.out.println(b);
		String d = password.getAttribute("value");
		System.out.println(d);
		
		
		WebElement log = driver.findElement(By.name("login"));
		log.click();
		
		
	}

}
