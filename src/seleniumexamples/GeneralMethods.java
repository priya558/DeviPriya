package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeneralMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement Gender = driver.findElement(By.id("u_0_g"));
		//Verify wheater element is displayed or not
		if(Gender.isDisplayed())
			System.out.println("Displayed");
		else
			System.out.println("Not Displayed");
		//Verify wheater element is enabled or not
		if(Gender.isEnabled())
			System.out.println("Enabled");
		else
			System.out.println("Not Enabled");
		//Verify element is selected or not
		if(Gender.isSelected())
			System.out.println("Selected");
		else
			System.out.println("Not Selected");
	}
}

	
