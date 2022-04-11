package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Forex {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dines\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.airasia.co.in/home?gclid=Cj0KCQiAoY-PBhCNARIsABcz770vwgUKDgNIDatUC_XoHz1fmpdtBQByIaq0DQS5NV5ZFmYHUM79iuoaAmSoEALw_wcB");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='flight-search-source-field-read-only']")).click();
		driver.findElement(By.xpath("//input[@class='set-outline form-control']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[@class='arrival-dropdown-content'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Kolkata");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"(//button[@class='arrival-dropdown-list-group-item list-group-item list-group-item-action'])[1]"))
				.click();
		driver.findElement(By.xpath("//img[@class='flight-search-icon']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='flight-search-guest-details-wrapper']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		for (int i = 0; i <= 2; i++) {
			driver.findElement(By.xpath("(//img[@id='adult'])[2]")).click();
		}

		driver.findElement(By.xpath("(//img[@id='child'])[2]")).click();
		driver.findElement(By.xpath("(//img[@id='student'])[2]")).click();
		Thread.sleep(1000);
		TakesScreenshot anew = (TakesScreenshot) driver;
		File bnew = anew.getScreenshotAs(OutputType.FILE);
		File cnew = new File("C:\\Users\\dines\\eclipse-workspace\\Selenium\\Screenshots\\web.png");
		FileUtils.copyFile(bnew, cnew);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='done_button doneButtonText btn btn-primary']")).click();
		driver.findElement(By.xpath("//input[@name='nonstop']")).click();
		driver.findElement(By.xpath("//label[@id='depAfterSix']")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String m = driver.findElement(By.xpath("//div[@class='flight-search-date-picker-wrapper']")).getText();
		System.out.println(m);
		String n = driver.findElement(By.xpath("//div[@class='fa-mc-date']")).getText();
		System.out.println(n);
		System.out.println(m);
		boolean da = m.contains(n);
		System.out.println(da);
		WebElement mv = driver.findElement(By.xpath("(//div[@class='b2c-standard-price'])[2]"));
		JavascriptExecutor execut = (JavascriptExecutor) driver;
		execut.executeScript("arguments[0].click();", mv);

		WebElement mvm = driver.findElement(By.xpath("//button[@class='continue-btn']"));
		JavascriptExecutor execu = (JavascriptExecutor) driver;
		execu.executeScript("arguments[0].click();", mvm);

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(6000);
		WebElement mvmm = driver.findElement(By.xpath("(//input[@name='title'])[1]"));
		JavascriptExecutor exec = (JavascriptExecutor) driver;
		exec.executeScript("arguments[0].click();", mvmm);

		WebElement mvs = driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[1]"));
		JavascriptExecutor e = (JavascriptExecutor) driver;
		e.executeScript("arguments[0].click();", mvs);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[1]")).sendKeys("Dinesh");

		WebElement mvsv = driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[2]"));
		JavascriptExecutor er = (JavascriptExecutor) driver;
		er.executeScript("arguments[0].click();", mvsv);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[2]")).sendKeys("k");

		WebElement mvsvq = driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[3]"));
		JavascriptExecutor erq = (JavascriptExecutor) driver;
		erq.executeScript("arguments[0].click();", mvsvq);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[3]"))
				.sendKeys("dineshkasiraman@gmail.com");

		WebElement mvsvf = driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[4]"));
		JavascriptExecutor erf = (JavascriptExecutor) driver;
		erf.executeScript("arguments[0].click();", mvsvf);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[4]")).sendKeys("9842625543");

		WebElement mvsvff = driver
				.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root'])[1]"));
		JavascriptExecutor erff = (JavascriptExecutor) driver;
		erff.executeScript("arguments[0].click();", mvsvff);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//div[@class='MuiPickersCalendar-week']//ancestor::div[@class='MuiPaper-root MuiPopover-paper MuiPaper-elevation8 MuiPaper-rounded']"))
				.click();
		Thread.sleep(1000);
		WebElement v = driver.findElement(
				By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersDay-day'])[3]"));
		Thread.sleep(1000);
		Actions va = new Actions(driver);
		va.moveToElement(v).build().perform();
		va.doubleClick().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root'])[1]")).click();
		Thread.sleep(1000);
		WebElement vj = driver.findElement(
				By.xpath("//h6[@class='MuiTypography-root MuiPickersToolbarText-toolbarTxt MuiTypography-subtitle1']"));
		Thread.sleep(1000);
		Actions vaj = new Actions(driver);
		vaj.moveToElement(vj).build().perform();
		vaj.click().perform();

		WebElement mvsvfff = driver.findElement(
				By.xpath("(//div[@class='MuiTypography-root MuiPickersYear-root MuiTypography-subtitle1'])[64]"));
		JavascriptExecutor erfff = (JavascriptExecutor) driver;
		erfff.executeScript("arguments[0].click();", mvsvfff);
		TakesScreenshot anewc = (TakesScreenshot) driver;

		File bnewc = anewc.getScreenshotAs(OutputType.FILE);
		File cnewc = new File("C:\\Users\\dines\\eclipse-workspace\\Selenium\\Screenshots\\web.png2");
		FileUtils.copyFile(bnewc, cnewc);
		Thread.sleep(1000);
		WebElement mvsvfffx = driver.findElement(By.xpath("(//button[@class='passanger-info-save-button'])[1]"));
		JavascriptExecutor erfffx = (JavascriptExecutor) driver;
		erfffx.executeScript("arguments[0].click();", mvsvfffx);
		Thread.sleep(2000);
		WebElement mvsvfffxx = driver.findElement(By.xpath("(//button[@class='passanger-info-save-button'])[6]"));
		JavascriptExecutor erfffxx = (JavascriptExecutor) driver;
		erfffxx.executeScript("arguments[0].click();", mvsvfffxx);

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@placeholder='DOB(DD/MM/YYYY)'])[1]")).sendKeys("06/05/1999");

		driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[1]")).sendKeys("DonDon");

		WebElement mvsvb = driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[2]"));
		JavascriptExecutor erb = (JavascriptExecutor) driver;
		erb.executeScript("arguments[0].click();", mvsvb);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[2]")).sendKeys("D");

		WebElement mvsvqb = driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[3]"));
		JavascriptExecutor erqb = (JavascriptExecutor) driver;
		erqb.executeScript("arguments[0].click();", mvsvqb);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[3]"))
				.sendKeys("dineshkasiraman@gmail03011995.com");

		WebElement mvsvfb = driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[4]"));
		JavascriptExecutor erfb = (JavascriptExecutor) driver;
		erfb.executeScript("arguments[0].click();", mvsvfb);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[4]")).sendKeys("9842625549");
		driver.findElement(By.xpath("(//input[@class='jss11'])[1]")).click();

		driver.findElement(By.xpath("(//button[@class='passanger-info-save-button'])[1]")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@placeholder='DOB(DD/MM/YYYY)'])[1]")).sendKeys("06/02/1998");

		driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[1]")).sendKeys("yuvanDarma");

		WebElement mvsvbg = driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[2]"));
		JavascriptExecutor erbg = (JavascriptExecutor) driver;
		erbg.executeScript("arguments[0].click();", mvsvbg);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[2]")).sendKeys("H");

		WebElement mvsvqbg = driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[3]"));
		JavascriptExecutor erqbg = (JavascriptExecutor) driver;
		erqbg.executeScript("arguments[0].click();", mvsvqbg);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[3]"))
				.sendKeys("ydharma@gmail03011995.com");

		WebElement mvsvfbg = driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[4]"));
		JavascriptExecutor erfbg = (JavascriptExecutor) driver;
		erfbg.executeScript("arguments[0].click();", mvsvfbg);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[4]")).sendKeys("8882625549");
		driver.findElement(By.xpath("(//input[@class='jss11'])[1]")).click();
		Thread.sleep(1000);
		WebElement mvsvfbgu = driver.findElement(By.xpath("(//button[@class='passanger-info-save-button'])[1]"));
		JavascriptExecutor erfbgu = (JavascriptExecutor) driver;
		erfbgu.executeScript("arguments[0].click();", mvsvfbgu);
		// adult
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@placeholder='DOB(DD/MM/YYYY)'])[1]")).sendKeys("06/02/1998");

		driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[1]")).sendKeys("rajaDarma");

		WebElement mvsvbgt = driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[2]"));
		JavascriptExecutor erbgt = (JavascriptExecutor) driver;
		erbgt.executeScript("arguments[0].click();", mvsvbgt);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[2]")).sendKeys("H");

		WebElement mvsvqbgt = driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[3]"));
		JavascriptExecutor erqbgt = (JavascriptExecutor) driver;
		erqbgt.executeScript("arguments[0].click();", mvsvqbgt);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[3]"))
				.sendKeys("rdharma@gmail03011995.com");

		WebElement mvsvfbgt = driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[4]"));
		JavascriptExecutor erfbgt = (JavascriptExecutor) driver;
		erfbgt.executeScript("arguments[0].click();", mvsvfbgt);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[4]")).sendKeys("8882625549");
		driver.findElement(By.xpath("(//input[@class='jss11'])[1]")).click();

		WebElement mvsvbglj = driver.findElement(By.xpath("(//button[@class='passanger-info-save-button'])[1]"));
		JavascriptExecutor erbglj = (JavascriptExecutor) driver;
		erbglj.executeScript("arguments[0].click();", mvsvbglj);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@placeholder='DOB(DD/MM/YYYY)'])[1]")).sendKeys("06/02/2015");

		driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[1]")).sendKeys("vishal");

		WebElement mvsvbgl = driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[2]"));
		JavascriptExecutor erbgl = (JavascriptExecutor) driver;
		erbgl.executeScript("arguments[0].click();", mvsvbgl);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[2]")).sendKeys("s");

		WebElement mvsvqbgl = driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[3]"));
		JavascriptExecutor erqbgl = (JavascriptExecutor) driver;
		erqbgl.executeScript("arguments[0].click();", mvsvqbgl);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[3]"))
				.sendKeys("vikharma@gmail03011995.com");

		WebElement mvsvfbgl = driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[4]"));
		JavascriptExecutor erfbgl = (JavascriptExecutor) driver;
		erfbgl.executeScript("arguments[0].click();", mvsvfbgl);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[4]")).sendKeys("8582625549");
		driver.findElement(By.xpath("(//input[@class='jss11'])[1]")).click();
		Thread.sleep(1000);
		WebElement mvsvfbguk = driver.findElement(By.xpath("(//button[@class='passanger-info-save-button'])[1]"));
		JavascriptExecutor erfbguk = (JavascriptExecutor) driver;
		erfbguk.executeScript("arguments[0].click();", mvsvfbguk);

		// student

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@placeholder='DOB(DD/MM/YYYY)'])[1]")).sendKeys("06/02/1999");

		driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[1]")).sendKeys("rajeshkumar");

		WebElement mvsvbglp = driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[2]"));
		JavascriptExecutor erbglp = (JavascriptExecutor) driver;
		erbglp.executeScript("arguments[0].click();", mvsvbglp);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[2]")).sendKeys("s");

		WebElement mvsvqbglp = driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[3]"));
		JavascriptExecutor erqbglp = (JavascriptExecutor) driver;
		erqbglp.executeScript("arguments[0].click();", mvsvqbglp);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[3]"))
				.sendKeys("krajesh@gmail03011995.com");

		WebElement mvsvfbglp = driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[4]"));
		JavascriptExecutor erfbglp = (JavascriptExecutor) driver;
		erfbglp.executeScript("arguments[0].click();", mvsvfbglp);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='passanger-info-form-input'])[4]")).sendKeys("8782625549");
		driver.findElement(By.xpath("(//input[@class='jss11'])[1]")).click();
		Thread.sleep(1000);
		WebElement mvsvfbgukk = driver.findElement(By.xpath("(//button[@class='passanger-info-save-button'])[1]"));
		JavascriptExecutor erfbgukk = (JavascriptExecutor) driver;
		erfbgukk.executeScript("arguments[0].click();", mvsvfbgukk);

		TakesScreenshot anewcw = (TakesScreenshot) driver;

		File bnewcw = anewcw.getScreenshotAs(OutputType.FILE);
		File cnewcw = new File("C:\\Users\\dines\\eclipse-workspace\\Selenium\\Screenshots\\web.png3");
		FileUtils.copyFile(bnewcw, cnewcw);

		WebElement mvsvfbgukkg = driver.findElement(By.xpath("//button[@class='pi-continue-btn']"));
		JavascriptExecutor erfbgukkg = (JavascriptExecutor) driver;
		erfbgukk.executeScript("arguments[0].click();", mvsvfbgukkg);

	}
}
