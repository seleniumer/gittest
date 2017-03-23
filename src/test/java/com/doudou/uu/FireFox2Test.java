package com.doudou.uu;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class FireFox2Test {
	private WebDriver driver;

  @BeforeMethod
  public void beforeMethod() {
	driver=new FirefoxDriver();
  }

  @AfterMethod
  public void afterMethod() {
		driver.quit();
  }

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver","D:\\autotest\\driver\\geckodriver.exe");
  }

  @AfterClass
  public void afterClass() {
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
