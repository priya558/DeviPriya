package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testingmaslogin {
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.name("Submit")).click();	
	}

}
