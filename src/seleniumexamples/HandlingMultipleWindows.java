package seleniumexamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class HandlingMultipleWindows {
	WebDriver driver;
  @Before
  public void Login() {
	  driver = new FirefoxDriver();
	  String URL = "https://www.online.citibank.co.in/";
	  driver.get(URL);
	  driver.manage().window().maximize();
   }

  @Test
  public void afterMethod() {
	  driver.findElement(By.xpath("//*[@id='container']/div[2]/div[2]/div/div[1]/div[1]/p[2]/a[1]/img")).click();
	  String ParentWindow = driver.getWindowHandle();
	  for(String Chlidwindow:driver.getWindowHandles())
	  {
		  driver.switchTo().window(Chlidwindow);
	  }
	  System.out.println(driver.findElement(By.xpath("//*[@id='main-wrapper']/div/div[2]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[1]")).getText());
	  driver.switchTo().window(ParentWindow);
	  driver.close();
  
  }
}
