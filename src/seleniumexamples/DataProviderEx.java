package seleniumexamples;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DataProviderEx {
	WebDriver driver;
	
  @Test(dataProvider = "googlesearch")
  public void searchMethod(String author, String searchkey) {
	  WebElement searchText = driver.findElement(By.name("q"));
	  searchText.sendKeys(searchkey);
	  searchText.clear();
  }

  @DataProvider(name = "googlesearch")
  public Object[][] getDataFromDataProvider() {
    return new Object[][] {
      new Object[] { "tmasters1", "USA" },
      new Object[] { "tmasters1", "India" },
      new Object[] { "tmasters1", "UK" },
    };
  }
  @BeforeClass
  public void launchApp() {
	  System.setProperty("Webdriver.firefox","C:\firefox.exe");
	  driver= new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.google.co.in/");
	  }

  //@AfterClass
  //public void afterClass() {
  //}

 // @BeforeTest
  //public void beforeTest() {
  //}

  //@AfterTest
  //public void afterTest() {
  //}

}
