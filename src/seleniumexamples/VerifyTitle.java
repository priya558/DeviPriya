package seleniumexamples;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		WebElement gmaillink = driver.findElement(By.linkText("Google"));
		assertEquals("http://www.google.com",driver.getTitle());
		

	}

}
