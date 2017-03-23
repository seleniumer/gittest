package com.doudou.uu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Chrome2Test {
	private WebDriver driver;

	@BeforeClass
	public void beforeClass()  {
		 System.setProperty("webdriver.chrome.driver","D:\\autotest\\driver\\chromedriver.exe");		
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

	@Test
	public void f() throws InterruptedException {
		driver.get("http://www.baidu.com");
		WebElement searchBox = driver.findElement(By.id("kw"));
		WebElement searchButton = driver.findElement(By.id("su"));
		searchBox.sendKeys("webdriver");
		searchButton.click();
		Thread.sleep(3000);
		Assert.assertEquals("webdriver_°Ù¶ÈËÑË÷", driver.getTitle());
	}

}
