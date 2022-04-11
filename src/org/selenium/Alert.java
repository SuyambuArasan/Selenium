package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dines\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();	
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click(); 
		driver.switchTo().alert();
		
	}

}
