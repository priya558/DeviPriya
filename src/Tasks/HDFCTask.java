package Tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HDFCTask {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.hdfcbank.com/");
		//move the mouse towards products 
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Actions builder = new Actions(driver);
		 Action mouseoverproducts = builder.moveToElement(driver.findElement(By.linkText("Products"))).build();
		 mouseoverproducts.perform();
		 
		 Actions cards = new Actions(driver);
		 Action mousemoments = cards.moveToElement(driver.findElement(By.linkText("Cards"))).build();
		 mousemoments.perform();
		 
		 Actions creditcards = new Actions(driver);
		 Action mousemoves = creditcards.moveToElement(driver.findElement(By.linkText("Credit Cards"))).build();
		 mousemoves.perform();
		 
		 driver.findElement(By.linkText("Credit Cards")).click();
		 if(driver.getPageSource().contains("Presenting, a Credit Card for every need"))
		 {
			 System.out.println("Test Present");
		 }
		 else
		 {
			 System.out.println("Text not Present");
		 }
		 WebElement range = driver.findElement(By.name("rdoCat"));
		//verify whether it is displayed or not
		if(range.isEnabled())
		{
				 System.out.println("Enabled");
		}
		else
		{
				 System.out.println("not Enabled");
		}
	}

}
