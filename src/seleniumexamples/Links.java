package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links {

	public static void main(String[] args){
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create an account")).click();
		//driver.navigate().back();
		driver.findElement(By.linkText("Forgotten account?")).click();
}

}
