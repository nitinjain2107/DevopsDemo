package com;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Demo01 {
	WebDriver driver;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/macbookair/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
		
		
		
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	
	@Test
	public void test() throws InterruptedException {
		
		driver.findElement(By.id("search")).sendKeys("Covid-19");
		
		driver.findElement(By.id("search-icon-legacy")).click();
		
		
		
		
		
	}

}
