package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dines\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		//System.setProperty("webdriver.edge.driver",
			//	"C:\\Users\\dines\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
		//WebDriver edge = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String a = driver.getCurrentUrl();
		System.out.println(a);
		
		String b = driver.getTitle();
		System.out.println(b);
		
		if (a.contains("facebook")) {
if(b.contains("Facebook")) {
	System.out.println("Title and current url are same");
}
		}else {	
	System.out.println("Title and current url are different");
	
		}
driver.navigate().to("https://www.instagram.com/?hl=en");
String c = driver.getTitle();
System.out.println(c);
driver.navigate().to("https://twitter.com/?lang=en");
String d = driver.getTitle();
System.out.println(d);		
String e = driver.getCurrentUrl();
System.out.println(e);	
String f = driver.getTitle();
System.out.println(f);
driver.navigate().back();
String g = driver.getTitle();
System.out.println(g);
driver.navigate().to("https://www.youtube.com/");
String h = driver.getTitle();
System.out.println(h);
driver.navigate().back();
String i = driver.getTitle();
System.out.println(i);
driver.navigate().forward();
String j = driver.getTitle();
System.out.println(j);
String k = driver.getTitle();
System.out.println(k);		
String l = driver.getCurrentUrl();
System.out.println(l);	
driver.navigate().refresh();
if (k.contains("YouTube")) {
if(l.contains("youtube")) {
System.out.println("Title and current url are same");
}
}else {	
System.out.println("Title and current url are different");

}
driver.close();		
System.out.println("sucesss");		

}}