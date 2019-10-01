package com.test;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;

//import selenium_day3.driver_utility;

public class table_demo1 {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\browser drivers\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	// WebDriver driver=driver_utility.getDriver("chrome");
	  String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
			  driver.navigate().to(url);
	  driver.manage().window().maximize();
	 // driver.manage().timeout.implicitlyWait(10,TimeUnit.SECONDS);
	 // driver.navigate().refresh();
	  System.out.println("the title of the webpage is"+driver.getTitle());
	  driver.findElement(By.linkText("SignIn")).click();
	  driver.findElement(By.id("userName")).sendKeys("lalitha");
	  driver.findElement(By.id("password")).sendKeys("password123");
	  driver.findElement(By.name("Login")).click();
	  driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[4]/a/span")).click();
	  WebElement objtable=driver.findElement(By.xpath("html/body/b/section/div"));
	  
	  List<WebElement> Allrows=objtable.findElements(By.tagName("tr"));
	  for(int n = 1;n<Allrows.size();n++)
	  {
		  List<WebElement> cells=Allrows.get(n).findElements(By.tagName("td"));
		  System.out.println("Orderid : " +cells.get(0).getText());
		  System.out.println("date of order :"+cells.get(2).getText());
		  		
	  }
	  
	 
  }
}
