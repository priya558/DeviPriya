package Javaadvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver = null;
	try{
		driver =  new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		driver.findElement(By.name("txtUsername")).sendKeys("user01");
		driver.findElement(By.name("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.id("btnLogin")).click();
		}
	catch(Exception e)
	{
		System.out.println("HRM Login Failed");
	}
	finally{
		driver.quit();
		
	}
	

	}

}
