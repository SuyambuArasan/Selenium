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

public class MiniProject1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dines\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='login']")).click();
		WebElement emailaddress = driver.findElement(By.xpath("//input[@id='email_create']"));
		emailaddress.sendKeys("kdinesh@siminfosystems.com");	
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@class='btn btn-default button button-medium exclusive']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("(//input[@name='id_gender'])[1]")).click();
		WebElement cusname = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		cusname.sendKeys("Dinesh");	
		WebElement lname = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		lname.sendKeys("K");	
		//WebElement mail = driver.findElement(By.xpath("//input[@id='email']"));
		//mail.sendKeys("dineshkasiraman@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@id='passwd']"));
		pass.sendKeys("DineshDon@984262");
		WebElement days = driver.findElement(By.id("days"));
		Select sa = new Select (days);
		sa.selectByValue("3");
		WebElement month = driver.findElement(By.id("months"));
		Select san = new Select (month);
		san.selectByValue("1");
		WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
		Select sany = new Select (year);
		sany.selectByValue("1995");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.xpath("//input[@id='firstname']"));
		name.sendKeys("Dinesh");
		WebElement nam = driver.findElement(By.xpath("//input[@id='lastname']"));
		nam.sendKeys("k");
		WebElement namc = driver.findElement(By.xpath("//input[@id='company']"));
		namc.sendKeys("siminfo");
		WebElement namca = driver.findElement(By.xpath("//input[@id='address1']"));
		namca.sendKeys("Nehru,00000,siminfo");
		WebElement ca = driver.findElement(By.xpath("//input[@id='address2']"));
		ca.sendKeys("kottivakkam");
		WebElement a = driver.findElement(By.xpath("//input[@id='city']"));
		a.sendKeys("Chennai");
	
		WebElement state = driver.findElement(By.xpath("(//select[@class='form-control'])[4]"));
		Select se = new Select(state);
		se.selectByIndex(6);
		
		WebElement ab = driver.findElement(By.xpath("//input[@id='postcode']"));
		ab.sendKeys("00000");
	
		WebElement country = driver.findElement(By.xpath("//select[@id='id_country']"));
		Select sen = new Select (country);
		sen.selectByIndex(1);
		
		WebElement abc = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
		abc.sendKeys("8754935639");
		WebElement abcd = driver.findElement(By.xpath("//input[@id='alias']"));
		abcd.sendKeys("My address durga");
		Thread.sleep(30000);
		driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
		 TakesScreenshot anew =(TakesScreenshot) driver;
			
			File bnew = anew.getScreenshotAs(OutputType.FILE);
			 File cnew= new File("C:\\Users\\dines\\eclipse-workspace\\Selenium\\Screenshots\\web.png");
			 FileUtils.copyFile(bnew, cnew);
		
		
	}

}
