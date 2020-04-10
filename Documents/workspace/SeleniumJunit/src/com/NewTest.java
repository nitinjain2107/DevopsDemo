package com;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class NewTest {
	WebDriver driver;
	

	
@BeforeSuite
@Parameters({"url","browserName"})
public void setup(String url, @Optional("Chrome") String browsername){
//	System.out.println("url "+url);
//	System.out.println("browsername "+browsername);
	if(browsername.equals("Chrome")){
		System.setProperty("webdriver.chrome.driver", "/Users/macbookair/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	
	
}
@DataProvider(name="getData")
public Object[][] getData(){
	Object[][] data =new Object[2][2];
	data[0][0]="UVrays1991";
	data[0][1]="Rajul@4321";
	data[1][0]="UVrays1991";
	data[1][1]="Rajul@4321";
	
	
	
	return data ;
	
}
  @Test(dataProvider="getData")
  public void f(String username, String Password) {
	  
	  driver.findElement(By.name("username")).sendKeys(username);
	  driver.findElement(By.name("password")).sendKeys(Password);
	  
	  //new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("sqdOP  L3NKy   y3zKF")));
	
	  
	 // driver.findElement(By.xpath(xpathExpression))
	  
	  
	  
  }
  
 @AfterSuite
 public void teardown(){
	 driver.close();
	 
	 
 }
}
