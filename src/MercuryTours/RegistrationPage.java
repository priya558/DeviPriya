package MercuryTours;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElementByPartialLinkText("REGISTER").click();
		driver.findElement(By.name("firstName")).sendKeys("devipriya");
		driver.findElement(By.name("lastName")).sendKeys("Nandigam");
		driver.findElement(By.name("phone")).sendKeys("9490497623");
		driver.findElement(By.id("userName")).sendKeys("devipriya.nandigam@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("svr ladies hostel,opposite jntu road,pragathi nagar road,kphb,hyderabad");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.name("state")).sendKeys("Telengana");
		driver.findElement(By.name("postalCode")).sendKeys("500070");
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("INDIA");
		driver.findElement(By.name("email")).sendKeys("priya558");
		driver.findElement(By.name("password")).sendKeys("manohar@558");
		driver.findElement(By.name("confirmPassword")).sendKeys("manohar@558");
		driver.findElement(By.name("register")).click();
		
	}

}
