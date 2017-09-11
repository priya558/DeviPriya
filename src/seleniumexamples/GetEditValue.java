package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetEditValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.name("email"));
		email.clear();
		email.sendKeys("devipriya.nandigam@gmail.com");
		String val = email.getAttribute("value");
		System.out.println(val);
		}

}
